package model;

public abstract class Livro {
    protected String titulo;
    protected String autor;
    protected String isbn;

    public Livro(String titulo, String autor, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
    }

    public abstract boolean estaDisponivel();

    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public String getIsbn() { return isbn; }

    public void setTitulo(String titulo) {this.titulo = titulo; }
    public void setAutor(String autor) {this.autor = autor; }
    public void setIsbn(String isbn) {this.isbn = isbn; }
}
