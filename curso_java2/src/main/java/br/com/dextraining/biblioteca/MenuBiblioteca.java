package br.com.dextraining.biblioteca;

import java.util.Scanner;

public class MenuBiblioteca {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int opcao = mostrarMenu(scanner);
		while (opcao != 5) {
			if (opcao == 1) {
				System.out.println("Adicionar Livro");
			} else if (opcao == 2) {
				System.out.println("Buscar Livro");
			} else if (opcao == 3) {
				System.out.println("Remover Liro");
			} else if (opcao == 4){
				System.out.println("Listar Livros");
			}else {
				System.out.println("Opção Inválida");
			}
			opcao = mostrarMenu(scanner);
		}
		scanner.close();
	}

	private static int mostrarMenu(Scanner scanner) {
		System.out.println("1. Adicionar Livro");
		System.out.println("2. Buscar Livro");
		System.out.println("3. Remover Livro");
		System.out.println("4. Listar Livros");
		System.out.println("5. Sair");
		return scanner.nextInt();
		
	}
	
	

}
