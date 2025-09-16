public class Node {

    private Object dado;
    private Node proximo;
    private Node anterior;

    public Node(Object dado) {
        this.dado = dado;
        this.proximo = null;
        this.anterior = null;
    }

    public Object getDado() {
        return this.dado;
    }

    public void setDado(Object dado) {
        this.dado = dado;
    }

    public Node getProximo() {
        return this.proximo;
    }

    public void setProximo(Node proximo) {
        this.proximo = proximo;
    }

    public Node getAnterior() {
        return this.anterior;
    }

    public void setAnterior(Node anterior) {
        this.anterior = anterior;
    }
}