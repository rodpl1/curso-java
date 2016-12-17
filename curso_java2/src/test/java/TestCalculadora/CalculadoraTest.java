package TestCalculadora;

import org.junit.*;

import br.com.dextraining.calculadora.Calculadora;

public class CalculadoraTest {

	Calculadora calculadora = new Calculadora();

	@Test
	public void testaSoma() {

		double resultado = calculadora.somar(10, 15);
		Assert.assertEquals(Double.valueOf(25), Double.valueOf(resultado));

	}

	@Test
	public void testaSubtracao() {

		double resultado = calculadora.subtrair(10, 15);
		Assert.assertEquals(Double.valueOf(-5), Double.valueOf(resultado));

	}

	@Test
	public void testaDivisao() {

		double resultado = calculadora.dividir(20, 10);
		Assert.assertEquals(Double.valueOf(2), Double.valueOf(resultado));

	}

	@Test
	public void testaMultiplicacao() {

		double resultado = calculadora.multiplicacao(20, 10);
		Assert.assertEquals(Double.valueOf(200), Double.valueOf(resultado));

	}

}
