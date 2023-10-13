
public class Conta {
	
	private double saldo;
	private String nome;
	
	public Conta(String nome) {
		super();
		saldo = 0;
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void depositar(double valor) {
			setSaldo(getSaldo() + valor);
			System.out.println("Depósito de R$" + valor + " realizado com sucesso! \nSaldo Atual: R$" + getSaldo());
	}
	
	public void sacar(double valor) {
		if(valor == 0) {
			System.out.println("Erro! Não é possível realizar o saque de valores inferiores à R$0.01");
		}
		
		else if(valor > getSaldo()) {
			System.out.println("Erro! Não é possível realizar o saque de valores maiores do que o saldo atual em sua conta.\nSaldo Atual: R$" + getSaldo());
		}
		
		else {
			setSaldo(getSaldo() - valor);
			System.out.println("Saque de R$" + valor + " realizado com sucesso!\nSaldo Atual: R$" + getSaldo());
		}
	}

	public String toString() {
		return "Conta: " + getNome() + "\nSaldo Atual: R$" + getSaldo();
	}
	
}