package br.leitor.application.service.factory;


import br.leitor.application.service.AcessoUsuarioService;
import br.leitor.application.service.AcessoUsuarioServiceImpl;
import br.leitor.infrastructure.repository.factory.AcessoUsuarioRepositorioFactoryImpl;

public class AcessoUsuarioServiceFactoryImpl implements AcessoUsuarioServiceFactory{

    @Override
    public AcessoUsuarioService criarAcessoUsuarioService() {
        return new AcessoUsuarioServiceImpl(new AcessoUsuarioRepositorioFactoryImpl().criarRepositorio());
    }
}
