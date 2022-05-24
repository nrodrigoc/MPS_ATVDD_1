package br.leitor.application.service.factory;

import br.leitor.application.service.LoginServiceImpl;

public class LoginServiceFactoryImpl implements LoginServiceFactory{
    @Override
    public LoginServiceImpl criaLoginService() {
        return new LoginServiceImpl();
    }
}
