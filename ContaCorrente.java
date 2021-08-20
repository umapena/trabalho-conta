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
				System.out.println("Você precisa informar um valor válido para sacar.");
				return;
			}
			
			if (valor > this.getSaldo()) {
				System.out.println("Saldo insuficiente.");
				System.out.println("Você precisa de mais R$" + (valor - this.getSaldo()) + " para efetuar um saque deste valor."); 
				System.out.print("Você gostaria de usar o cheque especial? (Sujeito a taxas) Digite (1) - Sim ou (2) - Não: ");
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
					System.out.println("Você precisa de mais R$" + (valor - this.getSaldo()) + " para efetuar um saque deste valor."); 
					break;
				}
				default:
					System.out.println("Opção inválida!");
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
			System.out.println(this.getCorrentista() + ", você já possui uma unidade do Cartão Betha Code." 
			+ "\nVocê gostaria de solicitar outra unidade? (Taxa: R$25,00) Digite (1) - Sim ou (2) - Não:");
			novoCartao = sc.nextInt();
			if (novoCartao == 1){
				saldo = this.getSaldo() - 25; 
				this.setSaldo(saldo);
				this.cartao = true;
				System.out.println("Saldo atual: R$" + this.getSaldo());
				System.out.println("Pedido efetuado com sucesso!");
				System.out.println("Você receberá o seu novo Cartão Betha Code em até 7 dias úteis.");
				return;
			}
			if (novoCartao == 2) {
				System.out.println("Operação cancelada!");
				return;
			}
			else {
				System.out.println("Opção inválida!");
				return;
			}
		}
		System.out.println(this.getCorrentista() + ", seu pedido foi efetuado com sucesso!" +
		"\nVocê receberá o seu Cartão Betha Code em até 7 dias úteis.");
		this.cartao = true;
		return;
	}
	
	
	public void emprestimo() {
		
		int opc;
		
		System.out.println("Informe o valor desejado (limite R$15.000,00): ");
		float valorEmprestimo = sc.nextFloat();
		
		if (valorEmprestimo < 0) {
			System.out.println("Você precisa informar um valor válido para calcularmos as taxas.");
			return;
		}
		if (valorEmprestimo <= 5000) {
			System.out.println("Valor da taxa: 20%");
			System.out.println("Pagamento em até 6x, a partir de 30 dias");
			System.out.print("Você gostaria de confirmar a operação? (1) - Sim ou (2) - Não: ");
			opc = sc.nextInt();
			
			switch (opc) {
			case 1: {
				saldo = this.getSaldo() + valorEmprestimo; 
				this.setSaldo(saldo);
				System.out.println("Empréstimo realizado com sucesso!");
				System.out.println("Saldo atual: R$" + this.getSaldo());
				break;
			}
			case 2: {
				System.out.println("Operação cancelada!");
				break;
			}
			default:
				System.out.println("Opção inválida!");
			}
			return;
		}
		if (valorEmprestimo <= 10000) {
			System.out.println("Valor da taxa: 30%");
			System.out.println("Pagamento em até 12x, a partir de 30 dias");
			System.out.print("Você gostaria de confirmar a operação? (1) - Sim ou (2) - Não: ");
			opc = sc.nextInt();
			
			switch (opc) {
			case 1: {
				saldo = this.getSaldo() + valorEmprestimo; 
				this.setSaldo(saldo);
				System.out.println("Empréstimo realizado com sucesso!");
				System.out.println("Saldo atual: R$" + this.getSaldo());
				break;
			}
			case 2: {
				System.out.println("Operação cancelada!");
				break;
			}
			default:
				System.out.println("Opção inválida!");
			}
			return;
		}
		if (valorEmprestimo <= 15000) {
			System.out.println("Valor da taxa: 40%");
			System.out.println("Pagamento em até 18x, a partir de 30 dias");
			System.out.print("Você gostaria de confirmar a operação? (1) - Sim ou (2) - Não: ");
			opc = sc.nextInt();
			
			switch (opc) {
			case 1: {
				saldo = this.getSaldo() + valorEmprestimo; 
				this.setSaldo(saldo);
				System.out.println("Empréstimo realizado com sucesso!");
				System.out.println("Saldo atual: R$" + this.getSaldo());
				break;
			}
			case 2: {
				System.out.println("Operação cancelada!");
				break;
			}
			default:
				System.out.println("Opção inválida!");
			}
			return;
		}
		if (valorEmprestimo > 15000) {
			System.out.println("Valor acima do limite!");
			return;
		}
		
	}
	
	
	
}
