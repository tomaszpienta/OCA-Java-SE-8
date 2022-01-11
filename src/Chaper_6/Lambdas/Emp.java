package Chaper_6.Lambdas;

public class Emp {
    String name;
    int performanceRaiting;
    double salary;

    public Emp(String name, int performanceRaiting, double salary) {
        this.name = name;
        this.performanceRaiting = performanceRaiting;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getPerformanceRaiting() {
        return performanceRaiting;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", performanceRaiting=" + performanceRaiting +
                ", salary=" + salary +
                '}';
    }
}
