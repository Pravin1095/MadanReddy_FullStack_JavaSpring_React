package com.example.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import jakarta.annotation.PostConstruct;

@Component
public class Vehicle {

    private String name;
//    @Autowired(required = false)  // Autowired tells that vehicle is dependency for engine, the false field tells not to throw any error if Engine instance is absent
    private final Engine engine;

    @Autowired
    public Vehicle(Engine engine){
        this.engine = engine;
        System.out.println("Vehicle bean created by Spring");
    }
//    public Vehicle (){
//        System.out.println("Vehicle bean created by Spring");
//    }

    public Engine getEngine(){
        return engine;
    }

    public void setEngine(Engine engine){
        this.engine = engine;
    }

    public String getName(){
        return  name;
    }

    public void setName(String name){

        this.name = name;
    }



    @PostConstruct
    public void initialize(){
        this.name = "Kia";
    }
}
