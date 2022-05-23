package br.leitor.infrastructure.repository.factory;

import br.leitor.infrastructure.repository.UsuarioRepositorio;
import br.leitor.infrastructure.repository.UsuarioRepositorioDatabase;

public class UsuarioRepositoryFactoryImpl implements UsuarioRepositorioFactory{
    @Override
    public UsuarioRepositorio criarUsuarioRepositorio() {
        return new UsuarioRepositorioDatabase();
    }
}
