package br.com.dextraining.modificadores;

public class ValidadorSenha {

	public static boolean validar(String senha) {
		
		if (senha.length()< 5){
			return false;
		}
		// TODO Auto-generated method stub
		return contemLetra(senha) && contemNumero(senha);
	}
	
	public static boolean contemLetra(String senha) {
		for (char caractere : senha.toCharArray()) {
		if (Character.isLetter (caractere)){
		return true;
		}
	}
	return false;
	
	}
	public static boolean contemNumero(String senha) {
		for (Character charactere : senha.toCharArray()) {
			if (Character.isDigit(charactere)) {
			return true;	
			}
		}
		return false;
	}
	
//	//public static boolean validar(String senha){
//	
//		return false;
//	}

}
