import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Exercício1 {

    public static void main(String[] args) {

        ArrayList<String> textos = new ArrayList<>();
        textos.add("Eu quero sentir a minha vida enquanto estou nela");
        textos.add("A vida se encolhe ou se expande em proporção a sua coragem");
        textos.add("A vida não é encontrar a si mesmo a vida é criar a si mesmo");

        Map<String, Integer> mapaPalavras = new HashMap<>();
        for (String frases : textos) {
            String[] palavrasDoTexto = frases.split("\\s");
            for (String palavra : palavrasDoTexto) {
                palavra = palavra.toLowerCase();
                if (mapaPalavras.containsKey(palavra)) {
                    mapaPalavras.put(palavra, mapaPalavras.get(palavra) + 1);
                } else {
                    mapaPalavras.put(palavra, 1);
                }

            }
        }

        System.out.println("Lista de palavras encontradas no texto: ");
        for (Map.Entry<String, Integer> par : mapaPalavras.entrySet()) {
            System.out.println('"' + par.getKey() + '"' +" Aparece " + par.getValue() + " vez(es) nas frases.");
        }
    }
}