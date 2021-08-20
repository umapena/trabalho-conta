package trabalhoconta;

import java.util.Scanner;

public class ContaCorrente extends Conta {
	
	private float saldo;
	private boolean cartao;

	Scanner sc = new Scanner(System.in);
	
	public ContaCorrente(String correntista, int numero, int tipo) {
		super(correntista, numero, tipo);
		this.cartao = false;
	}

	@Override
	public void sacar(float valor) {
			
			if (valor <= 0) {
				System.out.println("Voc� precisa informar um valor v�lido para sacar.");
				return;
			}
			
			if (valor > this.getSaldo()) {
				System.out.println("Saldo insuficiente.");
				System.out.println("Voc� precisa de mais R$" + (valor - this.getSaldo()) + " para efetuar um saque deste valor."); 
				System.out.print("Voc� gostaria de usar o cheque especial? (Sujeito a taxas) Digite (1) - Sim ou (2) - N�o: ");
				int cheque = sc.nextInt();
				
				switch (cheque) {
				case 1: {
					saldo = this.getSaldo() - valor; 
					this.setSaldo(saldo);
					System.out.println("\nSaque efetuado com sucesso.");
					System.out.println("Saldo atual: R$" + this.getSaldo());
					break;
				}
				case 2: {
					System.out.println("\nSaldo insuficiente.");
					System.out.println("Voc� precisa de mais R$" + (valor - this.getSaldo()) + " para efetuar um saque deste valor."); 
					break;
				}
				default:
					System.out.println("Op��o inv�lida!");
				}
				return;
			}

			saldo = this.getSaldo() - valor; 
			this.setSaldo(saldo);
			System.out.println("\nSaque efetuado com sucesso.");
			System.out.println("Saldo atual: R$" + this.getSaldo());
			return;
	}
		
	
	public void pedirCartao() {
		
		int novoCartao;
		
		if(cartao) {
			System.out.println(this.getCorrentista() + ", voc� j� possui uma unidade do Cart�o Betha Code." 
			+ "\nVoc� gostaria de solicitar outra unidade? (Taxa: R$25,00) Digite (1) - Sim ou (2) - N�o:");
			novoCartao = sc.nextInt();
			if (novoCartao == 1){
				saldo = this.getSaldo() - 25; 
				this.setSaldo(saldo);
				this.cartao = true;
				System.out.println("Saldo atual: R$" + this.getSaldo());
				System.out.println("Pedido efetuado com sucesso!");
				System.out.println("Voc� receber� o seu novo Cart�o Betha Code em at� 7 dias �teis.");
				return;
			}
			if (novoCartao == 2) {
				System.out.println("Opera��o cancelada!");
				return;
			}
			else {
				System.out.println("Op��o inv�lida!");
				return;
			}
		}
		System.out.println(this.getCorrentista() + ", seu pedido foi efetuado com sucesso!" +
		"\nVoc� receber� o seu Cart�o Betha Code em at� 7 dias �teis.");
		this.cartao = true;
		return;
	}
	
	
	public void emprestimo() {
		
		int opc;
		
		System.out.println("Informe o valor desejado (limite R$15.000,00): ");
		float valorEmprestimo = sc.nextFloat();
		
		if (valorEmprestimo < 0) {
			System.out.println("Voc� precisa informar um valor v�lido para calcularmos as taxas.");
			return;
		}
		if (valorEmprestimo <= 5000) {
			System.out.println("Valor da taxa: 20%");
			System.out.println("Pagamento em at� 6x, a partir de 30 dias");
			System.out.print("Voc� gostaria de confirmar a opera��o? (1) - Sim ou (2) - N�o: ");
			opc = sc.nextInt();
			
			switch (opc) {
			case 1: {
				saldo = this.getSaldo() + valorEmprestimo; 
				this.setSaldo(saldo);
				System.out.println("Empr�stimo realizado com sucesso!");
				System.out.println("Saldo atual: R$" + this.getSaldo());
				break;
			}
			case 2: {
				System.out.println("Opera��o cancelada!");
				break;
			}
			default:
				System.out.println("Op��o inv�lida!");
			}
			return;
		}
		if (valorEmprestimo <= 10000) {
			System.out.println("Valor da taxa: 30%");
			System.out.println("Pagamento em at� 12x, a partir de 30 dias");
			System.out.print("Voc� gostaria de confirmar a opera��o? (1) - Sim ou (2) - N�o: ");
			opc = sc.nextInt();
			
			switch (opc) {
			case 1: {
				saldo = this.getSaldo() + valorEmprestimo; 
				this.setSaldo(saldo);
				System.out.println("Empr�stimo realizado com sucesso!");
				System.out.println("Saldo atual: R$" + this.getSaldo());
				break;
			}
			case 2: {
				System.out.println("Opera��o cancelada!");
				break;
			}
			default:
				System.out.println("Op��o inv�lida!");
			}
			return;
		}
		if (valorEmprestimo <= 15000) {
			System.out.println("Valor da taxa: 40%");
			System.out.println("Pagamento em at� 18x, a partir de 30 dias");
			System.out.print("Voc� gostaria de confirmar a opera��o? (1) - Sim ou (2) - N�o: ");
			opc = sc.nextInt();
			
			switch (opc) {
			case 1: {
				saldo = this.getSaldo() + valorEmprestimo; 
				this.setSaldo(saldo);
				System.out.println("Empr�stimo realizado com sucesso!");
				System.out.println("Saldo atual: R$" + this.getSaldo());
				break;
			}
			case 2: {
				System.out.println("Opera��o cancelada!");
				break;
			}
			default:
				System.out.println("Op��o inv�lida!");
			}
			return;
		}
		if (valorEmprestimo > 15000) {
			System.out.println("Valor acima do limite!");
			return;
		}
		
	}
	
	
	
}
