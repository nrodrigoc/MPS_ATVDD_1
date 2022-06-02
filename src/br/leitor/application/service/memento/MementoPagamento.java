package br.leitor.application.service.memento;

import br.leitor.domain.Pagamento;

public class MementoPagamento implements MementoTransaction<Pagamento>{
    private Pagamento pagamento = null;

    @Override
    public void salvarEstado(Pagamento transacao) {
        if(transacao != null)
            pagamento = transacao;
    }

    @Override
    public Pagamento buscarEstado() {
        return pagamento;
    }

    @Override
    public void limparEstado() {
        pagamento = null;
    }
}
