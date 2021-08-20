package trabalhoconta;

import java.util.Scanner;

public class UsarConta {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ContaCorrente contaCorrente = null;
		ContaPoupanca contaPoupanca = null;
		
		System.out.println("Bem vindo ao Banco Betha Code!\n");
		
		System.out.print("Informe o nome do(a) correntista: ");
		String correntista = sc.next();
		
		System.out.print("Informe o número da conta: ");
		int numero = sc.nextInt();		
		
		int tipo;
		
		do { 
			
			System.out.println("Tipo de conta: ");
			System.out.println("1 - Conta Corrente");
			System.out.println("2 - Conta Poupança");
			System.out.print("Escolha: ");
			tipo = sc.nextInt();
			
			if (tipo != 1 && tipo != 2) {
				System.out.println("Opção inválida!");
			}
			
		} while (tipo != 1 && tipo != 2);
		
		if (tipo == 1) {
			contaCorrente = new ContaCorrente(correntista, numero, tipo);
		}
		else {
			contaPoupanca = new ContaPoupanca(correntista, numero, tipo);
		}
						
		int opcao; 
			
		do {
			
			System.out.println("\nMenu de opções: ");
			System.out.println("1 - Depositar");
			System.out.println("2 - Sacar");
			System.out.println("3 - Empréstimo");
			System.out.println("4 - Pedir cartão");
			System.out.println("5 - Consultar dados da conta");
			System.out.println("0 - Encerrar programa");
			System.out.print("Informe a opção desejada: ");
			opcao = sc.nextInt();
			
			switch (opcao) {
			case 1: {
				System.out.print("Informe o valor a depositar: ");
				float valor = sc.nextFloat();
				if (tipo == 1) {
					contaCorrente.depositar(valor);
				}
				else {
					contaPoupanca.depositar(valor);
				}
				break;
			}
			case 2: {
				System.out.print("Informe o valor a sacar: ");
				float valor = sc.nextFloat();
				if (tipo == 1) {
					contaCorrente.sacar(valor);
				}
				else {
					contaPoupanca.sacar(valor);
				}
				break;
			}
			case 3: {
				if (tipo == 1) { 
					contaCorrente.emprestimo();
				}
				else {
					System.out.println("Contas do tipo Poupança não permitem empréstimos. Faça um upgrade para ter acesso às nossas condições.");
				}
				break;
			}
			case 4: {
				if (tipo == 1) { 
					contaCorrente.pedirCartao();
				}
				else {
					contaPoupanca.pedirCartaoDebito();
				}
				break;
			}
			case 5: {
				if (tipo == 1) { 
					System.out.println(contaCorrente);
				}
				else {
					System.out.println(contaPoupanca);
				}
				break;
			}
			case 0: {
				System.out.print("Operação encerrada! O Banco Betha Code deseja a você um ótimo dia!");
				break;
			}
			default:
				System.out.println("Opção inválida.");
			}
		} while (opcao != 0);
		
		
	}

}
