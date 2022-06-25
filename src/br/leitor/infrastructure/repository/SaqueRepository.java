package br.leitor.infrastructure.repository;

import br.leitor.domain.Pagamento;
import br.leitor.domain.Saque;
import br.leitor.domain.Usuario;

import java.util.List;

public interface SaqueRepository {

    Saque salvar(Saque saque);
    Saque retornaPorCodigo(final long codigo);
    List<Saque> retornarTodos();
    Saque alterar(Saque saque);
    void removePorCodigo(final long codigo);
}
