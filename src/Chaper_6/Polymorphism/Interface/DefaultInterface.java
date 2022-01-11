package Chaper_6.Polymorphism.Interface;

public interface DefaultInterface {
    default Object submit(){
        System.out.println("Interface:Accept");
        return null;
    }
    default String submit2(){
        String s = "Interface:Accept";
        return s;
    }

}
