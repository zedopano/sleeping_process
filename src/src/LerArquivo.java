import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LerArquivo {

    public static void main(String[] args) {

        ListaDeProcessos lista = new ListaDeProcessos();

        try {
            File arquivo = new File("entrada.txt");
            Scanner leitorDeLinhas = new Scanner(arquivo);

            System.out.println("Lendo arquivo 'entrada.txt'...");

            while (leitorDeLinhas.hasNextLine()) {
                String linha = leitorDeLinhas.nextLine();

                String[] dados = linha.split(",");

                if (dados.length == 5) {
                    try {
                        int id = Integer.parseInt(dados[0].trim());
                        String nome = dados[1].trim();
                        int prioridade = Integer.parseInt(dados[2].trim());
                        int ciclos = Integer.parseInt(dados[3].trim());
                        String recurso = dados[4].trim();

                        Processo p = new Processo(id, nome, prioridade, ciclos, recurso);

                        lista.inserirProcesso(p);

                    } catch (NumberFormatException e) {
                        System.out.println("Erro ao converter um número na linha: '" + linha + "'. Linha ignorada.");
                    }
                } else {
                    System.out.println("Linha mal formatada encontrada e ignorada: '" + linha + "'");
                }
            }
            leitorDeLinhas.close();

            lista.printProcessos();

        } catch (FileNotFoundException e) {
            System.out.println("ERRO: Arquivo 'entrada.txt' não encontrado. Verifique se ele está na pasta correta.");
        }
    }
}