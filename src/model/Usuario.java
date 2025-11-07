package model;

import java.util.List;

public class Usuario {
    private String nome;
    private String id;
    private List<Emprestimo> historicoEmprestimo;

    public Usuario(String nome, String id,  List<Emprestimo> historicoEmprestimo) {
        this.nome = nome;
        this.id = id;
        this.historicoEmprestimo = historicoEmprestimo;
    }

    public String getNome() { return nome; }
    public String getId() { return id; }
    public List<Emprestimo> getHistoricoEmprestimo() { return historicoEmprestimo; }

    public void setNome(String nome) { this.nome = nome; }
    public void setId(String id) { this.id = id; }
    public void setHistoricoEmprestimo(List<Emprestimo> historicoEmprestimo) {
        this.historicoEmprestimo = historicoEmprestimo;
    }
}
