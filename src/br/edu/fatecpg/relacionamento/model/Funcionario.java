package br.edu.fatecpg.relacionamento.model;
import java.util.Scanner; 
public class Funcionario {
    private String nome;
    private String cargo;
    private int salario;

    // Construtor
    public Funcionario(String nome, String cargo, int salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    public int getSalario() {
        return salario;
    }

    // Método toString
    @Override
    public String toString() {
        return "Funcionario [nome=" + nome + ", cargo=" + cargo + ", salario=" + salario + "]";
    }
}

