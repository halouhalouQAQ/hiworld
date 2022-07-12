package com.test.dto;

import org.springframework.stereotype.Component;

@Component
public class Apple {

    public String pinzhong;

    public void grow(){
        System.out.println("生长中！");
    }
}
