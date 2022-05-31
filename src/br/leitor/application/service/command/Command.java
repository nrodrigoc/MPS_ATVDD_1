package br.leitor.application.service.command;

import br.leitor.domain.Login;
import br.leitor.domain.Usuario;

public abstract class Command {

    protected Usuario usuario;
    protected Login login;

    Command(Usuario usuario) {
        this.usuario = usuario;
    }

    void backup() {
        login.setUsuarioLogado(usuario);
    }

    public abstract void execute();
}
