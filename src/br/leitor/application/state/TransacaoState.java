package br.leitor.application.state;

import br.leitor.domain.Transacao;

public abstract class TransacaoState {

    protected Transacao transacao;

    protected TransacaoState(Transacao transacao) {
        this.transacao = transacao;
    }

    public void vaiParaPagamento() {
        System.out.println( "FALHOU: Usuário já está no estado de pagamento." );
    }

    public void vaiParaSaque() {
        System.out.println( "FALHOU: Usuário já está no estado de saque." );
    }

    public void pagar() {
        System.out.println( "FALHOU: Usuário não está no estado de pagamento." );
    }

    public void sacar() {
        System.out.println( "FALHOU: Usuário não está no estado de saque." );
    }

    public void menu() {
        System.out.println( "FALHOU: Usuaŕio já está no menu.");
    }
}
