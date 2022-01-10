package Chaper_6.Interface;

import javax.sound.midi.Soundbank;

public interface Dodges extends Interface1, Interface2{
    int hight = 50;

    @Override
    default void getName() {
        Interface2.super.getName(); //Nalezy podac z jakiego interfejscu ma pobrac metode getName
    }

    void roll();    //Metoda abstrakcyjna, trzeba zaimplementowac w klacie (inaczej nie odpali)

    static void jump(double duration){
        System.out.println("Skok na wysokosc " + hight);
        System.out.println("Czas trwania skoku " + duration);
    }
    default void obrot(){
        System.out.println("Wykonuje obrót!");
    }

    default void block(){
        System.out.println("Blokuje cios");
    }

}
