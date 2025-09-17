public class ListaDeProcessos {
    private listaCircular listaInterna;

    public ListaDeProcessos() {
        this.listaInterna = new listaCircular();
    }

    public void adicionarProcesso(Processo p) {
        listaInterna.inserir(p);
    }

    public boolean isVazia() {
        return listaInterna.isVazia();
    }

    public Processo getHead() {
        return listaInterna.getHead();
    }

    public void setHead(Processo p) {
        listaInterna.setHead(p);
    }

    // MNOVO QUE ESTAVA FALTANDO
    public Processo getTail() {
        return listaInterna.getTail();
    }

    // MNOVO QUE ESTAVA FALTANDO
    public void setTail(Processo p) {
        listaInterna.setTail(p);
    }

    public void exibir() {
        if (isVazia()) {
            System.out.println("\n>> A lista estvazia. <<");
            return;
        }
        System.out.println("\n---------- ESTADO ATUAL DA LISTA ----------");
        Processo temp = getHead();
        do {
            System.out.println("  - " + temp.toString());
            temp = temp.proximo;
        } while (temp != getHead());
        System.out.println("-------------------------------------------");
    }
}