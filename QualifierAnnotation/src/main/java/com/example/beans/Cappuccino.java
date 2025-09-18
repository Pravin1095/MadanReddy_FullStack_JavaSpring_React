package com.example.beans;

import com.example.beans.Coffee;
import org.springframework.stereotype.Component;

@Component
public class Cappuccino implements Coffee {
    @Override
    public String makeCoffee(){
        return "Cappucino";
    }
}