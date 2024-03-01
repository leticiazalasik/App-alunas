package br.com.helloWorld;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//String nome = "Guilherme";
		//Integer codigo = 7;
		
		Scanner scan = new Scanner(System.in); 
		
		int meses=5;
		double salario=0.0; 
		
		System.out.print("Digite seu nome:");
		String nome = scan.next();
		
		System.out.print("Digite seu código:");
		Integer codigo = scan.nextInt();
		
		System.out.print("Digite seu status:");
		Boolean status = scan.nextBoolean();
		
		System.out.print("Digite seu código de setor:");
		Integer codigoSetor = scan.nextInt();
		
		System.out.print("Digite seu salário:");
		salario = scan.nextDouble();
		
		System.out.println("Código: " + codigo);
		System.out.println("Nome: " + nome);
		
		

		
		if (status) {
			System.out.println("Cadastro ativo!");
		} else {
			System.out.println("Cadastro inativo!");
			

		}
		
		switch (codigoSetor) {
		case 1: System.out.println("Setor: Tecnologia");
		break;
		
		case 2: System.out.println("Setor: Compras");
		break;
		
		case 3: System.out.println("Setor: Desenvolvimento");
		break;
		
		default: 
			System.out.println("Setor não encontrado.");
		}
		
		System.out.println("*** Extrato de pagamento ***");
		
		for (int cont =1; cont <= meses; cont++) {
			System.out.println("Mês["+cont +"]:Salário - R$" + salario);
		}
	}

}
