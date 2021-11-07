package com.ansar.cwh.ch11_Practice_set;

interface BasicAnimal {
    void eat();

    void sleep();
}

interface Camera {
    void takeSnap();
}

/**
 * Programs to solve chapter 11 problems
 */
public class PS11 {
    public static void main(String[] args) {
        // Q1 + Q2
//        FountainPen pen = new FountainPen();
//        pen.changeNib();

        // Q3
//        Human harry = new Human();
//        harry.sleep();

        //Q5
//        Monkey monkey = new Human();
        // m1.speak(); --> Cannot use speak method because the reference is monkey which does not have speak method

        //Q4
//        Telephone smartPhone = new SmartPhone();
//        smartPhone.takeSnap() --> Cannot use takeSnap method because the reference is Telephone does not have takeSnap method
    }
}

abstract class Pen {
    abstract void write();

    abstract void refill();
}

class FountainPen extends Pen {
    void write() {
        System.out.println("Write");
    }

    void refill() {
        System.out.println("refill");
    }

    void changeNib() {
        System.out.println("Nib change");
    }
}

class Monkey {
    void jump() {
        System.out.println("Jump");
    }

    void bite() {
        System.out.println("Biting");
    }
}

class Human extends Monkey implements BasicAnimal {

    void speak() {
        System.out.println("Hello sir!");
    }

    @Override
    public void eat() {
        System.out.println("eat");
    }

    @Override
    public void sleep() {
        System.out.println("sleep");
    }
}

abstract class Telephone {
    abstract void ring();

    abstract void lift();

    abstract void disconnect();
}

class SmartPhone extends Telephone implements Camera {

    @Override
    void ring() {
        System.out.println("ring");
    }

    @Override
    void lift() {
        System.out.println("lift");
    }

    @Override
    void disconnect() {
        System.out.println("disconnect");
    }

    @Override
    public void takeSnap() {
        System.out.println("Take snap");
    }
}