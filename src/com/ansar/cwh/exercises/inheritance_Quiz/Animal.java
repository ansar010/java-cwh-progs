package com.ansar.cwh.exercises.inheritance_Quiz;

class Animal {
    int age;
    public Animal(){
        System.out.println("Base class constructor..");
    }
    public void eat() {
        System.out.println("Eating..");
    }
}

class Dog extends Animal {

    public Dog() {
        System.out.println("Derived class constructor");
    }
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.age = 10;
        System.out.println(animal.age);
        animal.eat();
        System.out.println("Dog barking..");
    }
}