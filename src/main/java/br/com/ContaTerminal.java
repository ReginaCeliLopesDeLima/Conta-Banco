package br.com;

import java.util.Scanner;

public class ContaTerminal {
	private int numeroDaConta;
	private String agencia;
	private String nomeCliente;
	private float saldo;
	
	Scanner scanner = new Scanner(System.in);
	
	public void criarConta() {
		System.out.println("Por favor, digite o nome da Agência: ");
		agencia = scanner.next();
		System.out.println("Por favor, digite o número da conta: ");
		numeroDaConta = scanner.nextInt();
		System.out.println("Por favor, digite o seu nome: ");
		nomeCliente = scanner.next();
		System.out.println("Por favor, digite o seu saldo: ");
		saldo = scanner.nextFloat();
		
		System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é : "
							+ agencia + " conta " + numeroDaConta +	" e o seu saldo " + saldo + " já está disponível para saque");
	
		
	}
}
