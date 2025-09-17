
public class Processo {
    private int id;
    private String nome;
    private int prioridade;
    private int ciclos_necessarios;
    private String recurso_necessario;
    private boolean finalizado;
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

    // Getters e Setters (NOVOS MADICIONADOS AQUI)
    public int getId() { return id; }
    public String getNome() { return nome; }
    public boolean isFinalizado() { return finalizado; }
    public void setFinalizado(boolean finalizado) { this.finalizado = finalizado; }
    public int getCiclos_necessarios() { return ciclos_necessarios; }
    public void setCiclos_necessarios(int ciclos) { this.ciclos_necessarios = ciclos; }

    @Override
    public String toString() {
        return "ID: " + id + " | Nome: " + nome + " | Ciclos Restantes: " + ciclos_necessarios + (finalizado ? " [TERMINADO]" : "");
    }
}