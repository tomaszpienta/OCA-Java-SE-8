package Chaper_6.Interface;

public class Szkielet extends Potwor implements Dodges{

    public void createSzkielet(String name, int health){
        setHealth(health);
        setName(name);
    }

    @Override
    public void block() {
        System.out.println("Szkielet blokuje cios patykiem!");
    }
}
