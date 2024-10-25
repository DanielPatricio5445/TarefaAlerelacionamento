package br.edu.fatecpg.relacionamento.model;

public class Empresa {
    private String nome;
    private Funcionario[] funcionarios;
    private CLiente[] clientes;
    private int numFuncionarios;
    private int numClientes;

    public Empresa(String nome) {
        this.nome = nome;
        this.funcionarios = new Funcionario[10];  // Até 10 funcionários
        this.clientes = new CLiente[5];  // Até 5 clientes
        this.numFuncionarios = 0;
        this.numClientes = 0;
    }

    public void adicionarFuncionario(String nome, String cargo, int salario) {
        if (numFuncionarios < funcionarios.length) {
            this.funcionarios[numFuncionarios++] = new Funcionario(nome, cargo, salario);
        } else {
            throw new IllegalStateException("Limite de funcionários atingido.");
        }
    }

    public void exibirFuncionarios() {
        if (numFuncionarios == 0) {
            System.out.println("Nenhum funcionário cadastrado.");
            return;
        }
        for (int i = 0; i < numFuncionarios; i++) {
            System.out.println(funcionarios[i].toString());
        }
    }

    public void adicionarCliente(String nome, String email) {
        if (numClientes < clientes.length) {
            this.clientes[numClientes++] = new CLiente(nome, email);
        } else {
            throw new IllegalStateException("Limite de clientes atingido.");
        }
    }

    public void exibirClientes() {
        if (numClientes == 0) {
            System.out.println("Nenhum cliente cadastrado.");
            return;
        }
        for (int i = 0; i < numClientes; i++) {
            System.out.println(clientes[i].toString());
        }
    }

    public void calcularFolhaSalarial() {
        double totalSalarios = 0;
        for (int i = 0; i < numFuncionarios; i++) {
            totalSalarios += funcionarios[i].getSalario();
        }
        System.out.println("Total gasto em salários: " + totalSalarios);
    }

    public double calcularMediaSalarial() {
        if (numFuncionarios == 0) {
            throw new IllegalStateException("Não há funcionários para calcular a média salarial.");
        }
        
        Calculadora calc = new Calculadora();
        double totalSalarios = 0;

        for (int i = 0; i < numFuncionarios; i++) {
            totalSalarios = calc.soma(totalSalarios, funcionarios[i].getSalario());
        }

        return totalSalarios / numFuncionarios;
    }

    public void exibirMediaSalarial() {
        double mediaSalario = calcularMediaSalarial();
        System.out.println("Média salarial: " + mediaSalario);
    }

    public boolean vazio() {
        return numFuncionarios == 0;
    }

    @Override
    public String toString() {
        if (vazio()) {
            throw new IllegalStateException("Lista de funcionários Vazia");
        }
        StringBuilder funcs = new StringBuilder("[");
        for (int c = 0; c < numFuncionarios; c++) {
            funcs.append(funcionarios[c].toString());
            if (c < numFuncionarios - 1) {
                funcs.append(";");
            }
        }
        funcs.append("]");
        return "Empresa [nome=" + nome + ", funcionarios=" + funcs.toString() + "]";
    }
}

