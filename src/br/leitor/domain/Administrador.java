package br.leitor.domain;

public class Administrador {

    private long codigo;

    private String nome;

    private String tokenAcesso;

    public Administrador() {
    }

    public Administrador(long codigo, String nome, String tokenAcesso) {
        this.codigo = codigo;
        this.nome = nome;
        this.tokenAcesso = tokenAcesso;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTokenAcesso() {
        return tokenAcesso;
    }

    public void setTokenAcesso(String tokenAcesso) {
        this.tokenAcesso = tokenAcesso;
    }
}
