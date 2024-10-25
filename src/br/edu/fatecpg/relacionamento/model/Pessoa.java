package br.edu.fatecpg.relacionamento.model;

public class Pessoa {
	String nome;
	Endereco endereco;
	
	public Pessoa(String nome, Endereco endereco) {
		this.nome = nome;
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", endereco=" + endereco + "]";
	}
	
	

}
