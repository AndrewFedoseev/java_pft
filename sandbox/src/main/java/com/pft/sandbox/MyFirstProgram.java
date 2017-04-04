package com.pft.sandbox;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by Andrew on 4/2/2017.
 */
public class MyFirstProgram {
  public static void main(String[] args) {
    hello("world");
    hello("Andrew");
    hello("Alex");

    double l = 5;
    System.out.println("Ploscha kvadrata" + " = " + area(l));

    double a = 4;
    double b = 5;
    System.out.println("Ploscha pryamoygolnika" + " = " + area(a, b));
  }

  public static void hello(String somebody) {
    System.out.println("Hello, " + somebody + "!");
  }

  public static double area(double len) {
    return len * len;
  }

  public static double area(double a, double b) {
    return a * b;

  }
}

