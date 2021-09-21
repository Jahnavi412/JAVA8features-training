package com.learning.java11practice.programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

public class PrimeNumbers {

  public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      Integer n = Integer.parseInt(br.readLine());
      Integer n1 = Integer.parseInt(br.readLine());
      System.out.println(n + " Is prime number: " + isPrime(n));
  }

    private static boolean isPrime(Integer n) {
      int nth = n/2;
      return (n>1) && (IntStream.range(2, nth).noneMatch(i -> nth%i==0));
    }
}
