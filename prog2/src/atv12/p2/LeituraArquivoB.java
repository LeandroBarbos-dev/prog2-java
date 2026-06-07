package atv12.p2;

import java.io.FileReader;
import java.io.FileNotFoundException;

public class LeituraArquivoB {
    public static void main(String[] args) throws FileNotFoundException {
        FileReader fr = new FileReader("inexistente.txt");
    }
}

