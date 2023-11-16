import java.util.concurrent.BlockingQueue;

public class Consumidor implements java.lang.Runnable {

    private BlockingQueue<Integer> queue;

    public Consumidor(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    public void run() {
        try {
            while (true) {
                int item = queue.take();
                queue.put(item);
                System.out.println("Consumido: " + item);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            Thread.currentThread().interrupt();
        }
    }

}
