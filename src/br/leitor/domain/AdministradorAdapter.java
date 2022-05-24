package br.leitor.domain;

public class AdministradorAdapter extends Usuario{

    private final Administrador administrador;

    public AdministradorAdapter(Administrador administrador) {
        this.administrador = administrador;
    }

    @Override
    public String getLogin() {
        return administrador.getNome();
    }

    @Override
    public String getSenha() {
        return administrador.getTokenAcesso();
    }
}
