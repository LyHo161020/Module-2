package com.company;

public class MoveablePoint extends Point {
    private double xSpeed = 0.0;
    private double ySpeed = 0.0;

    public MoveablePoint(){
    }

    public MoveablePoint(double xSpeed, double ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint(double x, double y, double xSpeed, double ySpeed){
        super(x,y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public void setXSpeed(double xSpeed) {
        this.xSpeed = xSpeed;
    }

    public void setYSpeed(double ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(double xSpeed, double ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public double getxSpeed() {
        return xSpeed;
    }

    public double getySpeed() {
        return ySpeed;
    }

    public double[] getSpeed(){
        return new double[] {xSpeed,ySpeed};
    }

    public void move() {
        setX(getX() + xSpeed);
        setY(getY() + ySpeed);
    }

    @Override
    public String toString() {
        return "MoveablePoint{(x,y)= (" + getX() + "," + getY() +
                "),xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }
}
