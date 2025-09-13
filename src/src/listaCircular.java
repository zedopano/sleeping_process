public class listaCircular {
    Node inicio;

    public listaCircular() {
        this.inicio = null;
    }

    public void inserir(int dado) {
        Node novoNo = new Node(dado);
        if (inicio == null) {
            inicio = novoNo;
        } else {
            Node ultimo = inicio.anterior;
            ultimo.proximo = novoNo;
            novoNo.anterior = ultimo;
            novoNo.proximo = inicio;
            inicio.anterior = novoNo;

        }
    }
}
