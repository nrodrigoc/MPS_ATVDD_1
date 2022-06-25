package br.leitor.application.service;

import br.leitor.domain.Usuario;

import java.util.List;

public interface UsuarioService {

    Usuario cadastrarUsuario(String login, String senha, int tipoUsuario) throws Exception;
    Usuario retonarPorCodigo(long codigo);
    void imprimirTodos();
    void removePorLogin(String login);

    List<Usuario> getAll();
}
