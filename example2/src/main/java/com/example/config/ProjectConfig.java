package com.example.config;

import com.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfig {

    @Bean(name="teslavehicle")
    Vehicle vehicle1(){
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Tesla");
        return vehicle;

    }

    @Bean (value="audivehicle")
    Vehicle vehicle2(){
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Audi");
        return vehicle;

    }
    @Primary
    @Bean("benzvehicle")
    Vehicle vehicle3(){
        Vehicle vehicle  = new Vehicle();
        vehicle.setName("Benz");
        return vehicle;
    }

    @Bean
    String hello(){
        return "hello";
    }

    @Bean
    Integer number (){
        return 10;
    }

}
