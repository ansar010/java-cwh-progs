package com.ansar.cwh.ch9_Practice_set;

public class PS9 {
    public static void main(String[] args) {
        //Problem 1
        Cylinder myCylinder = new Cylinder();
        myCylinder.setHeight(5.6);
        myCylinder.setRadius(3.4);
        System.out.println(myCylinder.getHeight());
        System.out.println(myCylinder.getRadius());

        // Problem 2
        System.out.println(myCylinder.surfaceArea());
        System.out.println(myCylinder.volume());
    }
}

class Cylinder {
    private double radius;
    private double height;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double surfaceArea(){
        return 2* Math.PI* radius * radius + 2*Math.PI*radius*height;
    }
    public double volume(){
        return Math.PI * radius * radius * height;
    }
}
