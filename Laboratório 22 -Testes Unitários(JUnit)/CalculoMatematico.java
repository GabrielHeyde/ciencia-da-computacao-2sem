// CalculoMatematico.java

public class CalculoMatematico {

    public int calcularFatorial(int n) {

        if (n < 0) {
            throw new IllegalArgumentException("Fatorial não definido para números negativos.");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        int resultado = 1;
        for (int i = 2; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }
}