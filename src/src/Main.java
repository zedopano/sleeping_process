public class Main {
    public static void main(String[] args) {

        Scheduler scheduler = new Scheduler();

        scheduler.carregarProcessos("entrada.txt");
        scheduler.exibirProcessos();

        scheduler.iniciarSimulacao();
    }
}