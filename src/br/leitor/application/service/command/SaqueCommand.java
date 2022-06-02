package br.leitor.application.service.command;

import br.leitor.application.service.memento.MementoSaque;
import br.leitor.domain.Saque;
import br.leitor.domain.Transacao;

import java.time.LocalDateTime;

public class SaqueCommand extends TemplateMethodTransacao<Saque>{
    public SaqueCommand() {
        super(new MementoSaque());
    }

    @Override
    protected void atualizarTransacao(Transacao transacaoBanco) {
        System.out.println("Atualizando saque...");
    }

    @Override
    protected void faturarTransacao(Transacao transacaoBanco) {
        System.out.println("Faturando saque...");
    }

    @Override
    protected Saque buscarTransacao(String nsu, LocalDateTime dataTransacao, long idPortador) {
        System.out.println("Buscando saque...");
        return new Saque();
    }
}
