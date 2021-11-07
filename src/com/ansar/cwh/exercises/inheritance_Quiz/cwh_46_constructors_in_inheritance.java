package com.ansar.cwh.exercises.inheritance_Quiz;

/**
 * Program to demonstrate inheritance concept with constructor
 */
public class cwh_46_constructors_in_inheritance {
    public static void main(String[] args) {
//        Derived1 derived1 = new Derived1();
//        Child_of_Derived1 child_of_drived1 = new Child_of_Derived1();
        new Child_of_Derived1(8, 8);
    }
}

class Base1 {
    int x;

    Base1() {
        System.out.println("I'm Base1 class constructor..");
    }
}

class Derived1 extends Base1 {
    int y;

    Derived1() {
        System.out.println("I'm Derived1 class constructor..");
    }

    Derived1(int x) {
        System.out.println("I'm overloaded Derived1 class constructor with value x " + x);
    }
}

class Child_of_Derived1 extends Derived1 {
    Child_of_Derived1() {
        System.out.println("I'm Child_of_Derived1 class constructor");
    }

    Child_of_Derived1(int x, int y) {
        super(x);
        System.out.println("I'm overloaded Child_of_Derived1 class constructor with X Y " + x + " " + y);
    }
}