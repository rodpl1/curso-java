package br.com.dextraining.monitor;



import org.junit.*;

public class MonitorTest {

	Monitor monitor;

	@Test
	public void testarCriacaoMonitor() {
		monitor = new Monitor(20, "1", "Preto");
		monitor.cor = "Preta";
		monitor.polegadas = 20;
		monitor.numeroSerie = "123ABC";
		Assert.assertNotNull(monitor);
		
		

		
		

	}

}
