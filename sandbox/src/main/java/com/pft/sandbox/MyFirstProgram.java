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

    Square s = new Square(5);
    System.out.println("Ploscha kvadrata" + " = " + s.area());

    Rectangle r = new Rectangle(4, 5);
    System.out.println("Ploscha pryamoygolnika" + " = " + r.area());
  }

  public static void hello(String somebody) {
    System.out.println("Hello, " + somebody + "!");
  }


}

