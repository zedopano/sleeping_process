public class Scheduler {

    ListaDeProcessos lista_alta_prioridade = new ListaDeProcessos();
    ListaDeProcessos lista_media_prioridade = new ListaDeProcessos();
    ListaDeProcessos lista_baixa_prioridade = new ListaDeProcessos();
    ListaDeProcessos lista_bloqueados = new ListaDeProcessos();

    int contador_ciclos_alta_prioridade;
    Node cabeca;
    Node cauda;

    public static void executarCicloDeCPU(){

    }

    public void add(int valor) { // Adicionar no final da lista
        Node scheduler = new Node(valor);
        if (cabeca == null) {
            cabeca = scheduler; // Cabeça = cauda pq aí fica uma lista encadeada, to aprendendo a manjar aq
            cauda = scheduler; // Se esse código funcionar, me agradeçam
        } else {               // pq eu ainda to tentando entender bulhufas dessa matéria -- Henrique (surufel)
            cauda.proximo = scheduler;
            cauda = scheduler; // Adicionando no final da lista e encadeando
        }
    }
    // Remove do começo (bom para escalonador)
    public int remove() { // Remover do final da lista
        if (cabeca == null) throw new RuntimeException("Lista vazia.");
        int valor = cabeca.valor;
        cabeca = cabeca.proximo;
        if (cabeca == null) cauda = null;
        return valor;
    }

    public void print() { // Imprimir lista encadeada
        Node atual = cabeca;
        while (atual != null) {
            System.out.print(atual.valor);
            atual = atual.proximo;
        }
        System.out.println();
    }
}