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
	
	public boolean sacar(float valor) {
		if (valor > saldo) { 
			System.out.println("\nSaldo insuficiente.");
			System.out.println("Você precisa de mais R$" + (valor - this.saldo) + " para efetuar um saque deste valor.");
			return false; 
		}
		else {
			saldo -= valor; 
			System.out.println("\nSaque efetuado com sucesso.");
			System.out.println("Saldo atual: R$" + this.saldo);
			return true; 
		}
	}
	
	public void depositar(float valor) {
		saldo += valor;
		System.out.println("\n" + this.correntista + ", seu depósito de R$" + valor + " foi efetuado com sucesso!");
		System.out.println("Saldo atual: " + this.saldo);
	}
	
	@Override
	public String toString() {
		return "\nNome do correntista: " + correntista + "\nNúmero da conta: " + numero + "\nSaldo disponível: " + saldo + "\n";
	}

}
