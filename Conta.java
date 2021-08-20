package trabalhoconta;

public class Conta {

	private String correntista;
	private int numero;
	private int tipo;
	private float saldo;
	
	
	public Conta(String correntista, int numero, int tipo) {
		this.correntista = correntista;
		this.numero = numero;
		this.tipo = tipo;
		this.saldo = 0;
	}


	public String getCorrentista() {
		return correntista;
	}


	public void setCorrentista(String correntista) {
		this.correntista = correntista;
	}


	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public int getTipo() {
		return tipo;
	}


	public void setTipo(int tipo) {
		this.tipo = tipo;
	}


	public float getSaldo() {
		return saldo;
	}


	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}


	public void sacar(float valor) {
		if (valor <= 0) {
			System.out.println("Você precisa informar um valor válido para sacar.");
			return;
		}
		
		if (valor > this.saldo) { 
			System.out.println("\nSaldo insuficiente.");
			System.out.println("Você precisa de mais R$" + (valor - this.saldo) + " para efetuar um saque deste valor."); 
			return;
		}

			this.saldo -= valor; 
			System.out.println("\nSaque efetuado com sucesso.");
			System.out.println("Saldo atual: R$" + this.saldo);
		
	}
	
	public void depositar(float valor) {
		if (valor <= 0) { 
			System.out.println("Você precisa informar um valor válido para depositar.");
			return;
		} 
		
			this.saldo += valor;
			System.out.println("\n" + this.correntista + ", seu depósito de R$" + valor + " foi efetuado com sucesso!");
			System.out.println("Saldo atual: " + this.saldo); 
		
	}
	
	@Override
	public String toString() {
		return "\nNome do correntista: " + correntista + "\nNúmero da conta: " + numero + 
				"\nTipo de conta (1 - Conta Corrente ou 2 - Conta Poupança): " + tipo + "\nSaldo disponível: " + saldo + "\n";
	}

}
