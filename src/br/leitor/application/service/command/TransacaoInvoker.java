package br.leitor.application.service.command;

import br.leitor.application.presentation.ConciliacaoTransacao;
import br.leitor.application.service.factory.CommandTransactionFactory;
import br.leitor.domain.Transacao;

public class TransacaoInvoker {

    public Transacao invoker(ConciliacaoTransacao conciliacaoTransacao){
        CommandTransaction commandTransaction = CommandTransactionFactory.factory(conciliacaoTransacao);
        return commandTransaction.processarTransacao(conciliacaoTransacao);
    }
}
