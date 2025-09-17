
public class listaCircular {
    private Processo head;
    private Processo tail;

    public boolean isVazia() {
        return head == null;
    }

    public Processo getHead() {
        return head;
    }

    public void setHead(Processo newHead) {
        this.head = newHead;
    }

    // NOVO QUE ESTAVA FALTANDO
    public Processo getTail() {
        return tail;
    }

    // NOVO QUE ESTAVA FALTANDO
    public void setTail(Processo newTail) {
        this.tail = newTail;
    }

    public void inserir(Processo novoProcesso) {
        if (isVazia()) {
            head = novoProcesso;
            tail = novoProcesso;
            tail.proximo = head;
        } else {
            novoProcesso.proximo = head;
            tail.proximo = novoProcesso;
            tail = novoProcesso;
        }
    }
}