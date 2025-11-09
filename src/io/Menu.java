package io;

import model.*;
import model.dto.CadastroEmprestimoDTO;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Menu {
    static Scanner scanner = new Scanner(System.in);
    public static final int OPCAO_SAIDA = 7;
    private static final String SIM = "s";
    private static final String NAO = "n";
    private static final String MENSAGEM_OPCAO_INVALIDA = "Opção inválida! Digite 's' para SIM ou 'n' para NÃO.";

    public static void exibirMenu(){
        System.out.println("-----MENU-----");
        System.out.println(" * Digite o número correspondente a operação:");
        System.out.println("1 - Cadastrar livro");
        System.out.println("2 - Cadastrar usuário");
        System.out.println("3 - Empréstimo de livro");
        System.out.println("4 - Devolução de livro");
        System.out.println("5 - Listar livros");
        System.out.println("6 - Relatório de empréstimos");
        System.out.println("7 - Sair");
    }

    public static int lerOpcaoMenu(){
        try{
            int opcao = scanner.nextInt();
            scanner.nextLine();
            return opcao;
        } catch(InputMismatchException e){
            System.out.println("Opção inválida!");
        }

        return 0;
    }

    public static Livro lerDadosLivro() {
        System.out.println("Digite o título do livro:");
        String titulo = scanner.nextLine();
        System.out.println("Digite o autor do livro:");
        String autor = scanner.nextLine();
        System.out.println("Digite o ISBN do livro:");
        String isbn = scanner.nextLine();

        System.out.println("O livro é físico? (s/n)");

        boolean livroFisico = lerSimNao();

        if(livroFisico){
            return lerDadosLivroFisico(titulo, autor, isbn);
        } else {
            return new LivroDigital(titulo, autor, isbn);
        }
    }

    private static LivroFisico lerDadosLivroFisico(String titulo, String autor, String isbn) {
        int quantidadeCopias = lerQuantidadeCopias();
        return new LivroFisico(titulo, autor, isbn, quantidadeCopias, quantidadeCopias);
    }

    public static boolean lerSimNao() {
        while (true) {
            String resposta = scanner.nextLine().trim().toLowerCase();

            if (resposta.equals(SIM)) {
                return true;
            } else if (resposta.equals(NAO)) {
                return false;
            } else {
                System.out.println(MENSAGEM_OPCAO_INVALIDA);
            }
        }
    }

    private static int lerQuantidadeCopias() {
        while (true) {
            try {
                System.out.println("Digite o número de cópias do livro:");
                int quantidade = scanner.nextInt();
                scanner.nextLine();

                if (quantidade >= 0) {
                    return quantidade;
                } else {
                    System.out.println("A quantidade deve ser um número não negativo.");
                }
            } catch (InputMismatchException e) {
                scanner.nextLine();
                System.out.println("Por favor, digite um número válido.");
            }
        }
    }

    public static Usuario lerDadosUsuario() {
        System.out.println("Digite o nome do usuário:");
        String nome = scanner.nextLine();

        return new Usuario(0, nome, new ArrayList<>());
    }

    public static CadastroEmprestimoDTO lerDadosEmprestimo() {
        System.out.println("Digite o id do usuário:");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Digite o ISBN do livro:");
        String isbn = scanner.nextLine();

        return new CadastroEmprestimoDTO(id, isbn);
    }


    public static boolean verificarExibicaoAcervo() {
        System.out.println("Deseja verificar a disponibilidade dos livros? (s/n)");
        return lerSimNao();
    }

    public static void listarLivros(List<Livro> livros) {
        for (Livro livro : livros) {
            System.out.println(livro.toString());
        }
        esperarEnter();
    }

    public static void esperarEnter() {
        System.out.println("Pressione Enter para continuar...");
        scanner.nextLine();
    }
}
