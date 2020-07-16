package com.example.demo.smm;

import com.example.demo.smm.cionfig.FileServerAutoConfiguration;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.retry.annotation.EnableRetry;

@MapperScan("com.example.demo.smm.mapper")
@SpringBootApplication
@EnableRetry
@ComponentScan(excludeFilters = {@ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE,classes = {FileServerAutoConfiguration.class})})
public class SpringbootMysqlMybatisDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMysqlMybatisDemoApplication.class, args);
    }

}
