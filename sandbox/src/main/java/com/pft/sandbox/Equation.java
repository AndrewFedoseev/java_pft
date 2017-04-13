package com.pft.sandbox;

/**
 * Created by Andrew on 4/12/2017.
 */
public class Equation {
  private double a;
  private double b;
  private double c;
  private int n;

  Equation(double a, double b, double c) {
    this.a = a;
    this.b = b;
    this.c = c;

    double d = b * b - 4 * a * c;

    if (a == 0)
      System.out.println("Print");

    if (d > 0) {
      n = 2;
    } else if (d == 0) {
      n = 1;
    } else {
      n = 0;
    }
  }

  public int rootNumber() {
    return n;
  }
}

