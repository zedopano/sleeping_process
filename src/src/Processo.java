public class Processo {
    public int id;
    public String nome;
    public int prioridade;
    public int ciclos_necessarios;
    public String recurso_necessario;

    public boolean finalizado;
    public Processo proximo;

    public Processo(int id, String nome, int prioridade, int ciclos_necessarios, String recurso_necessario) {
        this.id = id;
        this.nome = nome;
        this.prioridade = prioridade;
        this.ciclos_necessarios = ciclos_necessarios;
        this.recurso_necessario = recurso_necessario;

        this.finalizado = false;
        this.proximo = null;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }
}