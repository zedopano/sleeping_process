public class listaCircular {

    private Node cauda;
    private int tamanho;

    public listaCircular() {
        this.cauda = null;
        this.tamanho = 0;
    }

    public boolean isVazia() {
        return this.tamanho == 0;
    }

    public int getTamanho() {
        return this.tamanho;
    }

    public void inserirNoInicio(Object dado) {
        Node novoNo = new Node(dado);
        if (isVazia()) {
            this.cauda = novoNo;
            novoNo.setProximo(novoNo);
            novoNo.setAnterior(novoNo);
        } else {
            Node cabeca = cauda.getProximo();

            novoNo.setProximo(cabeca);
            cabeca.setAnterior(novoNo);
            novoNo.setAnterior(cauda);
            cauda.setProximo(novoNo);
        }
        this.tamanho++;
    }

    public void inserirNoFim(Object dado) {
        inserirNoInicio(dado);

        if (tamanho > 1) {
            this.cauda = this.cauda.getProximo();
        }
    }

    public void exibirLista() {
        if (isVazia()) {
            System.out.println("A lista está vazia.");
            return;
        }

        StringBuilder sb = new StringBuilder("[");
        Node atual = cauda.getProximo();

        for (int i = 0; i < tamanho; i++) {
            sb.append(atual.getDado());
            if (i < tamanho - 1) {
                sb.append(" <-> ");
            }
            atual = atual.getProximo();
        }
        sb.append("]");
        System.out.println(sb.toString());
    }
}