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
			System.out.println(this.getCorrentista() + ", sua conta poupan�a permite somente a emiss�o de um cart�o." +
			"\nPara maiores informa��es, entre em contato com a central.");
			return;
		}
	
		System.out.println(this.getCorrentista() + ", seu pedido foi efetuado com sucesso!" +
		"\nVoc� receber� o seu Cart�o Betha Code D�bito em at� 7 dias �teis.");
		cartaoDebito = true;
		return;
	}
	
}
