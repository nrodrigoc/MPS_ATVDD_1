package br.leitor.application.service.command;

import br.leitor.application.service.memento.MementoVenda;
import br.leitor.domain.Transacao;
import br.leitor.domain.Venda;

import java.time.LocalDateTime;

public class VendaCommand extends TemplateMethodTransacao<Venda>{

    public VendaCommand() {
        super(new MementoVenda());
    }

    @Override
    protected void atualizarTransacao(Transacao transacaoBanco) {
        System.out.println("Atualizando venda...");
    }

    @Override
    protected void faturarTransacao(Transacao transacaoBanco) {
        System.out.println("Faturando venda...");
    }

    @Override
    protected Venda buscarTransacao(String nsu, LocalDateTime dataTransacao, long idPortador) {
        System.out.println("Buscando transação...");
        return null;
    }
}
