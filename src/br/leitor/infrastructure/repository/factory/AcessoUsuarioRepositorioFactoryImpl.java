package br.leitor.infrastructure.repository.factory;

import br.leitor.infrastructure.repository.AcessoUsuarioRepositorio;
import br.leitor.infrastructure.repository.AcessoUsuarioRepositorioDatabase;

public class AcessoUsuarioRepositorioFactoryImpl implements AcessoUsuarioRepositorioFactory{

    @Override
    public AcessoUsuarioRepositorio criarRepositorio() {
        return new AcessoUsuarioRepositorioDatabase();
    }
}
