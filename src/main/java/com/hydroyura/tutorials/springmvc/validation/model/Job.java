package com.hydroyura.tutorials.springmvc.validation.model;

import lombok.Data;

@Data
public class Job {

    private Address address;
    private String company;
    private String position;

}
