public class ListaDeProcessos {


    ListaDeProcessos head = null;

    //Insere processo no final da lista;
    void inserirProcesso(int ip) {
        Processo novoProcesso = new Processo(ip);
        if (head == null) {
            head = novoProcesso;
            head.proximo = head;
        } else {
            Processo temp = head;
            while (temp.proximo != head) {
                temp = temp.proximo;
            }
            temp.proximo = novoProcesso;
            novoProcesso.proximo = head;
        }
    }

    //marcador para um processo finalizado
    void processoFinalizado(int ip) {
        if (head == null) return;
        Processo temp = head;
        do {
            if (temp.ip == ip) {
                temp.finalizado = true;
                return;
            }
            temp = temp.proximo;
        } while (temp != head);
    }

    //Remove processos finalizados
    void removerFinalizado() {
        if (head == null) return;
        Processo atual = head;
        Processo anterior = null;

        boolean primeiraIteracao = true;
        do {
            if (atual.finalizado) {
                if (atual == head) {
                    //Se o head está terminado
                    if (head. == head) {
                        //Só um processo na lista
                        head == null;
                        return;
                    }
                    //Encontrar o ultimo processo e ajustar o ponterio
                    Processo ultimo = head;
                    while (ultimo.proximo != head) {
                        ultimo = ultimo.proximo;
                    }
                    ultimo.proximo = head.proximo;
                    head = head.proximo;
                    atual = head;
                    if (!primeiraIteracao) continue; //evita pular  o proximo nó
                } else {
                    anterior.proximo = atual.proximo;
                    atual = atual.proximo;
                    continue; //não avança
                }
                primeiraIteracao = false;
            } while (atual != head) ;
        }
    }

    void printProcessos() {
        if (head == null) {
            System.out.println("sem processos");
            return;
        }
        Processo temp = head;
        do {
            System.out.println("Ip:" + temp.ip + (temp.finished ? "[terminado]" : "") + " ");
            temp = temp.proximo;
        } while (temp != head);
        System.out.println();
    }
}
