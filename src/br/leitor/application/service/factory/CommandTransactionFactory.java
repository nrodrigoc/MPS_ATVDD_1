package br.leitor.application.service.factory;

import br.leitor.application.presentation.ConciliacaoTransacao;
import br.leitor.application.service.command.CommandTransaction;
import br.leitor.application.service.command.PagamentoCommand;
import br.leitor.application.service.command.SaqueCommand;
import br.leitor.application.service.command.VendaCommand;

public class CommandTransactionFactory {

    public static CommandTransaction factory(ConciliacaoTransacao conciliacaoTransacao){
        switch (conciliacaoTransacao.getCodigoProcessamento()){
            case "0100":
                return new SaqueCommand();
            case "0200":
                return new VendaCommand();
            case "0300":
                return new PagamentoCommand();
        }
        throw new RuntimeException("Código de processamento inválido");
    }

}
