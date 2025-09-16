public class ListaDeProcessos {

    Processo head = null;

    public void inserirProcesso(Processo novoProcesso) {
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

    public void printProcessos() {
        if (head == null) {
            System.out.println("\n---------------------");
            System.out.println("Sem processos na lista.");
            System.out.println("-----------------------");
            return;
        }
        Processo temp = head;
        System.out.println("\n   LISTA DE PROCESSOS CARREGADA   ");
        do {
            System.out.println("  - ID: " + temp.id + " | Nome: " + temp.nome);
            temp = temp.proximo;
        } while (temp != head);
        System.out.println("--------------------------------------------------");
    }
}