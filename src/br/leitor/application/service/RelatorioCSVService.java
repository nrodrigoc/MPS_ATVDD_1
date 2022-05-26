package br.leitor.application.service;

import br.leitor.domain.Usuario;

import java.util.List;

public class RelatorioCSVService extends RelatorioTemplate{
    public RelatorioCSVService(List<Usuario> usuarios) {
        super(usuarios);
    }

    @Override
    public void imprimirRelatorio() {
        // Imprime o Relatório em CSV
    }
}
