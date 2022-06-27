package br.leitor.application.state;

import br.leitor.domain.Transacao;

public class TransacaoMenuState extends TransacaoState {


    public TransacaoMenuState(Transacao transacao) {
        super(transacao);
    }

    @Override
    public void vaiParaPagamento() {
        System.out.println("Indo para o pagamento!");
        transacao.setEstado(transacao.getEstadoPagamento());
    }

    @Override
    public void vaiParaSaque() {
        System.out.println("Indo para o saque!");
        transacao.setEstado(transacao.getEstadoSaque());
    }
}
