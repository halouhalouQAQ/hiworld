package com.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class Demo01 {

    @Autowired
    private ApplicationContext applicationContext;

    public final List<Fruit> fruits = new ArrayList<>();

    public Demo01(List<Fruit> fruits){
        for(Fruit fruit:fruits){
            this.fruits.add(fruit);
        }
    }

    public void aa(){
        System.out.println(fruits.toString());
    }
}
