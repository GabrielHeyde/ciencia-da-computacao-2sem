import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ProcessadorImagem {
    private ExecutorService executor;

    public ProcessadorImagem(int numThreads){
        this.executor = Executors.newFixedThreadPool(numThreads);
    }

    public void processarImagens(List<String> caminhoImagens){
        for (String caminhoImagem : caminhoImagens) {
            executor.submit(() -> { //metodo run resumido
                //aqui vai o codigo de processamento da imagem
                //System.out.println("Hashcode: " + executor.hashCode());
                System.out.println("processando imagem: " + caminhoImagem);
            });
        }
        executor.shutdown();

        try{
            executor.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
        } catch(InterruptedException e){
            System.err.println("Erro ao aguardar conclusao do processamento");
        }
    }
    public void shutdown(){
        executor.shutdownNow();
    }
}
