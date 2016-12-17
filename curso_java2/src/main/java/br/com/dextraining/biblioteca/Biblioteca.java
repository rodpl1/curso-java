package br.com.dextraining.biblioteca;

public class Biblioteca {

	private static final int MAX_LIVROS = 100;
	private Livro livros[];
	private int quantidadeLivros = 0;

	public Biblioteca() {
		this.livros = new Livro[MAX_LIVROS];
	}

	public boolean adicionar(Livro livro) {
		Livro livroEncontrado = buscar(livro.getCodigo());
		if (livroEncontrado != null) {
			return false;
		}
		livros[quantidadeLivros++] = livro;
		return true;
	}

	public Livro buscar(String codigo) {
		for (int i = 0; i < quantidadeLivros; i++) {
			Livro livro = livros[i];
			if (codigo.equalsIgnoreCase(livro.getCodigo()))

				return livro;
		}
		return null;
	}

	public boolean remover(String codigo) {
		for (int i = 0; i < quantidadeLivros; i++) {
			Livro livro = livros[i];
			if (codigo.equalsIgnoreCase(livro.getCodigo())) {
				for (int j = 1; j < quantidadeLivros - 1; j++) {
					livros[j] = livros[j + 1];
				}
				livros[quantidadeLivros - 1] = null;
				quantidadeLivros--;
				return true;
			}
		}
		return false;

	}

}