package model;

public class LivroFisico extends Livro {
    private int quantidadeCopias;
    private int copiasDisponiveis;

    public LivroFisico(String titulo, String autor, String isbn, int quantidadeCopias) {
        super(titulo, autor, isbn);
        this.quantidadeCopias = quantidadeCopias;
        this.copiasDisponiveis = quantidadeCopias;
    }

    @Override
    public boolean estaDisponivel() {
        return copiasDisponiveis >= 0;
    }

    @Override
    public String toString() {
        return this.getTitulo() + ": " + this.copiasDisponiveis + " + disponíveis";
    }
}
