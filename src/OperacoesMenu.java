import io.Menu;
import model.Emprestimo;
import model.Livro;
import model.Usuario;
import model.dto.CadastroEmprestimoDTO;

import java.lang.module.FindException;
import java.time.LocalDate;

public class OperacoesMenu {
    static Banco banco = Banco.getInstance();

    public static void executarOperacao(int opcao) {
        switch (opcao) {
            case 1:
                cadastrarLivro();
                break;
            case 2:
                cadastrarUsuario();
                break;
            case 3:
                registrarEmprestimo();
                break;
            case 4:
                devolverLivro();
                break;
            case 5:
                listarLivros();
                break;
            case 6:
                exibirRelatorioEmprestimos();
                break;
            case 7:
                sair();
                break;
            default:
                break;

        }
    }

    private static void cadastrarLivro() {
        Livro livro = Menu.lerDadosLivro();
        banco.getLivros().add(livro);
    }

    private static void cadastrarUsuario() {
        Usuario usuario = Menu.lerDadosUsuario();
        usuario.setId(banco.obterProximoIdUsuario());
        banco.getUsuarios().add(usuario);
    }

    private static void registrarEmprestimo() {
        boolean exibirAcervo = Menu.verificarExibicaoAcervo();

        if (exibirAcervo) {
            listarLivros();
        }

        CadastroEmprestimoDTO dadosEmprestimo = Menu.lerDadosEmprestimo();

        try {
            Usuario usuario = Validador.buscarUsuarioExistente(dadosEmprestimo.getIdUsuario());
            Livro livro = Validador.buscarLivroExistente(dadosEmprestimo.getIsbnLivro());

            Emprestimo emprestimo = new Emprestimo(usuario, livro, LocalDate.now(), null);
            banco.getEmprestimos().add(emprestimo);

        } catch (FindException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void devolverLivro() {
        CadastroEmprestimoDTO dadosEmprestimo = Menu.lerDadosEmprestimo();

        try {
            Emprestimo emprestimo = Validador.buscarEmprestimoPendente(dadosEmprestimo);
            emprestimo.setDataDevolucao(LocalDate.now());
        } catch (FindException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void listarLivros() {
        Menu.listarLivros(banco.getLivros());
    }

    private static void exibirRelatorioEmprestimos() {

    }

    private static void sair() {
        System.out.println("Obrigado por usar o sistema!");
    }

}
