package br.leitor.application.service.memento;

import br.leitor.domain.Transacao;

public interface MementoTransaction <T extends Transacao>{
    void salvarEstado(T transacao);
    T buscarEstado();
    void limparEstado();
}
