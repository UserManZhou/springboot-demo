package com.spring.boot.entity;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Pet {
    private String name;
    private Double weight;
}
