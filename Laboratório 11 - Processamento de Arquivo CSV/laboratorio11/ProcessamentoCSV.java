package laboratorio11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class ProcessamentoCSV {

    public static void main(String[] args) {

        String arquivoEntrada = "laboratorio11/alunos.csv";
        String arquivoSaida = "media_alunos.csv";

        List<Aluno> alunos = new ArrayList<Aluno>();

        try {
            BufferedReader leitor = new BufferedReader(new FileReader(arquivoEntrada));
            
            String linha;

            while ((linha = leitor.readLine()) != null) {
                String[] dados = linha.split(";");
                if(dados.length == 5){
                    String nome = dados[0];
                    int idade = Integer.parseInt(dados[1]);
                    float nota1 = Float.parseFloat(dados[2]);
                    float nota2 = Float.parseFloat(dados[3]);
                    float nota3 = Float.parseFloat(dados[4]);
                    Aluno a = new Aluno(nome, idade, nota1, nota2, nota3);
                    alunos.add(a);
                }
            }

            // -- calculos

            Aluno alunoMaiorMedia = null;
            float maiorMedia = 0;
            for (Aluno aluno : alunos) {
                float media = (aluno.getNota1() + aluno.getNota2() + aluno.getNota3()) / 3;
                aluno.setMedia(media);
                if (media > maiorMedia) {
                    maiorMedia = media;
                    alunoMaiorMedia = aluno;
                    
                }
            }



            System.out.println("Aluno com maior média: \n" + alunoMaiorMedia.getNome() +
            " - média: " + alunoMaiorMedia.getMedia());

            PrintWriter escritor = new PrintWriter(new FileWriter(arquivoSaida));
            for (Aluno aluno : alunos) {
                escritor.println(aluno.getNome() + ";" + aluno.getIdade() + ";" + aluno.getMedia());
                
            }

            escritor.close();
            leitor.close();

            System.out.println("Arquivo copiado com sucesso!");
            
        } catch (Exception e) {
            System.err.println("Deu Erro: " + e.getMessage());
        }
        
    }
    
}
