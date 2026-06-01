package atv11.ex4;

class Secretary extends Employee {
    Secretary(String name) { super(name); }
    @Override String describe() { return name + " is a Secretary"; }
}

