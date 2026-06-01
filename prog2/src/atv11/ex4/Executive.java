package atv11.ex4;

class Executive extends Manager {
    Executive(String name) { super(name); }
    @Override String describe() { return name + " is an Executive"; }
}
