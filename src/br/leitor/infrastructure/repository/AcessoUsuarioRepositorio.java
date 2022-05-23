package br.leitor.infrastructure.repository;

import br.leitor.domain.AcessoUsuario;

import java.util.List;

public interface AcessoUsuarioRepositorio {

    AcessoUsuario salvar(AcessoUsuario acesso);
    AcessoUsuario retornaPorCodigo(final long codigo);
    List<AcessoUsuario> retornarTodos();
    List<AcessoUsuario> retornarAcessoPorUsuario(final long codigoUsuario);
    void removePorCodigo(final long codigo);
}
