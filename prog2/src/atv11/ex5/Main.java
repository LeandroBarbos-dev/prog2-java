package atv11.ex5;

public class Main {
	public static void main(String[] args) {
        ContImpl<Integer> ci = new ContImpl<Integer>();
        ci.set(2);
        System.out.println(ci.get());

        ContImpl<String> cs = new ContImpl<String>();

        cs.set("Leandro");

        System.out.println(cs.get());
    }
}
