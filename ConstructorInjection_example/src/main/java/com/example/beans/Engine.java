package com.example.beans;

import org.springframework.stereotype.Component;
import jakarta.annotation.PostConstruct;


@Component
public class Engine{


        private String name;

    public Engine (){
            System.out.println("Engine bean created by Spring");
        }

        public String getName(){
            return  name;
        }

        public void setName(String name){

            this.name = name;
        }

        @PostConstruct
        public void initialize (){
        this.name = "V8";
    }
    }
