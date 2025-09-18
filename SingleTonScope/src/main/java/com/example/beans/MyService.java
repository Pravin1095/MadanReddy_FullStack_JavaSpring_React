package com.example.beans;

import org.springframework.stereotype.Component;

@Component
public class MyService{
    public MyService(){
        System.out.println("Service called");
    }
}