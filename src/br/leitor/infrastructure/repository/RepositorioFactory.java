package br.leitor.infrastructure.repository;

public class RepositorioFactory {

    public static UsuarioRepositorio criarRepositorioUsuario(){
        return new UsuarioRepositorioDatabase();
    }

}
