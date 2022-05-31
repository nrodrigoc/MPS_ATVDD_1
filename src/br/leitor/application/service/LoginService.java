package br.leitor.application.service;

import br.leitor.domain.Usuario;

public interface LoginService {

    boolean login(Usuario usuario);

    boolean loggout();
}
