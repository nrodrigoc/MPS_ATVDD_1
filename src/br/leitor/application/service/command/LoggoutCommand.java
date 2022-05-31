package br.leitor.application.service.command;

import br.leitor.domain.Login;
import br.leitor.domain.Usuario;

public class LoggoutCommand extends Command{

    public LoggoutCommand(Usuario usuario) {
        super(usuario);
    }

    @Override
    public void execute() {
        login.setUsuarioLogado(null);
    }
}
