package br.com.dextraining.televisao;

public class Televisao {

	
	public String modelo;
	public String marca;
	public int polegadas;
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getPolegadas() {
		return polegadas;
	}
	public void setPolegadas(int polegadas) {
		this.polegadas = polegadas;
	}
	
	public void ligar(){
		System.out.println("Ligar Televisão");
		
	}
	
	public void desligar(){
		System.out.println("Desligar Televisão");
		
	}
	
	public void aumentarVolume(){
		System.out.println("Aumentar Volume");
		
	}
	
	public void diminuirVolume(){
		System.out.println("Diminuir Volume");
	}
	
	private void ajustarVoltagem(){
		System.out.println("Ajustar Tensão");
		
	}
	
	public void aumentarCanal(){
		System.out.println("Aumentar Canal");
		
	}
	
	public void diminuirCanal(){
		System.out.println("Diminuir Canal");
		
	}
	
	private void ligarTela(){
		System.out.println("Ligar Tela");
		
	}
	
	private void regularDiodo(){
		System.out.println("Regular Diodo");
		
		
	}
	
}
