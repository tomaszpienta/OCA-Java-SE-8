package Chaper_6.Lambdas;

public class ValidateName implements Validate {
    @Override
    public boolean check(Emp emp) {
        return (emp.getName().startsWith("P"));
    }
}
