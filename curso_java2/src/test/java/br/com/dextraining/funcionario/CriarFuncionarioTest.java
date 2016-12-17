package br.com.dextraining.funcionario;

import org.junit.*;

import br.com.dextraining.bonificacao.Funcionario;
import br.com.dextraining.conta.Conta;
import br.com.dextraining.funcionario.*;
import br.com.dextraining.modificadores.Usuario;


public class CriarFuncionarioTest {
	
	@Test
	public void testarSalario() {
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("fulano");
		funcionario.setSalario(1000);
		funcionario.setCargo("Administrador");
		funcionario.setPorcentagemBonificacao(0.10);
	}
		
	@Test (expected = IllegalArgumentException.class)
	public void testarSalarioInvalido() {
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("fulano");
		funcionario.setSalario(1000);
		funcionario.setSalario(800);
		funcionario.setCargo("Administrador");
		funcionario.setPorcentagemBonificacao(0.10);
				

	}
	
	@Test
	public void testarBonificacaoValida() {
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("fulano");
		funcionario.setSalario(1000);
		funcionario.setCargo("Administrador");
		funcionario.setPorcentagemBonificacao(0.10);
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testarBonificacaoInvalido() {
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("fulano");
		funcionario.setSalario(1000);
		funcionario.setCargo("Administrador");
		funcionario.setPorcentagemBonificacao(0.10);
		funcionario.setPorcentagemBonificacao(0.09);
	}

}
