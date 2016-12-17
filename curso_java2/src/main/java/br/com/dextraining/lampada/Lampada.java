package br.com.dextraining.lampada;

public class Lampada {
	
	public int numerowatts;
	public String fabricante;
	public boolean ligado;
	
	
	public Lampada(int numerowatts, String fabricante) {
		this.numerowatts = numerowatts;
		this.fabricante = fabricante;
		this.ligado = false;
		
		}

	
	public void ligar() {

		System.out.println("Ligado...");
		ligado = true;

	}
	
	public void desligar() {
		System.out.println("Desligado...");
		ligado = false;
	}

}
