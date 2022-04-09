package com.company;

public class Point3D extends Point2D {
    private double z = 0.0;

    public Point3D(){
    }

    public Point3D( double x, double y, double z) {
        super(x,y);
        this.z = z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public void setXYZ(double x, double y, double z) {
        super.setXY(x,y);
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    public double[] getXYZ() {
        double[] arr = new double[3];
        arr[0] = getX();
        arr[1] = getY();
        arr[2] = z;
        return arr;
    }

    @Override
    public String toString() {
        return "Point3D{x=" + getX() + ", y=" + getY() +
                ", z=" + z +
                '}';
    }
}
