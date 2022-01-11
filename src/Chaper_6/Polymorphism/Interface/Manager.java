package Chaper_6.Polymorphism.Interface;

public class Manager extends Employee implements Interface{
    @Override
    public void deliverMobileApp() {
        System.out.println("QA complete");
        System.out.println("Code delivered with release notes");
    }



    //Manager nadpisuje metody z interfejsu DefaultInterface
    @Override
    public Object submit() {
        System.out.println("Manager:Accept");
        return null;
    }

    @Override
    public String submit2() {
        String s = "Manager:Accept";
        return s;
    }
}
