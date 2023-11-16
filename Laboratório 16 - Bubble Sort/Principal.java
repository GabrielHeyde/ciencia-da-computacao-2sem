public class Principal {

    public static void main(String[] args) {
        
        Funcionario f1 = new Funcionario("Isabela", 10532.41);
        Funcionario f2 = new Funcionario("Eduardo", 5425.65);
        Funcionario f3 = new Funcionario("Jardel", 8970.44);
        Funcionario f4 = new Funcionario("Gabriel S.", 5425.69);
        Funcionario f5 = new Funcionario("Gabriel H.", 3652.42);

        Funcionario[] empresa = {f1, f2, f3, f4, f5};

        imprimirArrei(empresa);

        ordenarPorBubbleSort(empresa);

        System.out.println("Array organizado por ordem de salário: ");

        imprimirArrei(empresa);

    }

    private static void ordenarPorBubbleSort(Funcionario[] arrei) {

        int tamanho = arrei.length;
        boolean trocado;

        do {
            trocado = false;
            for (int i = 1; i < tamanho; i++) {
                if (arrei[i - 1].getSalario() > arrei[i].getSalario()) {
                    Funcionario temp = arrei[i - 1];
                    arrei[i - 1] = arrei[i];
                    arrei[i] = temp;
                    trocado = true;
                }
            }
            tamanho--;
        } while (trocado);
    }

    private static void imprimirArrei(Funcionario[] arrei) {
        for (Funcionario i : arrei) {
            System.out.println(i.toString());
        }
        System.out.println();
    }
    
}
