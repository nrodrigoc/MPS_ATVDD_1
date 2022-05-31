package br.leitor.application.service.command;

import br.leitor.domain.Usuario;

public class LoginCommand extends Command{

    public LoginCommand(Usuario usuario) {
        super(usuario);
    }

    @Override
    public void execute() {
        login.setUsuarioLogado(usuario);
    }


}
