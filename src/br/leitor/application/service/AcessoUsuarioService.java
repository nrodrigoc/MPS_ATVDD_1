package br.leitor.application.service;

import br.leitor.domain.AcessoUsuario;
import java.util.List;

public interface AcessoUsuarioService {

    AcessoUsuario cadastrarAcessoUsuario(int codigoUsuario);
    List<AcessoUsuario> buscarAcessoPorUsuario(int codigoUsuario);
    List<AcessoUsuario> buscarTodosAcessos();
    void deletarAcessoUsuario(int codigoAcessoUsuario);
}
