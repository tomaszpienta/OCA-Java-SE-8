package Chaper_6.Polymorphism.Interface;

public class Main {
    public static void main(String[] args) {
        Interface manager = new Manager();
        Interface programmer = new Programmer();

        programmer.deliverMobileApp();
        ((Programmer)programmer).metodaNiewidocznaDlaTypuZwracanegoInterface();

        manager.deliverMobileApp();

        /*
        todo
         Programmer programmer1 = new Programmer();
         programmer1.metodaNiewidocznaDlaTypuZwracanegoInterface();
         programmer1.deliverMobileApp();
        */

        System.out.println("-------DefaultInterface-------");

        DefaultInterface managerDefaultInterface = new Manager();
        Manager manager1 = new Manager();

        managerDefaultInterface.submit();
        manager1.submit();

        System.out.println(manager1.submit2());

        String s = managerDefaultInterface.submit2();
        System.out.println(s);

        //Jak widać nadpisana metoda default interfejsu przyjmuje wartość z miejsca gdzie została nadpisana.

        System.out.println("--Employee--base class");
        Employee employee = new Manager();
        System.out.println(employee.submit2());
        employee.submit();

    }
}
