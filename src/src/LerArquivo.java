import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LerArquivo {
    public static void main(String[] args) {
        try {
            File arquivo = new File("entrada.txt");
            Scanner input = new Scanner(arquivo);
            while (input.hasNextLine()) {
                String linha = input.nextLine();
                System.out.println("Lido: " + linha);
            }
            input.close();
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado: " + e.getMessage());
        }
    }
}