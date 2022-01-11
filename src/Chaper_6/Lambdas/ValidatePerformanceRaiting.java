package Chaper_6.Lambdas;

public class ValidatePerformanceRaiting implements Validate {
    @Override
    public boolean check(Emp emp) {
        return (emp.getPerformanceRaiting() >= 5);
    }
}
