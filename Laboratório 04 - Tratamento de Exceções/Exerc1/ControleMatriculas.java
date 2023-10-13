import java.util.Scanner;

public class ControleMatriculas {
	
    public static void main(String[] args) {
        Aluno[] alunos = new Aluno[5];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < alunos.length; i++) {
            try {
                alunos[i] = criarAluno(scanner);
                System.out.println("Aluno " + (i+1) + " matriculado com sucesso!");
            } catch (ExcedidoTamanhoDoCampoException | ExcessoDeInscritosException e) {
                System.out.println("Erro: " + e.getMessage());
                i--; // Volta uma posição para tentar novamente
            }
        }

        scanner.close();
    }

    public static Aluno criarAluno(Scanner scanner) throws ExcedidoTamanhoDoCampoException, ExcessoDeInscritosException {
        
    	System.out.println("Digite os dados do aluno:");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        if (nome.length() > 30) {
            throw new ExcedidoTamanhoDoCampoException("Nome excede tamanho máximo de 30 caracteres.");
        }

        System.out.print("CPF: ");
        String cpf = scanner.nextLine();
        if (cpf.length() > 11) {
            throw new ExcedidoTamanhoDoCampoException("CPF excede tamanho máximo de 11 caracteres.");
        }
        
        System.out.print("Endereço: ");
        String endereco = scanner.nextLine();
        if (endereco.length() > 60) {
            throw new ExcedidoTamanhoDoCampoException("Endereço excede tamanho máximo de 60 caracteres.");
        }  
        
        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();
        if (telefone.length() > 11) {
            throw new ExcedidoTamanhoDoCampoException("Telefone excede tamanho máximo de 11 caracteres.");
        }   
        
        System.out.print("Email: ");
        String email = scanner.nextLine();
        if (email.length() > 30) {
            throw new ExcedidoTamanhoDoCampoException("Telefone excede tamanho máximo de 30 caracteres.");
        }          

        // criação do objeto Aluno
        return new Aluno(nome, cpf, endereco, telefone, email);
    }
}

