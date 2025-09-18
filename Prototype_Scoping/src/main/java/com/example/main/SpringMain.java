package com.example.main;

import com.example.beans.UserSession;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringMain {

    public static void main(String[] args) {
var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
UserSession user1 = context.getBean(UserSession.class);
UserSession user2 = context.getBean(UserSession.class);
System.out.println(user1==user2);
System.out.println(user1.getUid()  +' '+ user2.getUid());

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
