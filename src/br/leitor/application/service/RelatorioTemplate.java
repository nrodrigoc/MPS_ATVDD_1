package br.leitor.application.service;

import br.leitor.domain.Usuario;

import java.util.List;

public abstract class RelatorioTemplate {

    protected final List<Usuario> usuarios;

    protected RelatorioTemplate(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
    public abstract void imprimirRelatorio();
}
