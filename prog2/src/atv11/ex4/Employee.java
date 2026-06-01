package atv11.ex4;

class Employee {
    protected String name;
    Employee(String name) { this.name = name; }
    String describe() { return name + " is an Employee"; }
}

