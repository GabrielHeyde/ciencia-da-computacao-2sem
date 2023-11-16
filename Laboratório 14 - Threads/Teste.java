public class Teste {

    public static void main(String[] args) {

        System.out.println("Iniciando a Thread Inicial!");

        MinhaThread tarefaA = new MinhaThread("Tarefa A");

        Thread tarefaB = new Thread(new MinhaRunnable(), "Tarefa B");

        tarefaA.start();
        tarefaB.start();

        System.out.println("Threads disparadas;");

        try {
            System.out.println("Thread principal indo dormir ...");
            Thread.sleep(1000);
            System.out.println("Thread principal acordando ...");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Tarefas executadas");

    }
}