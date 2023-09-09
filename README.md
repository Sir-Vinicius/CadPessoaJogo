# CadPessoaJogo

## Descrição
Este projeto Java é uma aplicação web simples que permite cadastrar informações de pessoas e jogar um jogo para encontrar o maior e o menor número entre cinco números fornecidos.

**Atualização para o Desafio DIO:** Este projeto foi atualizado como parte do desafio de projeto "Explorando Padrões de Projetos na Prática com Java" da DIO (Digital Innovation One). As seguintes melhorias foram feitas:

- Adição de funcionalidades para cumprir os requisitos do desafio.
- Implementação de padrões de projeto relevantes para aprimorar a estrutura do código.
- Melhorias na documentação e descrição do projeto.

## Padrões de Projeto Utilizados
Este projeto implementa os seguintes padrões de projeto para cumprir o desafio da DIO (Digital Innovation One):

1. **Singleton Pattern**: Utilizado na classe `PessoaFacade` para garantir que apenas uma instância da classe seja criada e compartilhada em toda a aplicação.

2. **Strategy Pattern**: Utilizado na escolha da estratégia no `JogoServlet` para encontrar o maior e o menor número entre os números digitados.

## Funcionalidades

### 1. Cadastro de Pessoa
- Você pode cadastrar informações de pessoas, incluindo nome e idade.
- Os dados cadastrados são exibidos na página de confirmação.

### 2. Jogo de Maior e Menor Número
- O projeto inclui um jogo interativo.
- Você insere cinco números e o sistema identifica o maior e o menor número entre eles.
- O resultado é exibido na página.

## Tecnologias Utilizadas
- Java
- Servlets
- HTML
- CSS

## Estrutura do Projeto

O projeto é dividido em três partes principais:

### 1. Cadastro de Pessoa
- Nesta parte, o usuário pode preencher um formulário com seu nome e idade.
- As informações são então cadastradas e exibidas na página de confirmação.

### 2. Página Inicial
- Esta é a página inicial do projeto com links para acessar o cadastro de pessoas e o jogo.

### 3. Jogo de Maior e Menor Número
- Nesta parte, o usuário insere cinco números em um formulário e o sistema identifica o maior e o menor número entre eles.

## Como Executar

Para executar o projeto localmente, siga estas etapas:

1. Clone o repositório para o seu ambiente local.

   ```bash
   git clone https://github.com/Sir-Vinicius/CadPessoaJogo.git
   
2. Certifique-se de ter o Java e um servidor web configurado (como Apache Tomcat) instalado no seu sistema.

3. Implante o projeto no seu servidor web.

4. Acesse o projeto no seu navegador utilizando o endereço local do servidor.

## Estilização
O projeto utiliza folhas de estilo CSS simples para melhorar a apresentação das páginas. Você pode personalizar o estilo editando o arquivo style.css.

## Contribuição
Se você deseja contribuir para este projeto, fique à vontade para criar um fork, fazer suas alterações e enviar um pull request. Todas as contribuições são bem-vindas!

## Autor
Este projeto foi desenvolvido por [@Sir-Vinicius](https://github.com/Sir-Vinicius).
