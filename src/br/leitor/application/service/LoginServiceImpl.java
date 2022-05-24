package br.leitor.application.service;

import br.leitor.domain.Usuario;

public class LoginServiceImpl implements LoginService {

    @Override
    public boolean login(Usuario usuario) {
        return usuario.getLogin() != null && usuario.getSenha() != null;
    }
}
