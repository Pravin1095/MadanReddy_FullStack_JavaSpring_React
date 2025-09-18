package com.example.main;

import com.example.beans.MyService;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringMain {

    public static void main(String[] args) {
var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
MyService service1 = context.getBean(MyService.class);
MyService service2 = context.getBean(MyService.class);
System.out.println(service1 == service2); //Comparing hash code. It gives same object reference as bean created is singleton

//        Vehicle audivehicle = context.getBean("audivehicle",Vehicle.class);
//        System.out.println("Vehicle name " +  audivehicle.getName());
//
//        Vehicle benzvehicle = context.getBean("benzvehicle",Vehicle.class);
//        System.out.println("Vehicle name " +  benzvehicle.getName());


//        String hello = context.getBean(String.class);
//        System.out.println("String name " +  hello);
//
//        Integer number = context.getBean(Integer.class);
//        System.out.println("Number name " +  number);
    }
}
