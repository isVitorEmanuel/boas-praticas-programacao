import io.Menu;
import model.Livro;
import model.Usuario;

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
    }

    private static void devolverLivro() {
    }

    private static void listarLivros() {
    }

    private static void exibirRelatorioEmprestimos() {
    }

}
