import java.util.Random;
import java.util.concurrent.BlockingQueue;

public class Produtor implements java.lang.Runnable {

    private BlockingQueue<Integer> queue;
    private Random random = new Random();

    public Produtor(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    public void run() {
        try {
            while (true) {
                int item = random.nextInt(100);
                queue.put(item);
                System.out.println("Produzido: " + item);
            }
        } catch (Exception e) {
            Thread.currentThread().interrupt();
        }
    }

}
