package model;

public class LivroDigital extends Livro {
    public LivroDigital(String titulo, String autor, String isbn) {
        super(titulo, autor, isbn);
    }

    @Override
    public boolean estaDisponivel() { return true; }

    @Override
    public String toString() {
        return this.getIsbn() + " | " + this.getAutor() + " - " + this.getTitulo() + " (livro digital)";
    }
}
