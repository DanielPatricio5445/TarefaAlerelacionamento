package br.edu.fatecpg.relacionamento.model;

public class Endereco {
	String rua;
	String numero;
	String cidade;
	

	public Endereco(String rua, String numero, String cidade) {
		super();
		this.rua = rua;
		this.numero = numero;
		this.cidade = cidade;
	}


	@Override
	public String toString() {
		return "Endereco [rua=" + rua + ", numero=" + numero + ", cidade=" + cidade + "]";
	}

}
