package trabalhoconta;

public class ContaPoupanca extends Conta {

	private boolean cartaoDebito = false;
	int novoTipo;

	public ContaPoupanca(String correntista, int numero, int tipo) {
		super(correntista, numero, tipo);
		this.cartaoDebito = false;
	}
	
	public void pedirCartaoDebito() {
		if(cartaoDebito) {
			System.out.println(this.getCorrentista() + ", sua conta poupança permite somente a emissão de um cartão." +
			"\nPara maiores informações, entre em contato com a central.");
			return;
		}
	
		System.out.println(this.getCorrentista() + ", seu pedido foi efetuado com sucesso!" +
		"\nVocê receberá o seu Cartão Betha Code Débito em até 7 dias úteis.");
		cartaoDebito = true;
		return;
	}
	
}
