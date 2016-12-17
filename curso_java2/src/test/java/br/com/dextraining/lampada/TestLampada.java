package br.com.dextraining.lampada;

import org.junit.Assert;
import org.junit.Test;

public class TestLampada {
	
	@Test
	public void testarLigar() {
		Lampada lampada = new Lampada (60,"Philips");
		Interruptor interruptor = new Interruptor(lampada);
		interruptor.apertar();
		
		Assert.assertTrue(lampada.ligado);
		
		}
	
	@Test
	public void testarDesligar() {
		Lampada lampada = new Lampada (60,"Philips");
		Interruptor interruptor = new Interruptor(lampada);
		interruptor.apertar();
		interruptor.apertar();
		
		Assert.assertFalse(lampada.ligado);
	}

}
