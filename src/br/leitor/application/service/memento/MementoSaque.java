package br.leitor.application.service.memento;

import br.leitor.domain.Saque;

public class MementoSaque implements MementoTransaction<Saque>{

    private Saque saque = null;

    @Override
    public void salvarEstado(Saque transacao) {
        if(transacao != null)
            saque = transacao;
    }

    @Override
    public Saque buscarEstado() {
        return saque;
    }

    @Override
    public void limparEstado() {
        saque = null;
    }
}
