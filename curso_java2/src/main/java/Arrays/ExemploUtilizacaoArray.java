package Arrays;

import br.com.dextraining.conta.Conta;

public class ExemploUtilizacaoArray {
	
	public static void main (String[] args) {
		int tamanho = 5;
		int valores[] = new int [5];
		int outroValores[] = {1,2,3,4,5};
		String nomes[] = new String [tamanho];
		Conta contas[] = new Conta[tamanho];
		
		valores[3] = 500;
		
		System.out.println("Conteudo de 'valores':");
		for (int i = 0; i <tamanho; i++) {
			
			int valor = outroValores [i];
			System.out.println("[" + i +")=" + outroValores);
			
		}
				
		System.out.println("Conteudo de 'contas':");
		for (int i = 0; i <tamanho; i++) {
			
			int valor = outroValores [i];
			System.out.println("[" + i +")=" + contas);
	}

}
}
