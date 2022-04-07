package com.company;

public class Square extends Rectangle{
    public Square(double side) {
       super(side,side);
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }

    public Square() {
        super();
    }
    
    public void setSide(double side){
        setWidth(side);
        setHeight(side);
    }

    public double getSide() {
        return getWidth();
    }

    public void setWidth(double width) {
        setSide(width);
    }

    public void setHeight(double height) {
        setSide(height);
    }

    public String toString() {
        return "A Square with side= " + width  + ", which is a subclass of" + super.toString();
    }
}
