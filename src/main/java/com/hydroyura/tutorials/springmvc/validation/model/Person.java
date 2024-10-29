package com.hydroyura.tutorials.springmvc.validation.model;

import lombok.Data;

@Data
public class Person {

    private String name;
    private String surname;
    private Integer age;
    private Male male;
    private Job job;
    private Address address;


    public enum Male {
        MEN, WOMEN
    }
}
