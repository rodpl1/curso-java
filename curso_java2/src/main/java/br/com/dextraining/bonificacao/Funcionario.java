package br.com.dextraining.bonificacao;

public class Funcionario {

	private String nome;
	private double salario;
	private String cargo;
	private double porcentagemBonificacao;

	public String getNome() {
		return nome;

	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		if (salario < this.salario){
			throw new IllegalArgumentException("Não é possível aumentar o salário");
			
		}
		this.salario = salario;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public double getPorcentagemBonificacao() {
		return porcentagemBonificacao;
	}

	public void setPorcentagemBonificacao(double porcentagemBonificacao) {
		if (porcentagemBonificacao < this.porcentagemBonificacao){
			throw new IllegalArgumentException("Não é possível aumentar a porcentagem de Bonificação");
		}
		this.porcentagemBonificacao = porcentagemBonificacao;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
