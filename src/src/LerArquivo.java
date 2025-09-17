import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LerArquivo {
    public static ListaDeProcessos carregarProcessos(String nomeDoArquivo) {
        ListaDeProcessos listaDeProcessos = new ListaDeProcessos();
        try (Scanner leitor = new Scanner(new File(nomeDoArquivo))) {
            System.out.println("Lendo processos do arquivo '" + nomeDoArquivo + "'...");
            while (leitor.hasNextLine()) {
                String linha = leitor.nextLine();
                String[] dados = linha.split(",");
                if (dados.length == 5) {
                    try {
                        int id = Integer.parseInt(dados[0].trim());
                        String nome = dados[1].trim();
                        int prioridade = Integer.parseInt(dados[2].trim());
                        int ciclos = Integer.parseInt(dados[3].trim());
                        String recurso = dados[4].trim();
                        // Adiciona o processo através do "gerente"
                        listaDeProcessos.adicionarProcesso(new Processo(id, nome, prioridade, ciclos, recurso));
                    } catch (NumberFormatException e) {
                        System.out.println("AVISO: Linha ignorada por erro de formato: '" + linha + "'");
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("ERRO CRArquivo '" + nomeDoArquivo + "' nencontrado.");
        }
        System.out.println("Processos carregados com sucesso.");
        return listaDeProcessos;
    }
}