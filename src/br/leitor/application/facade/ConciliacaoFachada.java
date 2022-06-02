package br.leitor.application.facade;

import br.leitor.application.presentation.ConciliacaoTransacao;
import br.leitor.application.service.command.TransacaoInvoker;
import br.leitor.domain.Transacao;

import java.util.List;

public class ConciliacaoFachada {

    // Singleton
    private static UsuarioFacadeService instance;

    public void conciliarTransacoes(List<ConciliacaoTransacao> conciliacoes){
        final TransacaoInvoker transacaoInvoker = new TransacaoInvoker();
        conciliacoes.forEach(conciliacaoTransacao -> {
            Transacao transacao = transacaoInvoker.invoker(conciliacaoTransacao);
            System.out.println("Transacao : " +transacao.toString() + " conciliada com sucesso.");
        });
    }

}
