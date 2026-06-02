package atv11.desafio;
import java.util.*;
public class Main {

    public static <T> void printAll(List<T> items) {
        for (T item : items) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {

        List<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);

        List<String> nomes = new ArrayList<>();
        nomes.add("Leandro");
        nomes.add("Padrim");
        nomes.add("Isabella");

        printAll(numeros);
        printAll(nomes);
    }
}