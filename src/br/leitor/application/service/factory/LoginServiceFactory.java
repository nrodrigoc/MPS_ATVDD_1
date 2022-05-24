package br.leitor.application.service.factory;

import br.leitor.application.service.LoginServiceImpl;

public interface LoginServiceFactory {

    LoginServiceImpl criaLoginService();
}
