package model;

public class LivroFisico extends Livro {
    private int quantidadeCopias;
    private int copiasDisponiveis;

    public LivroFisico(String titulo, String autor, String isbn, int quantidadeCopias, int copiasDisponiveis) {
        super(titulo, autor, isbn);
        this.quantidadeCopias = quantidadeCopias;
        this.copiasDisponiveis = copiasDisponiveis;
    }

    @Override
    public boolean estaDisponivel() {
        return copiasDisponiveis > 0;
    }

    public int getQuantidadeCopias() {
        return quantidadeCopias;
    }

    public void setQuantidadeCopias(int quantidadeCopias) {
        this.quantidadeCopias = quantidadeCopias;
    }

    public int getCopiasDisponiveis() {
        return copiasDisponiveis;
    }

    public void setCopiasDisponiveis(int copiasDisponiveis) {
        this.copiasDisponiveis = copiasDisponiveis;
    }

    @Override
    public String toString() {
        return this.getTitulo() + ": " + this.copiasDisponiveis + " + disponíveis";
    }
}
