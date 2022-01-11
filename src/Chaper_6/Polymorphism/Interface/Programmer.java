package Chaper_6.Polymorphism.Interface;

public class Programmer extends Employee implements Interface{
    @Override
    public void deliverMobileApp() {
        System.out.println("Testing on real device");
    }

    public void metodaNiewidocznaDlaTypuZwracanegoInterface(){
        //Ta metda jest niewidoczna dla obiektu utworzonego z typem zwracanym Interface
        //Interface programmer = new Programmer();
        //programmer.deliverMobileApp()
        //programmer.   <- brak innych metod
        //Jedyna opcja to rzutowanie! --- ((Programmer)programmer).metodaNiewidoczna....();

    }
}
