package com.learning.java11practice.programs.java8features.functionalinterface;

public class FInterface1TestMain {

    public FInterface1TestMain(String msg) {
        FInterface1 fn = msg1 -> "Hello " + msg1;
        System.out.println(fn.hello(msg));
    }
}
