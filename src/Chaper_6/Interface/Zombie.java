package Chaper_6.Interface;

public class Zombie extends Potwor implements Dodges{

    public void createZombie(String name, int health){
        setHealth(health);
        setName(name);
    }

    public void jump(){
        System.out.println("Metoda Zombie");
        int hight = 50;
        double duration = 20.0;

        System.out.println("Zombie skacze na wysokosc: " + hight + " z czasem "+ duration);

    }

    @Override
    public void block() {
        System.out.println("Zombie blokuje cios mieczem!");
    }


}
