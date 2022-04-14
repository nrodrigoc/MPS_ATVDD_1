package br.leitor.entity;

public class Usuario {

    private long codigo;

    private String login;

    private String senha;

    private int tipo;

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "{" +
                "\n    codigo=" + codigo +
                ",\n    login='" + login + '\'' +
                ",\n    senha='" + senha + '\'' +
                ",\n    tipo=" + tipo + '\n' +
                '}';
    }
}
