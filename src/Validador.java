import model.Emprestimo;
import model.Livro;
import model.Usuario;
import model.dto.CadastroEmprestimoDTO;

import java.lang.module.FindException;

public class Validador {
    static Banco banco = Banco.getInstance();

    public static Usuario buscarUsuarioExistente(int idUsuario) {
        return banco.buscarUsuarioPorId(idUsuario).orElseThrow( () ->
                new FindException("Erro: Não foi encontrado um usuário com esse ID no sistema.")
        );
    }

    public static Livro buscarLivroExistente(String isbnLivro) {
        return banco.buscarLivroPorISBN(isbnLivro).orElseThrow( () ->
                new FindException("Erro: Não foi encontrado um livro com esse ISBN no sistema.")
        );
    }

    public static Emprestimo buscarEmprestimoPendente(CadastroEmprestimoDTO dadosEmprestimo) {
        return banco.getEmprestimos().stream().filter(
                emprestimo -> emprestimo.getUsuario().getId() == dadosEmprestimo.getIdUsuario()
                && emprestimo.getLivro().getIsbn().equals(dadosEmprestimo.getIsbnLivro())
                && emprestimo.getDataDevolucao() == null
        ).findFirst().orElseThrow(
                () -> new FindException("Erro: Não foi encontrado nenhum empréstimo pendente com os dados fornecidos.")
        );
    }

    public static boolean validarDisponibilidade(Livro livro) {
        if (livro.estaDisponivel()) {
            return true;
        } else {
            System.out.println("Não há cópias disponíveis para este livro. Tente novamente em outro momento.");
            return false;
        }
    }
}
