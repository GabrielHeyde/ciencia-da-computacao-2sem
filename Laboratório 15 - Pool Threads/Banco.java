public class Banco {

    private ContaBancaria[] contasBancarias;

    public Banco(int numeroContas, double saldoInicial) {
        this.contasBancarias = new ContaBancaria[numeroContas];
        for (int i = 0; i < numeroContas; i++) {
            this.contasBancarias[i] = new ContaBancaria(i, saldoInicial);
        }
    }

    public ContaBancaria[] getContasBancarias() {
        return contasBancarias;
    }

    public double getSaldoTotal() {
        double total = 0;
        for (ContaBancaria contaBancaria : this.contasBancarias) {
            total += contaBancaria.getSaldo();
        }

        return total;
    }

}
