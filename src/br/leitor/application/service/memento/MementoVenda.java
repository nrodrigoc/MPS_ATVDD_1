package br.leitor.application.service.memento;

import br.leitor.domain.Venda;

public class MementoVenda implements MementoTransaction<Venda>{

    private Venda transacao = null;

    @Override
    public void salvarEstado(Venda transacao) {
        if(transacao!=null)
            this.transacao = transacao;
        System.out.println("Estado de venda Salvo");
    }

    @Override
    public Venda buscarEstado() {
        return this.transacao;
    }

    @Override
    public void limparEstado() {
        transacao = null;
    }
}
