import java.util.Arrays;
import java.util.List;

public class Exerc01PoolTarefas {
    public static void main(String[] args) {
        ProcessadorImagem processador = new ProcessadorImagem(3);
        List<String> caminhosImagens = Arrays.asList("imagem1.jpg", "imagem2.png", "imagem3.tiff",
                "imagem5.jpg", "imagem6.png", "imagem7.tiff");

        //processa as imagens em paralelo
        processador.processarImagens(caminhosImagens);
        processador.shutdown();

    }
}
