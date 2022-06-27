package br.leitor.application.state;

import br.leitor.domain.Transacao;

public class TransacaoPagamentoState extends TransacaoState {


    public TransacaoPagamentoState(Transacao transacao) {
        super(transacao);
    }

    @Override
    public void pagar() {
        System.out.println("Pagamento realizado com sucesso!");
        transacao.setEstado(transacao.getEstadoMenuTransacao());
    }

    @Override
    public void menu() {
        System.out.println("Voltando da tela de pagamento para o menu.");
        transacao.setEstado(transacao.getEstadoMenuTransacao());
    }

    @Override
    public void vaiParaSaque() {
        System.out.println("Indo para o saque!");
        transacao.setEstado(transacao.getEstadoSaque());
    }
}
