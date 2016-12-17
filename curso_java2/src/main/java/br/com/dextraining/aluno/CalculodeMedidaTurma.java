package br.com.dextraining.aluno;

import java.util.Scanner;

public class CalculodeMedidaTurma {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Informe a quantidade: ");
		int quantidadeAlunos = scanner.nextInt();

		aluno alunos[] = new aluno[quantidadeAlunos];

		for (int indiceAlunoAtual = 0; indiceAlunoAtual < quantidadeAlunos; indiceAlunoAtual++) {
			scanner.nextLine();
			System.out.println(" Digite  o nome do Aluno:");
			String nome = scanner.nextLine();

			aluno aluno = new aluno(nome);

			for (int indiceNota = 0; indiceNota < 3; indiceNota++) {
				System.out.println("Digite a nota do Aluno:");
				aluno.notas[indiceNota] = scanner.nextDouble();
			}
			alunos[indiceAlunoAtual] = aluno;
		}

		for (int i = 0; i < quantidadeAlunos; i++) {
			System.out.print(alunos[i].nome);

			for (int IndiceNota = 0; IndiceNota < 3; IndiceNota++) {
				System.out.print(" " + alunos[i].notas[IndiceNota]);
				
			}
			System.out.print(" " + alunos[i].getMedia());	
			System.out.println();
		}
		scanner.close();

	}

}
