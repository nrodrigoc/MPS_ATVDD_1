package br.leitor.infrastructure.repository;

import br.leitor.domain.Pagamento;

import java.util.List;

public interface PagamentoRepository {
    Pagamento salvar(Pagamento pagamento);
    Pagamento retornaPorCodigo(final long codigo);
    List<Pagamento> retornarTodos();
    Pagamento alterar(Pagamento pagamento);
    void removePorCodigo(final long codigo);
}
