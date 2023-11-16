public class Exerc03_ContasBancarias {

    public static void main(String[] args) {

        int quantidadeDeContas = 20;
        double saldoInicial = 1000.0;

        Banco banco = new Banco(quantidadeDeContas, saldoInicial);
        ContaBancaria[] contasBacarias = banco.getContasBancarias();

        for (int i = 0; i < quantidadeDeContas; i++) {

            int contaOrigem = i;
            ContaBancaria contaDestino = contasBacarias[(i + 1) % quantidadeDeContas];

            double valor = 100.0;

            Thread thread = new Thread(() -> {
                contasBacarias[contaOrigem].transferencia(contaDestino, valor);
            });
            thread.start();

        }

        try {
            
        } catch (Exception e) {
            System.err.println("Ops, deu erro: " + e.getMessage());
        }

        double saldoTotal = banco.getSaldoTotal();
        System.out.println("Saldo total em todas as contas do banco: " + saldoTotal);

    }
}
