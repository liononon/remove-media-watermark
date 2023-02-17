package com.lpc.media.quick.controller;

import cn.binarywang.wx.miniapp.api.WxMaService;
import cn.binarywang.wx.miniapp.bean.WxMaJscode2SessionResult;
import cn.binarywang.wx.miniapp.bean.WxMaUserInfo;
import cn.binarywang.wx.miniapp.util.WxMaConfigHolder;
import com.alibaba.fastjson.JSONObject;
import com.lpc.media.quick.annotation.ApiLog;
import com.lpc.media.quick.pojo.vo.WechatLoginRequest;
import lombok.AllArgsConstructor;
import me.chanjar.weixin.common.error.WxErrorException;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.lpc.media.quick.pojo.domain.WechatUser;
import com.lpc.media.quick.repository.WechatUserRepository;

/**
 * 微信小程序用户接口
 *
 * @author <a href="https://github.com/binarywang">Binary Wang</a>
 */
@RestController
@AllArgsConstructor
@RequestMapping("/auth")
public class UserController {

    private final WxMaService wxMaService;
    private final WechatUserRepository wechatUserRepository;

    /**
     * 登陆接口
     */
    @PostMapping("/login")
    @ApiLog
    public String login(@Validated @RequestBody WechatLoginRequest loginRequest) {

        try {
            WxMaJscode2SessionResult session = wxMaService.getUserService().getSessionInfo(loginRequest.getCode());
            String sessionKey = session.getSessionKey();

            // 用户信息校验
            if (!wxMaService.getUserService().checkUserInfo(sessionKey, loginRequest.getRawData(), loginRequest.getSignature())) {
                WxMaConfigHolder.remove();
            }

            // 用户信息
            WxMaUserInfo userInfo = wxMaService.getUserService().getUserInfo(sessionKey, loginRequest.getEncryptedData(), loginRequest.getIv());
            WxMaConfigHolder.remove();

            WechatUser wechatUser = wechatUserRepository.findByOpenId(session.getOpenid());
            if (wechatUser == null){
                WechatUser wechatUserSave = new WechatUser();
                wechatUserSave.setNickname(userInfo.getNickName());
                wechatUserSave.setOpenId(session.getOpenid());
                wechatUserRepository.save(wechatUserSave);
            }

            JSONObject jsonObject = new JSONObject();
            jsonObject.put("data",sessionKey);
            return jsonObject.toJSONString();

        } catch (WxErrorException e) {
            return e.toString();
        } finally {
            WxMaConfigHolder.remove();
        }
    }

}
