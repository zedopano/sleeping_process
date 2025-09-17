
public class Scheduler {
    private ListaDeProcessos lista;
    private final int quantum = 100; // Fatia de tempo de execupara cada processo

    public Scheduler() {
        this.lista = new ListaDeProcessos();
    }

    public void carregarProcessos(String nomeDoArquivo) {
        this.lista = LerArquivo.carregarProcessos(nomeDoArquivo);
    }

    public void exibirProcessos() {
        lista.exibir();
    }

    public void iniciarSimulacao() {
        if (lista.isVazia()) {
            System.out.println("Nenhum processo para simular.");
            return;
        }

        System.out.println("\n--- INICIANDO SIMULAR(Quantum: " + quantum + ") ---");

        Processo atual = lista.getHead();
        Processo anterior = lista.getTail();

        // O loop principal continua enquanto a lista nestiver vazia
        while (!lista.isVazia()) {

            // 1. Executa o processo atual, "gastando" seus ciclos
            int ciclosAtuais = atual.getCiclos_necessarios();
            atual.setCiclos_necessarios(ciclosAtuais - quantum);

            // 2. Verifica se o processo terminou nesta rodada
            if (atual.getCiclos_necessarios() <= 0) {
                System.out.println(">> Processo '" + atual.getNome() + "' (ID: " + atual.getId() + ") TERMINOU e foi removido.");

                if (atual == anterior) {
                    lista.setHead(null);
                    lista.setTail(null);

                    continue;
                }

                anterior.proximo = atual.proximo;


                if (atual == lista.getHead()) {
                    lista.setHead(atual.proximo);
                }


                if (atual == lista.getTail()) {
                    lista.setTail(anterior);
                }

                // Avanpara o prprocesso a ser executado
                atual = anterior.proximo;

            } else {

                anterior = atual;
                atual = atual.proximo;
            }
        }

        System.out.println("\n Processos concluídos!");
    }
}