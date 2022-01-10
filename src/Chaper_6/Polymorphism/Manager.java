package Chaper_6.Polymorphism;

public class Manager extends Employee{
    @Override
    public void startProjectWork() {
        meetingWithCustomer();
        defineProject();
    }

    private void meetingWithCustomer() {
        System.out.println("Manager meets with customer");
    }

    private void defineProject() {
        System.out.println("Manager define project");

    }
}
