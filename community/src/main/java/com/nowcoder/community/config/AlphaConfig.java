package com.nowcoder.community.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.text.SimpleDateFormat;

@Configuration
public class AlphaConfig {
    @Bean
    public SimpleDateFormat simpleDateFormat(){//方法返回的值会被装配到容器中，名字是方法名
        return new  SimpleDateFormat("yyyy–MM-dd HH:mm:ss");
    }
}
