package com.example.main;

import com.example.beans.Coffee;
import com.example.beans.CoffeeShop;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringMain {

    public static void main(String[] args) {
var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
CoffeeShop shop = context.getBean(CoffeeShop.class);
Coffee coffee = context.getBean(Coffee.class);
System.out.println("Coffee that coffeeshops use is " +  shop.getCoffee().makeCoffee());

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
