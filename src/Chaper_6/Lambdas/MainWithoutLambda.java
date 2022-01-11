package Chaper_6.Lambdas;

import java.util.ArrayList;

public class MainWithoutLambda {
    public static void main(String[] args) {


        Emp emp = new Emp("Tomasz", 5, 4000);
        Emp emp1 = new Emp("Pawel", 8, 2052);
        Emp emp2 = new Emp("Kasia", 3, 5450);

        ArrayList<Emp> list = new ArrayList<>();

        list.add(emp);
        list.add(emp1);
        list.add(emp2);

        filter(list, new ValidatePerformanceRaiting());
    }

    private static void filter(ArrayList<Emp> list, Validate val) {
        for (Emp e:list){
            if(val.check(e)){
                System.out.println(e);
            }
        }
    }
}
