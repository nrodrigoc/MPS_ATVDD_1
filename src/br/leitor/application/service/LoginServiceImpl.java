package br.leitor.application.service;

import br.leitor.application.service.command.Command;
import br.leitor.application.service.command.LoggoutCommand;
import br.leitor.application.service.command.LoginCommand;
import br.leitor.domain.Login;
import br.leitor.domain.Usuario;

public class LoginServiceImpl implements LoginService {

    private final Login login;

    public LoginServiceImpl() {
        this.login = new Login();
    }

    @Override
    public boolean login(Usuario usuario) {
        if (usuario.getLogin() != null && usuario.getSenha() != null) {
            executaComando(new LoginCommand(usuario));
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean loggout() {
        try {
            executaComando(new LoggoutCommand(null));
            return true;
        }catch (Exception e) {
            return false;
        }
    }

    public void executaComando(Command command) {
        command.execute();
    }
}
