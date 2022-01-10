package Chaper_6.Object_Types_6_3;

public class HRExec extends Employee implements Interviewer{
    String[] specialization;
    @Override
    public void conductInterview() {
        System.out.println("HR przeprowadza wywiad");
    }

}
