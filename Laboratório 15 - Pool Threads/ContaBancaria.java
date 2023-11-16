public class ContaBancaria {

    private int numero;
    private double saldo;

    public ContaBancaria(int numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public synchronized void transferencia(ContaBancaria destino, double valor){
        if (this.saldo >= valor) {
            this.saldo -= valor;
            destino.deposito(valor);
            System.out.println("Transferência de " + valor + " da conta " + this.numero + " para a conta " + destino.numero);
        }
    }

    public void deposito(double valor) {
        this.saldo += valor;
    }

    public double getSaldo() {
        return saldo;
    }
    
}
