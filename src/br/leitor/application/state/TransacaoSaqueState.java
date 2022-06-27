package br.leitor.application.state;

import br.leitor.domain.Transacao;

public class TransacaoSaqueState extends TransacaoState{
    public TransacaoSaqueState(Transacao transacao) {
        super(transacao);
    }

    @Override
    public void sacar() {
        System.out.println("Saque realizado com sucesso!");
        transacao.setEstado(transacao.getEstadoMenuTransacao());
    }

    @Override
    public void menu() {
        System.out.println("Voltando da tela de saque para o menu.");
        transacao.setEstado(transacao.getEstadoMenuTransacao());
    }

    @Override
    public void vaiParaPagamento() {
        System.out.println("Indo para o pagamento!");
        transacao.setEstado(transacao.getEstadoPagamento());
    }

}
