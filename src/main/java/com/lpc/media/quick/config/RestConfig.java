package com.lpc.media.quick.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author: liupengcheng
 * @email: liupengcheng@zork.com.cn
 * @date: 2023/1/3 21:10
 * @description：
 */
@Configuration
public class RestConfig {
    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
