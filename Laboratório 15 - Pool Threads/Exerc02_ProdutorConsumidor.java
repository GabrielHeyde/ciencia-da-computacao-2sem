import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Exerc02_ProdutorConsumidor {

    public static void main(String[] args) {

        BlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(50);

        Produtor produtor = new Produtor(queue);
        Consumidor consumidor = new Consumidor(queue);

        Thread produtorThread = new Thread(produtor);
        Thread consumidoThread = new Thread(consumidor);

        produtorThread.start();
        consumidoThread.start();

        try {
            Thread.sleep(20000);

            produtorThread.interrupt();
            consumidoThread.interrupt();

        } catch (Exception e) {
            System.err.println("Ops, deu erro: " + e.getMessage());
        }

    }
}