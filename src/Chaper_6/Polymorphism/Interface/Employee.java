package Chaper_6.Polymorphism.Interface;

public class Employee implements DefaultInterface{
    @Override
    public Object submit() {
        System.out.println("Employee:Accept");
        return null;
    }

    @Override
    public String submit2() {
        String s = "Employee:Accept";
        return s;
    }
}
