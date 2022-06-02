package br.leitor.application.service.command;

import br.leitor.application.presentation.ConciliacaoTransacao;
import br.leitor.application.service.memento.MementoTransaction;
import br.leitor.domain.Transacao;

import java.time.LocalDateTime;

public abstract class TemplateMethodTransacao<T extends Transacao> implements CommandTransaction{

    protected final MementoTransaction<T> memento;

    public TemplateMethodTransacao(MementoTransaction<T> memento) {
        this.memento = memento;
    }

    public Transacao processarTransacao(ConciliacaoTransacao transacao){
        try{
            T transacaoBanco = buscarTransacao(transacao.getNsu(),transacao.getDataTransacao(), transacao.getReferenciaPortador());
            memento.salvarEstado((T) transacaoBanco);
            faturarTransacao(transacaoBanco);
            atualizarTransacao(transacaoBanco);
            return transacaoBanco;
        }catch (Throwable e){
            T t = memento.buscarEstado();
            atualizarTransacao(t);
            throw new RuntimeException("Falha ao conciliar transacao: "+ e.getMessage());
        }
    }

    protected abstract void atualizarTransacao(Transacao transacaoBanco);
    protected abstract void faturarTransacao(Transacao transacaoBanco);
    protected abstract T buscarTransacao(String nsu, LocalDateTime dataTransacao, long idPortador);
}
