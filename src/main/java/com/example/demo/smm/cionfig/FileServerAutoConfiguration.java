package com.example.demo.smm.cionfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author bby15929
 * @date 2020年07月16日13:10:43
 */
//相当于一个普通的 java 配置类
@Configuration
//当 NoahFsManager 在类路径的条件下
@ConditionalOnClass({ BaseManager.class })
//将 application.properties 的相关的属性字段与该类一一对应，并生成 Bean
@EnableConfigurationProperties(BaseConfig.class)
public class FileServerAutoConfiguration {

    // 注入属性类
    @Autowired
    private BaseConfig baseConfig;

    @Bean
// 当容器没有这个 Bean 的时候才创建这个 Bean
    @ConditionalOnMissingBean(BaseManager.class)
    public BaseManager noahFsManager() {
        return BaseManager.getInstance();
    }
}
