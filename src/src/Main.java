import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ListaDeProcessos pl = new ListaDeProcessos();
        pl.inserirProcesso(101);
        pl.inserirProcesso(102);
        pl.inserirProcesso(103);
        pl.inserirProcesso(104);

        System.out.println("Lista inicial:");
        pl.printProcessos();

        pl.processoFinalizado(101);
        pl.processoFinalizado(103);

        System.out.println("Após marcar alguns como terminados:");
        pl.processoFinalizado();

        pl.removerFinalizado();

        System.out.println("Após remover terminados:");
        pl.printProcessos();
    }
}