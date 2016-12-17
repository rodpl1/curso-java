package br.com.dextraining.conta;

import org.junit.Assert;
import org.junit.Test;

public class TestConta {

	@Test
	public void testarConta() {
		Conta conta = new Conta(1000d);
		conta.depositar(2000d);
		Assert.assertEquals(Double.valueOf(3000), Double.valueOf(conta.saldo));
				
		conta.sacar(300d);
		Assert.assertEquals(Double.valueOf(2700), Double.valueOf(conta.saldo));
		
		
	}

}
