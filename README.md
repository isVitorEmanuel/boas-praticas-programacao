# Trabalho – Boas Práticas de Programação (DIM0501)

Alunos:
- Vitor Emanuel Rodrigues de Alencar (Turma T01);
- Igor Marques de Lima (Turma T02);

| ~~Somos alunos de turmas diferentes~~

## 1. Explicação do Projeto
O projeto consiste em um sistema de gerenciamento de biblioteca, desenvolvido em Java, com o objetivo de aplicar boas práticas 
de programação aprendidas na disciplina.

O sistema permite o cadastro de livros e usuários, além do gerenciamento de empréstimos e devoluções, mantendo um controle 
do acervo e relatórios de utilização. Além disso, diferencia livros físicos e digitais, sendo que apenas os físicos possuem 
quantidade limitada de cópias.

## 2. Como compilar
### 2.1. Pré-requisitos
- `Java JDK` ou superior instalado;
- Terminal Linux ou Windows com `javac` disponível;

### 2.2. Comando de Compilação
Para compilar, execute o comando abaixo:
```text
javac -d bin $(find src -name "*.java")
```
Agora, basta rodar!

## 3. Como rodar
Execute o comando:
```text
java -cp bin Main
```
O sistema será iniciado no terminal, exibindo o menu principal com as opções de:

```text
1 - Cadastrar livro
2 - Cadastrar usuário
3 - Empréstimo de livro
4 - Devolução de livro
5 - Listar livros
6 - Relatório de empréstimos
7 - Sair
```