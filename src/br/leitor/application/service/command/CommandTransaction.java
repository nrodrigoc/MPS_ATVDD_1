package br.leitor.application.service.command;

import br.leitor.application.presentation.ConciliacaoTransacao;
import br.leitor.domain.Transacao;

public interface CommandTransaction {
    <T extends Transacao> T processarTransacao(ConciliacaoTransacao transacao);
}
