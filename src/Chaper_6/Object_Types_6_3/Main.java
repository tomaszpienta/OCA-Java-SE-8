package Chaper_6.Object_Types_6_3;

public class Main {
    public static void main(String[] args) {
        HRExec hrExec = new HRExec();
        hrExec.specialization = new String[]{"Programmer"};
        System.out.println(hrExec.specialization[0]);
        hrExec.name = "Tomasz";
        System.out.println(hrExec.name);
        hrExec.conductInterview();
        hrExec.defaultMethod();
        Interviewer.staticMethod();

        System.out.println("---------------------");

        Employee hrEmplo = new HRExec();
        hrEmplo.name = "Pawel";
        System.out.println(hrEmplo.name);

        System.out.println("---------------------");

        Interviewer hrInterv = new HRExec();
        hrInterv.conductInterview();
        hrInterv.defaultMethod();

        System.out.println("---------------------");

        Interviewer[] interviewers = new Interviewer[2];
        interviewers[0] = new HRExec();
        interviewers[1] = new Person();
        for (Interviewer s:interviewers) {
            s.conductInterview();
        }

        System.out.println("---------------------");

        Object hrObject = new HRExec();
        //Standardowe metody Object

        System.out.println("---------------------");
            new Person();
            new HRExec();
            //new Interviewer(); Nie mozna tak robic.
            new Employee();


    }
}
