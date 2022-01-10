package Chaper_6.Polymorphism;

public class Main {



    public static void main(String[] args) {
        Employee programmer = new Programmer();
        Employee manager = new Manager();

        programmer.reachOffice();
        programmer.startProjectWork();
        System.out.println("------------");
        manager.reachOffice();
        manager.startProjectWork();

        System.out.println("-------WAŻNE--------");
        System.out.println();

//        Employee employee = new Employee() { // Employee jest klasą abstrakcyjna nie mozna jej instancjonować!!
//        };
//            @Override
//            public void startProjectWork() {
//
//            }

        Employee manager1 = new Manager();
        Employee programer1 = new Programmer();

        System.out.println(manager1.name); //employee

        System.out.println(programer1.name); //employee    //variables are bound at compile time!!!
        // Because type of variable programmer is Employee, this access the variable name defined in class Employee

        manager1.printName();//employee

        programer1.printName();//programmer // methods are bound at runtime!!!
        // which method executes depends on the type of object on which it's called.
        // This code calls method printName in class Programmer





    }

}
