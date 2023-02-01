package com.test.thread;

public class VolatileDemo {

    private volatile boolean started = false;
    int value = 0;
    public void startSystem(){
        System.out.println(Thread.currentThread().getName()+" begin to start system, time:"+System.currentTimeMillis());
        //value = 1;
       /* try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }*/
        started = true;
        System.out.println(Thread.currentThread().getName()+" success to start system, time:"+System.currentTimeMillis());
    }

    public void checkStartes(){
       /* try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }*/
        if (started){
            //int val = value + 1;
            System.out.println("system is running, time:"+System.currentTimeMillis());
            //System.out.println(val);
        }else {
            //int val = value+1;
            System.out.println("system is not running, time:"+System.currentTimeMillis());
            //System.out.println(val);
        }
    }

    public static void main(String[] args) {
        VolatileDemo demo = new VolatileDemo();
        Thread startThread = new Thread(new Runnable() {
            @Override
            public void run() {
                /*try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }*/demo.startSystem();
            }
        });
        startThread.setName("start-Thread");

        Thread checkThread = new Thread(new Runnable() {
            @Override
            public void run() {
                //while (true){
                    /*try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }*/
                    System.out.println("loop check...");
                    demo.checkStartes();
               // }
            }
        });
        checkThread.setName("check-Thread");
        startThread.start();
        try {
            checkThread.wait();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        checkThread.start();
    }

}