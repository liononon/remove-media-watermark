package com.lpc.media.quick.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.lpc.media.quick.pojo.domain.WechatUser;

/**
 * @author: liupengcheng
 * @email: liupengcheng@zork.com.cn
 * @date: 2023/1/3 21:44
 * @description：
 */
@Repository
public interface WechatUserRepository extends JpaRepository<WechatUser,Long> {
    WechatUser findByUnionId(String unionId);
    WechatUser findByOpenId(String openId);
}
