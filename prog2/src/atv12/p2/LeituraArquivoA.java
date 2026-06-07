package atv12.p2;

import java.io.FileReader;
import java.io.FileNotFoundException;

public class LeituraArquivoA {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("inexistente.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado: " + e.getMessage());
        }
    }
}
