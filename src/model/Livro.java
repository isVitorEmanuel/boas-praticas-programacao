package model;

import java.util.ArrayList;
import java.util.List;

public abstract class Livro {
    protected String isbn;
    protected String titulo;
    protected String autor;
    protected List<Emprestimo> emprestimos;

    public Livro(String titulo, String autor, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.emprestimos = new ArrayList<>();
    }

    public abstract boolean estaDisponivel();

    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public String getIsbn() { return isbn; }
    public List<Emprestimo> getEmprestimos() { return emprestimos; }

    public void setTitulo(String titulo) {this.titulo = titulo; }
    public void setAutor(String autor) {this.autor = autor; }
    public void setIsbn(String isbn) {this.isbn = isbn; }
}
