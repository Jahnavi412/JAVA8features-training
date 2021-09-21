package com.learning.java11practice.programs;

public class ThreadExample {

  public static void main(String[] args) {

      Thread t = new Thread(()->System.out.println("Thread start"));
      t.start();

      /*ThreadJava7Example t1 = new ThreadJava7Example();
      t1.run();*/
  }
}
