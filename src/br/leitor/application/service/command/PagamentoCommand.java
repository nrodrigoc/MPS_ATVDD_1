package br.leitor.application.service.command;

import br.leitor.application.service.memento.MementoPagamento;
import br.leitor.domain.Pagamento;
import br.leitor.domain.Transacao;

import java.time.LocalDateTime;

public class PagamentoCommand extends TemplateMethodTransacao<Pagamento> {

    public PagamentoCommand() {
        super(new MementoPagamento());
    }

    @Override
    protected void atualizarTransacao(Transacao transacaoBanco) {
        System.out.println("Atualizando pagamento...");
    }

    @Override
    protected void faturarTransacao(Transacao transacaoBanco) {
        System.out.println("Faturando pagamento...");
    }

    @Override
    protected Pagamento buscarTransacao(String nsu, LocalDateTime dataTransacao, long idPortador) {
        System.out.println("Buscando pagamento...");
        return new Pagamento();
    }
}
