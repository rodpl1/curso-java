package br.com.dextraining.modificadorstatic;

public class ExemploStatic {
	
	static{
		
		System.out.println("Executando trecho estatico");
		
	}
	public static void mostrarMensagem(){
		System.out.println("Chamando metodo1");
	}
	
	public ExemploStatic() {
		System.out.println("Executando construtor");
	}
	
}
