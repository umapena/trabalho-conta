package trabalhoconta;

public class Conta {

	private String correntista;
	private int numero;
	private float saldo;
	
	public Conta(String correntista, int numero) {
		this.correntista = correntista;
		this.numero = numero;
		this.saldo = 0;
	}
	
	public void sacar(float valor) {
		if (valor <= 0) {
			System.out.println("Você precisa informar um valor válido para sacar.");
			return;
		}
		else if (valor > this.saldo) { 
			System.out.println("\nSaldo insuficiente.");
			System.out.println("Você precisa de mais R$" + (valor - this.saldo) + " para efetuar um saque deste valor."); 
			return;
		}
		else {
			this.saldo -= valor; 
			System.out.println("\nSaque efetuado com sucesso.");
			System.out.println("Saldo atual: R$" + this.saldo);
		}
	}
	
	public void depositar(float valor) {
		if (valor <= 0) { 
			System.out.println("Você precisa informar um valor válido para depositar.");
			return;
		} 
		else {
			this.saldo += valor;
			System.out.println("\n" + this.correntista + ", seu depósito de R$" + valor + " foi efetuado com sucesso!");
			System.out.println("Saldo atual: " + this.saldo); 
		}
	}
	
	@Override
	public String toString() {
		return "\nNome do correntista: " + correntista + "\nNúmero da conta: " + numero + "\nSaldo disponível: " + saldo + "\n";
	}

}
