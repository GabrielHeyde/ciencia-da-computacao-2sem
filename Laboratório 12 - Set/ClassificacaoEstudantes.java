import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ClassificacaoEstudantes {

        static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {

        Set<Estudante> estudantes = new HashSet<>();
        Set<Estudante> estudantes0 = new TreeSet<>();

        while(true){
            System.out.println("\nBem-Vindo ao sistema para registro de estudantes e conferência de Notas!");
            System.out.println("Digite 1 para adicionar um estudante;");
            System.out.println("Digite 2 para classificar os alunos com base em suas notas;");
            System.out.println("Digite 3 para imprimir a lista dos alunos;");
            System.out.println("Digite 0 para sair.\n");

            System.out.print("Digite a opção desejada: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    estudantes.add(adicionarEstudante());
                    System.out.println("Aluno adicionado com sucesso!\n");
                    break;
                case 2:
                    estudantes0.addAll(estudantes);
                    System.out.println("Lista ordenada criada!");
                    break;

                case 3:
                    imprimeEstudantes(estudantes0);
                    break;

                case 0:
                    System.out.println("ENCERRANDO O PROGRAMA...");
                    scanner.close();
                    System.exit(0);
                    break;    

                default:
                    System.out.println("VALOR INVÁLIDO!");
                    break;
            }
        }
        
    }

    public static Estudante adicionarEstudante(){
        System.out.println("Digite o nome do estudante: ");
        String nome = scanner.next();
        System.out.println("Digite a nota do estudante: ");
        double nota = scanner.nextDouble();
        Estudante e = new Estudante(nome, nota);
        return e;
    }

    public static void imprimeEstudantes(Set<Estudante> estudantes){

        for (Estudante estudante : estudantes) {
            System.out.println("Nome: " + estudante.getNome() + " | Nota: " + estudante.getNotas());
        }
    }

}
