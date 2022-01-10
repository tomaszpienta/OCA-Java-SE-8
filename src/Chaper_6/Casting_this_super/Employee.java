package Chaper_6.Casting_this_super;

public class Employee {
    String name;
    String address;
    int street;

    public Employee() {

    }

    public Employee(String name){
        this.name = name;
        address = "Kato";
    }

    public Employee(String name, String address, int street){
        this(name); //Calls constructor that accepts only name
        this.address = address;
        this.street = street;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", street=" + street +
                '}';
    }
}
