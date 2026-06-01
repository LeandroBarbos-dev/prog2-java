package atv11.ex4;

class Manager extends Employee {
    Manager(String name) { super(name); }
    @Override String describe() { return name + " is a Manager"; }
}

