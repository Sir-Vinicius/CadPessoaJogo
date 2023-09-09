package facade;

import entidades.Pessoa;

public class PessoaFacade {
    // Variável estática para armazenar a instância única
    private static PessoaFacade instance;

    // Construtor privado para evitar a criação de instâncias diretas
    private PessoaFacade() {
    	super();
    }

    // Método estático para obter a instância única
    public static PessoaFacade getInstance() {
        if (instance == null) {
            instance = new PessoaFacade();
        }
        return instance;
    }

    // Implemente métodos para criar, ler, atualizar e excluir pessoas

    public Pessoa criarPessoa(String nome, int idade) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome(nome);
        pessoa.setIdade(idade);
        // Lógica para salvar no banco de dados, se aplicável
        return pessoa;
    }

    public Pessoa buscarPessoa(int id) {
        // Lógica para buscar uma pessoa no banco de dados, se aplicável
        return null;
    }

    // Outros métodos para atualizar e excluir pessoas
}
