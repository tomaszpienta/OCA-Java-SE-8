package Chaper_6.Object_Types_6_3;

public interface Interviewer {
    void conductInterview();
    static void staticMethod(){
        System.out.println("Static Method");
    }
    default void defaultMethod(){
        System.out.println("Default Method");
    }
}
