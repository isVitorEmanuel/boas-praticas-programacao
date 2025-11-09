package model;

import java.util.List;

public class Usuario {
    private int id;
    private String nome;
    private List<Emprestimo> historicoEmprestimos;

    public Usuario(int id,  String nome, List<Emprestimo> historicoEmprestimos) {
        this.id = id;
        this.nome = nome;
        this.historicoEmprestimos = historicoEmprestimos;
    }

    public String getNome() { return nome; }
    public int getId() { return id; }
    public List<Emprestimo> getHistoricoEmprestimos() { return historicoEmprestimos; }

    public void setNome(String nome) { this.nome = nome; }
    public void setId(int id) { this.id = id; }
    public void setHistoricoEmprestimos(List<Emprestimo> historicoEmprestimos) {
        this.historicoEmprestimos = historicoEmprestimos;
    }
}
