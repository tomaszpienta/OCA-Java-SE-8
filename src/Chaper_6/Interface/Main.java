package Chaper_6.Interface;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        int rand = random.nextInt(2);
        Zombie zombie = new Zombie();
        Szkielet szkielet = new Szkielet();

        zombie.createZombie("Zombie", 100);
        szkielet.createSzkielet("Szkielet", 100);

//        zombie.health = 100;
//        szkielet.health = 100;

        zombie.attack(30, szkielet);

        switch (rand){
            case 0:
                szkielet.roll();
                break;
            case 1:
                szkielet.obrot();
                break;
        }
        //szkielet.roll();
        System.out.println("!!Testowanie metod!!");

        szkielet.block();
        zombie.block();

        System.out.println("------------");
        //Pamietac, ze statyczna metoda interfejsu nie moze byc wywolana poprzez referencje.
        //Musi zostac wywoalana przy uzyciu nazwy interfejsu
        Dodges.jump(20.0);
        zombie.jump();

        zombie.getName();


    }
}
