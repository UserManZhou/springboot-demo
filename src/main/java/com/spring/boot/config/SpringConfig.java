package com.spring.boot.config;

import com.spring.boot.entity.User;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

@Configuration(proxyBeanMethods = false)//(proxyBeanMethods = true)
@ComponentScan(
        useDefaultFilters = false,
        basePackages = "com.spring.boot",
        includeFilters = {
                @ComponentScan.Filter(type = FilterType.ANNOTATION,classes = Controller.class),
                @ComponentScan.Filter(type = FilterType.ANNOTATION,classes = RestController.class)
        }
)
public class SpringConfig {

        @Bean("User")
//        @Scope("prototype")
        public User user(){
                return new User(1,"xioatian", 22);
        }

}
