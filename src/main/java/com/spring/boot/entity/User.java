package com.spring.boot.entity;

import lombok.*;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Data
//@PropertySource()
@ConfigurationProperties(prefix = "user")
@Component
public class User {
    private int id;
    private String name;
    private int age;


}
