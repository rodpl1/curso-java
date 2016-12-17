package br.com.dextraining.lampada;

public class Interruptor {

	public Lampada lampada;
	
	public Interruptor(Lampada lampada) {
		this.lampada = lampada;

	}

	public void apertar() {
		if (lampada.ligado == true) {
			lampada.desligar();
		} else
			lampada.ligar();

	}

}
