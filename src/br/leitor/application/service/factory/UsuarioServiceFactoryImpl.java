package br.leitor.application.service.factory;

import br.leitor.application.service.UsuarioServiceImpl;
import br.leitor.infrastructure.repository.factory.UsuarioRepositoryFactoryImpl;

public class UsuarioServiceFactoryImpl implements UsuarioServiceFactory{

    @Override
    public UsuarioServiceImpl criarUsuarioService() {
        return new UsuarioServiceImpl(new UsuarioRepositoryFactoryImpl().criarUsuarioRepositorio());
    }
}
