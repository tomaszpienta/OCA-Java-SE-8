package Chaper_6.Object_Types_6_3;

public class Employee extends Person {
    String name;
    String address;
    String phoneNumber;
    float experience;


    public static void main(String[] args) {
        Person person = new Employee();
        person.conductInterview();
        person.defaultMethod();

    }

}
