package com.company;

public class QuadraticEquation {
    private double a,b,c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public String Getter() {
        return "a = " + a + " b = " + b + "c = " + c;
    }

    public double  getDiscriminant() {
        return Math.pow(this.b, 2) - 4 * a * c;
    }

    public double getRoot1() {
        return (-this.b - Math.pow(this.getDiscriminant(),0.5)) / (2 * this.a);
    }

    public double getRoot2() {
        return (-this.b + Math.pow(this.getDiscriminant(),0.5)) / (2 * this.a);
    }
}
