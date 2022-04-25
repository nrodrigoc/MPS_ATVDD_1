package br.leitor.infrastructure.repository;

import br.leitor.domain.Usuario;
import java.util.List;

public interface UsuarioRepositorio {

    Usuario salvar(Usuario usuario);
    Usuario retornaPorCodigo(final long codigo);
    List<Usuario> retornarTodos();
    void removePorLogin(final String login);

}
