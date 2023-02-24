package io.liononon.media.quick.factory;

import io.liononon.media.quick.exception.CustomerException;
import io.liononon.media.quick.mediaApiService.BaseMediaApi;
import io.liononon.media.quick.util.SpringContextUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.SmartInitializingSingleton;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 解析接口工厂类
 *
 */
@Slf4j
@Component
public class MediaApiFactory implements SmartInitializingSingleton {

    final private List<BaseMediaApi> mediaApis;

    public MediaApiFactory() {
        mediaApis = new ArrayList<>();
    }
    public void add(BaseMediaApi baseMediaApi) {
        mediaApis.add(baseMediaApi);
    }

    public BaseMediaApi getMediaApi(String flag) {
        BaseMediaApi baseMediaApiFound = null;
        for(BaseMediaApi baseMediaApi: mediaApis) {
            if (baseMediaApi.canParse(flag)) {
                baseMediaApiFound = baseMediaApi;
            }
        }
        if (baseMediaApiFound == null) {
            throw new CustomerException("无法处理该链接");
        }
        return baseMediaApiFound;
    }

    @Override
    public void afterSingletonsInstantiated() {
        log.info("正在装载mediaApiFactory...");
        DefaultListableBeanFactory beanFactory = (DefaultListableBeanFactory) ((ConfigurableApplicationContext) SpringContextUtil.getApplicationContext()).getBeanFactory();
        String[] beanNames = beanFactory.getBeanNamesForType(BaseMediaApi.class);
        Arrays.stream(beanNames).forEach(beanName -> {
            this.add(((BaseMediaApi) SpringContextUtil.getBean(beanName)));
            log.info(String.format("装载 [%s]", beanName));
        });
        log.info("装载mediaApiFactory结束");
    }
}
