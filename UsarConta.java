package trabalhoconta;

import java.util.Scanner;

public class UsarConta {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o nome do(a) correntista: ");
		String correntista = sc.next();
		
		System.out.print("Informe o número da conta: ");
		int numero = sc.nextInt();
		
		Conta minhaConta = new Conta(correntista, numero);
				
		int opcao; 
		
		do {
			
			System.out.println("\nMenu de opções: ");
			System.out.println("1 - Depositar");
			System.out.println("2 - Sacar");
			System.out.println("3 - Consultar dados da conta");
			System.out.println("0 - Encerrar programa");
			System.out.print("Informe a opção desejada: ");
			opcao = sc.nextInt();
			
			switch (opcao) {
			case 1: {
				System.out.print("Informe o valor a depositar: ");
				float valor = sc.nextFloat();
				minhaConta.depositar(valor);
				break;
			}
			case 2: {
				System.out.print("Informe o valor a sacar: ");
				float valor = sc.nextFloat();
				minhaConta.sacar(valor);
				break;
			}
			case 3: {
				System.out.print(minhaConta);
				break;
			}
			case 0: {
				System.out.print("Operação encerrada!");
				break;
			}
			default:
				System.out.println("Opção inválida.");
			}
		} while (opcao != 0);
		
		
	}

}
