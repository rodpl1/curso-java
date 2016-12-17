package br.com.dextraining.conta;

public class Conta {

	
	
	private double saldo;
	
	public Conta(double saldo){
		this.saldo = saldo;
	}
	
	public void sacar(double valorsaque) {
			if (valorsaque > saldo) {
				System.out.println("Não é permitido realizar o saque");
					
			}else {
				
				saldo = saldo - valorsaque;
			}
		
		
		
	}
	public void depositar (double valordeposito) {
		if (valordeposito >0) {
			
			saldo = saldo + valordeposito;
		}else {
			
			System.out.println("Não é permitido depositar esse valor");
		}
		
	}
	
	public double VerSaldo () {
		System.out.println(saldo);		
		return saldo;
		
	}
	
}
