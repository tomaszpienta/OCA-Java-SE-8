package Chaper_6.Casting_this_super;

public class HRExec extends Employee implements Interviewer{
    String[] specialization;
    public String name(){
        this.name = "Employee"; //name jest wziete z dziedziczenia po klasie employee!!
        return name;
    }

    @Override
    public void conductInterview() {
        System.out.println("HR przeprowada wywiad!");
    }
}
