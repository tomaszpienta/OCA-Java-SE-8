package Chaper_6.Casting_this_super;

public class Person extends Employee {
    String phone;

    public void person() {
        this.phone = "LG";
        super.name = "Kacper";
    }

    void print() {
        System.out.println(this.phone);
        System.out.println(super.name);
    }


    public static void main(String[] args) {
        Employee employee = new Employee("Tomasz");
        Employee employee1 = new Employee("Pawel", "Kato", 30);

        System.out.println(employee);
        System.out.println(employee1);

        Person person = new Person();
        person.person();//najpierw przypisanie
        person.print();//potem wywołanie (jesli damy samego printa to wyswietli null)


    }
}
