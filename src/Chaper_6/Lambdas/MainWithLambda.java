package Chaper_6.Lambdas;


import Chaper_6.Lambdas.Emp;
import Chaper_6.Lambdas.Validate;

import java.util.ArrayList;

public class MainWithLambda {
    public static void main(String[] args) {
        Emp emp = new Emp("Tomasz", 3, 4500);
        Emp emp1 = new Emp("Pawel", 6, 5900);
        Emp emp2 = new Emp("Kasia", 3, 2100);
        Emp emp3 = new Emp("Pasia", 2, 4200);

        ArrayList<Emp> list = new ArrayList<>();

        list.add(emp);
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);

        //Lambda - geterformanceRating - metoda abstrakcyjna!!!
        Validate validate = e -> e.getPerformanceRaiting() >=5;
        filter(list, validate);

    }

    private static void filter(ArrayList<Emp> list, Validate validate) {
        for (Emp l:list) {
            if (validate.check(l)){
                System.out.println(l);
            }
        }
    }
}
