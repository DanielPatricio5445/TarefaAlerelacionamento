package br.edu.fatecpg.relacionamento.view;

import br.edu.fatecpg.relacionamento.model.Empresa;
import br.edu.fatecpg.relacionamento.model.Endereco;
import br.edu.fatecpg.relacionamento.model.Funcionario;
import br.edu.fatecpg.relacionamento.model.Pessoa;

public class Main {

    public static void main(String[] args) {
        // Criando um endereço e uma pessoa
        Endereco end = new Endereco("ABC", "123", "PG");
        Pessoa ale = new Pessoa("Ale", end);
        System.out.println(ale);
        
        // Criando funcionários
        Funcionario func1 = new Funcionario("Daniel", "Chefe", 5000);
        Funcionario func2 = new Funcionario("Gilmar", "Coordenador", 4000);

        // Criando uma empresa e adicionando funcionários
        Empresa fatec = new Empresa("Fatec");
        fatec.adicionarFuncionario(func1.getNome(), func1.getCargo(), func1.getSalario());
        fatec.adicionarFuncionario(func2.getNome(), func2.getCargo(), func2.getSalario());
        
    }
}

