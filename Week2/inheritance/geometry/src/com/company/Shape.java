package com.company;

public class Shape {
   private String color;
    private  boolean filled;

    public Shape() {
        System.out.println("Shape()");
        color = "green";
        filled = true;
    }

    public Shape(String color, boolean filled) {
        System.out.println("Shape(String color, boolean filled) ");
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public boolean getFilled() {
        return filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String toString() {
        if (filled) {
            return "A Shape with color of " + color + " and filled";
        } else {
            return "A Shape with color of " + color + " and not filled";
        }
    }
}
