package atv11.ex5;

public class ContImpl<E> {
    private E e;
    public E get() { return e; }
    public void set(E e) { this.e = e; }

    public static void main(String[] args) {
        ContImpl<Integer> ci = new ContImpl<Integer>();
        ci.set(2);
        System.out.println(ci.get());

        ContImpl<String> cs = new ContImpl<String>();

        cs.set("Leandro");

        System.out.println(cs.get());
    }

}
