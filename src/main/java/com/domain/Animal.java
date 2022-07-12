package com.domain;

import org.springframework.stereotype.Component;

@Component
public class Animal implements World{

    private String zhonglei;

    public void run(){
        System.out.println("跑起来！");
    }

    public String getZhonglei() {
        return zhonglei;
    }

    public void setZhonglei(String zhonglei) {
        this.zhonglei = zhonglei;
    }
}
