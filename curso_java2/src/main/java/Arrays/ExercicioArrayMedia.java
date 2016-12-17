package Arrays;

import java.util.Scanner;

public class ExercicioArrayMedia {

	public static void main(String[] args) {
		int valores[] = new int[3];
		Scanner scanner = new Scanner(System.in);

		int soma = 0;
		for (int i = 0; i < valores.length; i++) {
			System.out.println(" Digite o  Valor" + i + ":");
			valores[i] = scanner.nextInt();

		}

		for (int i = 0; i < valores.length; i++) {
			soma += valores[i];
		}
		System.out.println(soma / valores.length);
		
		scanner.close();

	}

}
