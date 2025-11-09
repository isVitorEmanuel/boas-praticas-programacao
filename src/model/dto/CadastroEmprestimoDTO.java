package model.dto;

public class CadastroEmprestimoDTO {
    int idUsuario;
    String isbnLivro;

    public CadastroEmprestimoDTO(int idUsuario, String isbnLivro) {
        this.idUsuario = idUsuario;
        this.isbnLivro = isbnLivro;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getIsbnLivro() {
        return isbnLivro;
    }

    public void setIsbnLivro(String isbnLivro) {
        this.isbnLivro = isbnLivro;
    }
}
