package Chaper_6.Interface;

public class Potwor implements Dodges{
    String name;
    int health;
    int damage;
    String weapon;

    public void setHealth(int health) {
        this.health = health;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void roll() {
        System.out.println(name +" wykonuje unik ciosu");
        if (getHealth() != 100){
            setHealth(getHealth() + 10);
        }
        System.out.println("Zycie " + name + "a = " + health);

    }


    public void obrot() {
        System.out.println(name + " wykonuje obrot!");
        if (getHealth() != 100){
            setHealth(getHealth() + 15);
        }
        System.out.println("Zycie " + name + "a = " + health);
    }

    public void attack(int damage, Potwor potwor){
        this.damage = damage;
        potwor.health = potwor.health - damage;

        System.out.println("Zycie: "+ potwor.name + " = " + potwor.health);
    }

    @Override
    public String toString() {
        return "Potwor{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", damage=" + damage +
                ", weapon='" + weapon + '\'' +
                '}';
    }
}
