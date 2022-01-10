package Chaper_6.Polymorphism;

public class Programmer extends Employee{
    String name = "Programer";

    @Override
    public void printName() {
        System.out.println(name);
    }

    @Override
    public void startProjectWork() {
        defineClasses();
        unitTest();
    }

    private void defineClasses() {
        System.out.println("Programmer defines classes");
    }

    private void unitTest() {
        System.out.println("Programmer starts unit tests");
    }


}
