package com.test;

import com.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
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

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        Person person = new Person();
        person.setAge(20);
        people.add(person);
        int i = 10;
        int j = i >> 2;
        System.out.println(j);
        String str1 = "3333";
        str1.equals("3333");

        Map<String, Person> peoples = new HashMap<>();
        peoples.put("111",person);
    }

}
