public class Scheduler {

    private ListaDeProcessos lista_alta_prioridade = new ListaDeProcessos();
    private ListaDeProcessos lista_media_prioridade = new ListaDeProcessos();
    private ListaDeProcessos lista_baixa_prioridade = new ListaDeProcessos();
    private ListaDeProcessos lista_bloqueados = new ListaDeProcessos();
    int contador_ciclos_alta_prioridade;
    int ciclo;

    Node cabeca;
    Node cauda;
    public Scheduler(){
        this.lista_baixa_prioridade = new ListaDeProcessos();
        this.lista_media_prioridade = new ListaDeProcessos();
        this.lista_alta_prioridade = new ListaDeProcessos();
        this.lista_bloqueados = new ListaDeProcessos();
        this.ciclo = 0;
        this.contador_ciclos_alta_prioridade = 0;
    }
    public static void executarCicloDeCPU(){

    }

public void addProc(Processo processo){
    switch(processo.prioridade){
        case 1: // Alta Prioridade - 1
            lista_alta_prioridade.inserirProcesso(processo);
            System.out.println("Adicionado na Lista de ALTA prioridade.");
            break;
        case 2:
            lista_media_prioridade.inserirProcesso(processo);
            System.out.println("Adicionado na Lista de MÉDIA prioridade.");
            break;
        case 3:
            lista_baixa_prioridade.inserirProcesso(processo);
            System.out.println("Adicionado na Lista de BAIXA prioridade.");
            break;
        default:
            System.out.println("Inválido.");

    }
}
}