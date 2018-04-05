package com.mulanfan.shopasa.config;

import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = "com.mulanfan.shopasa")
public class FeignConfiguration {

}
