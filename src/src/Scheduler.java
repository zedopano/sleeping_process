public class Scheduler {

    private ListaDeProcessos lista_alta_prioridade = new ListaDeProcessos();
    private ListaDeProcessos lista_media_prioridade = new ListaDeProcessos();
    private ListaDeProcessos lista_baixa_prioridade = new ListaDeProcessos();
    private ListaDeProcessos lista_bloqueados = new ListaDeProcessos();

    Node cabeca;
    Node cauda;

    public static void executarCicloDeCPU(){
        int contador_ciclos_alta_prioridade = 0;
        System.out.println("Ciclos: ", contador_ciclos_alta_prioridade);
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