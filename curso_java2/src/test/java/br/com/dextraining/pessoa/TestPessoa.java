package br.com.dextraining.pessoa;

import java.util.Scanner;

public class TestPessoa {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe o nome da pessoa: ");
		String nome = scanner.nextLine();
		
		System.out.println("Informe o RG da pessoa: ");
		String rg = scanner.nextLine();
		
		System.out.println("Informe o CPF da pessoa: ");
		String cpf = scanner.nextLine();
		
		Pessoa pessoa = new Pessoa(nome, rg, cpf);
		System.out.println(pessoa);
		
		scanner.close();
	}


}
