package br.com.dextraining.pessoa;

public class Pessoa {

	public String nome;
	public String rg;
	public String cpf;

	public Pessoa(String nome, String rg, String cpf) {
		this.nome = nome;
		this.rg = rg;
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", rg=" + rg + ", cpf=" + cpf + "]";
	}

}
