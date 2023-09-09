package facade;

import entidades.Pessoa;

public class PessoaFacade {
    // Vari�vel est�tica para armazenar a inst�ncia �nica
    private static PessoaFacade instance;

    // Construtor privado para evitar a cria��o de inst�ncias diretas
    private PessoaFacade() {
    	super();
    }

    // M�todo est�tico para obter a inst�ncia �nica
    public static PessoaFacade getInstance() {
        if (instance == null) {
            instance = new PessoaFacade();
        }
        return instance;
    }

    // Implemente m�todos para criar, ler, atualizar e excluir pessoas

    public Pessoa criarPessoa(String nome, int idade) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome(nome);
        pessoa.setIdade(idade);
        // L�gica para salvar no banco de dados, se aplic�vel
        return pessoa;
    }

    public Pessoa buscarPessoa(int id) {
        // L�gica para buscar uma pessoa no banco de dados, se aplic�vel
        return null;
    }

    // Outros m�todos para atualizar e excluir pessoas
}
