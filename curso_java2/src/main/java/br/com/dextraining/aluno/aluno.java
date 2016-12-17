package br.com.dextraining.aluno;

public class aluno {

	private String nome;
	private double notas[];

	public aluno(String nome) {

		this.nome = nome;
		this.notas = new double[3];
	}

	public double getMedia() {
		double soma = 0;
		for (int i = 0; i < notas.length; i++) {
			soma += notas[i];
		}
		return soma / notas.length;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		if (notas.length !=3){
			
		}
		this.notas = notas;
	}
	
	
}
