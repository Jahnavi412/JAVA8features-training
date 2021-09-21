package com.learning.java11practice.programs;

public class ThreadExmapleUsingThreadClass extends Thread{

    @Override
    public synchronized void start() {
        super.start();
        System.out.println("T1");

    }
}
