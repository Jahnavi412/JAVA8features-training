package com.learning.java11practice.programs.java8features.functionalinterface;

import com.learning.java11practice.programs.ThreadExmapleUsingThreadClass;

public class FInterfaceTestMain {

  public static void main(String[] args) {

      FInterface add = (x,y) -> x+y;

      System.out.println(add.operator(2,3));

      FInterface sub = (x,y) -> x-y;
      System.out.println(sub.operator(4,3));
      FunctionalInterface1 f1 = () -> System.out.println(23);
      f1.hello();
      FunctionalInterface2 f2 = (a) -> a+2;
     System.out.println (f2.f1(5));
     Runnable r = () -> System.out.println(24);
     r.run();

      /*FInterface1TestMain fn1 = new FInterface1TestMain("JANU");*/

      ThreadExmapleUsingThreadClass t1 = new ThreadExmapleUsingThreadClass();
      t1.start();


      Thread t2 = new Thread(() -> System.out.println("t2"));
      t2.run();



  }
}
