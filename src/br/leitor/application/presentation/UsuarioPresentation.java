package br.leitor.application.presentation;

import br.leitor.domain.AcessoUsuario;
import br.leitor.domain.Usuario;

import java.util.List;

public class UsuarioPresentation {

    private Usuario usuario;
    private List<AcessoUsuario> acessoUsuario;

    public UsuarioPresentation(Usuario usuario, List<AcessoUsuario> acessoUsuario) {
        this.usuario = usuario;
        this.acessoUsuario = acessoUsuario;
    }

    public UsuarioPresentation() {
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<AcessoUsuario> getAcessoUsuario() {
        return acessoUsuario;
    }

    public void setAcessoUsuario(List<AcessoUsuario> acessoUsuario) {
        this.acessoUsuario = acessoUsuario;
    }
}
