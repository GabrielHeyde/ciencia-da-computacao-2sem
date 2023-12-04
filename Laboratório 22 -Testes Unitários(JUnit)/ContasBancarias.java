public class ContasBancarias {

    private String numeroConta;
    private double saldo;
    private String moeda;

    public ContasBancarias(String numeroConta, double saldo, String moeda) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.moeda = moeda;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getMoeda() {
        return moeda;
    }

    public void setMoeda(String moeda) {
        this.moeda = moeda;
    }

    public boolean transferencia(ContasBancarias conta, double valor, ContasBancarias conta2) {
        if (valor > conta.getSaldo()) {
            throw new IllegalArgumentException("Saldo insuficiente para transferência.");
        } else if (!conta.getMoeda().equals(conta2.getMoeda())) {
            throw new IllegalArgumentException(
                    "Não é possível realizar a transferência entre contas que operam com moedas distintas.");
        } else {
            conta.setSaldo(conta.getSaldo() - valor);
            conta2.setSaldo(conta2.getSaldo() + valor);
            return true;
        }
    }

    public boolean sacar(ContasBancarias conta, double valor) {
        if (valor > conta.getSaldo()) {
            throw new IllegalArgumentException("Saldo insuficiente para saque.");
        } else {
            conta.setSaldo(conta.getSaldo() - valor);
            System.out.println("Valor sacado com sucesso!");
            return true;
        }
    }

}
