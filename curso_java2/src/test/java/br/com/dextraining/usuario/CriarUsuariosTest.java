package br.com.dextraining.usuario;

import org.junit.Assert;
import org.junit.Test;

import br.com.dextraining.modificadores.Usuario;
import br.com.dextraining.usuario.*;

public class CriarUsuariosTest {
	
	@Test 
	public void testarComSenhaValida() {
		String senhaValida = "123456789a";
		
		Usuario usuario = new Usuario();
		usuario.setNome("fulano");
		usuario.setEmail("fulano@email.com");
		usuario.setSenha(senhaValida);
		
		Assert.assertEquals(senhaValida, usuario.getSenha());
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testarComSenhaInvalidaMenosCaracteresQuePermitido() {
		String senhaValida = "123456789a";
		String senhaInvalida = "123a";
		
		Usuario usuario = new Usuario();
		usuario.setNome("fulano");
		usuario.setEmail("fulano@email.com");
		usuario.setSenha(senhaValida);
		usuario.setSenha(senhaInvalida);
		
		Assert.assertEquals(senhaValida, usuario.getSenha());
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testarComSenhaInvalidaFaltandoNumeros() {
		String senhaValida = "123456789a";
		String senhaInvalida = "aaaaaasd";
		
		Usuario usuario = new Usuario();
		usuario.setNome("fulano");
		usuario.setEmail("fulano@email.com");
		usuario.setSenha(senhaValida);
		usuario.setSenha(senhaInvalida);
		
		Assert.assertEquals(senhaValida, usuario.getSenha());
	
}
	
	@Test (expected = IllegalArgumentException.class)
	public void testarComSenhaInvalidaFaltandoLetras() {
		String senhaValida = "123456789a";
		String senhaInvalida = "1234567890";
		
		Usuario usuario = new Usuario();
		usuario.setNome("fulano");
		usuario.setEmail("fulano@email.com");
		usuario.setSenha(senhaValida);
		usuario.setSenha(senhaInvalida);
		
		Assert.assertEquals(senhaValida, usuario.getSenha());
	}
}
