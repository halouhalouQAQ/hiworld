package com.test.thread;

import java.util.concurrent.atomic.AtomicInteger;

public class VolatileDemo01 {

    boolean started = false;

    public void startExe(){
        System.out.println(Thread.currentThread().getName()+"====System is begin");
        started = true;
        System.out.println(Thread.currentThread().getName()+"====System is succeed");
        System.out.println("此时"+started);
    }
    public void checkExe(){
        System.out.println("此时检查==="+started);
        if(started){
            System.out.println(Thread.currentThread().getName()+"====Check is succeed");
        }else{
            System.out.println(Thread.currentThread().getName()+"====Check is false");
        }
    }

    public static void main(String[] args) {
        VolatileDemo01 volatileDemo01 = new VolatileDemo01();
        String aaa = "3434";
        Thread thread1 = new Thread(
                ()->{
                    volatileDemo01.startExe();
                }
        );
        thread1.setName("start-Thread");
        Thread thread2 = new Thread(() ->{
                while (true) {
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("loop check...");
                    volatileDemo01.checkExe();

                }
        });
        thread2.setName("check-Thread");
        thread1.start();
        thread2.start();
    }
}
