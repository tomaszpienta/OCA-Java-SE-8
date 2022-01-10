package Chaper_6.Polymorphism;

public abstract class Employee {
    String name = "Employee";
    public void reachOffice(){
        System.out.println("Reach Office from employee abstract class");
    }

    public abstract void startProjectWork();

    public void printName(){
        System.out.println(name);
    }
}
