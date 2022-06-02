package br.leitor.infrastructure.repository;

import br.leitor.domain.Venda;
import java.util.List;

public interface VendaRepository {
    Venda salvar(Venda venda);
    Venda retornaPorCodigo(final long codigo);
    List<Venda> retornarTodos();
    Venda alterar(Venda venda);
    void removePorCodigo(final long codigo);
}
