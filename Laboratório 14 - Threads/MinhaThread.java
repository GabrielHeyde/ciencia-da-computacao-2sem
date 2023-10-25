public class MinhaThread extends Thread {

    String nome;
    int[] array;
    int resultado;

    public MinhaThread(String nome, int[] array) {
        this.nome = nome;
        this.array = array;
        }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

    public void run() {
        int soma = 0;
        for (int i = 0; i < array.length; i++) {
            soma = soma + array[i];
        }
        setResultado(soma);
        System.out.println("\nA tarefa nomeada de '" + nome + "' terminou de ser executada.");
    }

}