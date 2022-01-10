package Chaper_6.Casting_this_super;

public class Main {

    public static void main(String[] args) {
        Interviewer interviewer = new HRExec();
        ((HRExec)interviewer).specialization = new String[]{"Programmer"};

        String name = ((HRExec) interviewer).name();
        System.out.println(name);
    }
}
