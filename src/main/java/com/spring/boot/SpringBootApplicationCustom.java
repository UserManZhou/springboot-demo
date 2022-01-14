package com.spring.boot;

import com.spring.boot.entity.Person;
import com.spring.boot.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

import java.util.logging.Logger;

@SpringBootApplication
//@Import(User.class)
//@ImportResource(value = "classpath:bean.xml")
@EnableConfigurationProperties(Person.class)
@Slf4j
public class SpringBootApplicationCustom {

    private static  final Logger LOGGER = Logger.getLogger(SpringBootApplicationCustom.class.getName());

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(SpringBootApplicationCustom.class, args);
//        User bean = run.getBean(User.class);
//        User bean1 = run.getBean(User.class);
//        System.out.println(bean == bean1);
//
//        SpringConfig bean2 = run.getBean(SpringConfig.class);
//        User user = bean2.user();
//        User user1 = bean2.user();
//        System.out.println(user == user1);
//        String[] beanDefinitionNames = run.getBeanDefinitionNames();
//
//        for (String name : beanDefinitionNames) {
////            System.out.println(name);
//
////            LOGGER.info(name);
//
//        }
          // @Import注解使用
//        String[] beanNamesForType = run.getBeanNamesForType(User.class);

//        for (String s : beanNamesForType) {
//            System.out.println(s);
//        }

//        boolean user = run.containsBean("User");
//        boolean user1 = run.containsBean("user");
//        log.info(String.valueOf(user));
//        System.out.println(user);
//        System.out.println(user1);
//        int beanDefinitionCount = run.getBeanDefinitionCount();
//        System.out.println(beanDefinitionCount);
        Person bean = run.getBean(Person.class);
        System.out.println(bean.toString());

    }
}
