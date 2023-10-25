public class Exercício1 {

    public static void main(String[] args) {

        Thread tarefa = new Thread(new Runnable() {
            public void run() {
                for (int i = 1; i < 11; i++) {
                    System.out.println(i);
                    try {
                        Thread.sleep(((int) Math.random() * 500) + 100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            }
        });
        tarefa.start();
    }
}