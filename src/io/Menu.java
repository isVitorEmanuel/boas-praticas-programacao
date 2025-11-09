package io;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    static Scanner scanner = new Scanner(System.in);
    public static final int OPCAO_SAIDA = 7;

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
}
