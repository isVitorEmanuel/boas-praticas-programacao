import model.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Banco {
    private final ArrayList<Usuario> usuarios;
    private final ArrayList<Livro> livros;
    private final ArrayList<Emprestimo> emprestimos;

    public static Banco instance;

    private Banco(){
        usuarios = new ArrayList<>();
        livros = new ArrayList<>();
        emprestimos = new ArrayList<>();
    }

    public static Banco getInstance(){
        if(instance == null){
            instance = new Banco();
        }
        return instance;
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public ArrayList<Livro> getLivros() {
        return livros;
    }

    public ArrayList<Emprestimo> getEmprestimos() {
        return emprestimos;
    }

    public void popularBancos() {

        List<Usuario> usuarios = Arrays.asList(
                new Usuario(1, "Andre", new ArrayList<>()),
                new Usuario(2, "Bruno", new ArrayList<>()),
                new Usuario(3, "Carlos", new ArrayList<>())
        );

        List<Livro> livros = Arrays.asList(
                new LivroFisico("Teoria das redes sociais", "Elon Zuckerberg", "1234", 5, 3),
                new LivroFisico("Cloud Computing Avançado", "Steve Bezos", "4002", 3, 3),
                new LivroFisico("Sistemas Operacionais e IA", "Gates Altman", "8922", 2, 2),

                new LivroDigital("Design Patterns", "Erich Gamma", "333"),
                new LivroDigital("Clean Code", "Uncle Bob", "666"),
                new LivroDigital("SOLID sólido", "Gibeon Soares", "999")
        );

        List<Emprestimo> emprestimos = Arrays.asList(
                new Emprestimo(usuarios.get(1), livros.get(1), LocalDate.now(), null),
                new Emprestimo(usuarios.get(2), livros.get(4), LocalDate.now().minusMonths(1), LocalDate.now().minusWeeks(2)),
                new Emprestimo(usuarios.get(3), livros.get(1), LocalDate.now().minusWeeks(1), null),
                new Emprestimo(usuarios.get(1), livros.get(5), LocalDate.now(), null)
        );

        this.usuarios.addAll(usuarios);
        this.livros.addAll(livros);
        this.emprestimos.addAll(emprestimos);

    }
}
