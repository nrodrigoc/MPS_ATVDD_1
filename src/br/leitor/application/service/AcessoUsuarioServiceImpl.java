package br.leitor.application.service;

import br.leitor.domain.AcessoUsuario;
import br.leitor.infrastructure.repository.AcessoUsuarioRepositorio;

import java.time.LocalDateTime;
import java.util.List;

public class AcessoUsuarioServiceImpl implements AcessoUsuarioService{

    private final AcessoUsuarioRepositorio acessoUsuarioRepositorio;

    public AcessoUsuarioServiceImpl(AcessoUsuarioRepositorio acessoUsuarioRepositorio) {
        this.acessoUsuarioRepositorio = acessoUsuarioRepositorio;
    }

    public AcessoUsuario cadastrarAcessoUsuario(int codigoUsuario){
        return acessoUsuarioRepositorio.salvar(new AcessoUsuario(LocalDateTime.now(), codigoUsuario));
    }

    public List<AcessoUsuario> buscarAcessoPorUsuario(int codigoUsuario){
        return acessoUsuarioRepositorio.retornarAcessoPorUsuario(codigoUsuario);
    }

    public List<AcessoUsuario> buscarTodosAcessos(){
        return acessoUsuarioRepositorio.retornarTodos();
    }


    public void deletarAcessoUsuario(int codigoAcessoUsuario){
        acessoUsuarioRepositorio.removePorCodigo(codigoAcessoUsuario);
    }

}
