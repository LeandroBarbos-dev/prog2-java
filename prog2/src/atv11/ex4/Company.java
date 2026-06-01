package atv11.ex4;

public class Company {
    public static void main(String[] args) {
        Employee[] staff = {
            new Employee("Ana"),
            new Manager("Bruno"),
            new Secretary("Carla"),
            new Programmer("Diego"),
            new Executive("Elena")
        };
        for (Employee e : staff) {
            System.out.println(e.describe());
        }
    }
}
