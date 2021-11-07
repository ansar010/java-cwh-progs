package com.ansar.cwh.ch8_Practice_set;

/**
 * Program to solve practice set 8problem statements
 */
public class PS8 {
    public static void main(String[] args) {
        //problem 1
//        Employee emp = new Employee();
//        emp.setName("Adam");
//        System.out.println(emp.getName());
//        emp.salary = 70000;
//        System.out.println(emp.getSalary());

        //problem 2
//        CellPhone cellPhone = new CellPhone();
//        cellPhone.ring();
//        cellPhone.vibrate();

        //problem 3
        Square square = new Square();
        square.side = 3;
        int area = square.area();
        int perimeter = square.perimeter();
        System.out.printf("Area %d\nPerimeter %d", area, perimeter);
    }
}

class Square {
    int side;

    public int area() {
        //Area of a square is A^2
        return side * side;
    }

    public int perimeter() {
        return 4 * side;
    }
}

class Employee {
    int salary;
    String name;

    public String getName() {
        return name;
    }

    public void setName(String nm) {
        name = nm;
    }

    public int getSalary() {
        return salary;
    }
}

class CellPhone {
    public void ring() {
        System.out.println("Phone is ringing..");
    }

    public void vibrate() {
        System.out.println("Phone is Vibrating..");
    }
}