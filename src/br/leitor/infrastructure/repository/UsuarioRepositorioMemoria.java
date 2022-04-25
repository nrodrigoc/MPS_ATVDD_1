package br.leitor.infrastructure.repository;

import br.leitor.domain.Usuario;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UsuarioRepositorioMemoria implements UsuarioRepositorio{

    private static final List<Usuario> usuarios = new ArrayList<>();

    public Usuario salvar(Usuario usuario) {
        long codigo = usuarios.size() == 0 ? 0 : usuarios.get(usuarios.size() -1 ).getCodigo() + 1;
        usuario.setCodigo(codigo);
        usuarios.add(usuario);
        return usuario;
    }

    public Usuario retornaPorCodigo(final long codigo) {
        List<Usuario> listaFiltrada = usuarios.stream().filter(usr -> usr.getCodigo() == codigo).collect(Collectors.toList());
        return listaFiltrada.get(0);
    }

    public List<Usuario> retornarTodos() {
        return usuarios;
    }

    public void removePorLogin(final String login) {
        List<Usuario> listaFiltrada = usuarios.stream().filter(usr -> login.equals(usr.getLogin())).collect(Collectors.toList());
        for (Usuario usr : listaFiltrada) {
            usuarios.remove(usr);
        }
    }
}
