package br.leitor.domain;

public class Usuario {

    public static final int PAYTAL = 0;
    public static final int EMISSOR = 1;

    private long codigo;

    private String login;

    private String senha;

    private int tipo;

    public Usuario() {
    }

    public Usuario(long codigo, String login, String senha, int tipo) {
        this.codigo = codigo;
        this.login = login;
        this.senha = senha;
        this.tipo = tipo;
    }

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
