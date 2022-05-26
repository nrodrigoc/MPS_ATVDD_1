package br.leitor.application.service;

import br.leitor.domain.Usuario;

import java.util.List;

public class RelatorioPDFService extends RelatorioTemplate{


    public RelatorioPDFService(List<Usuario> usuarios) {
        super(usuarios);
    }

    @Override
    public void imprimirRelatorio() {
        // Imprime o relatório em PDF
    }
}
