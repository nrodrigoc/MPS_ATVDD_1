package br.leitor.repository;

import br.leitor.entity.Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UsuarioRepository {

    private static final List<Usuario> usuarios = new ArrayList<>();

    public static Usuario salvar(Usuario usuario) {
        long codigo = usuarios.size() == 0 ? 0 : usuarios.get(usuarios.size() -1 ).getCodigo() + 1;
        usuario.setCodigo(codigo);
        usuarios.add(usuario);
        return usuario;
    }

    public static Usuario retornaPorCodigo(final long codigo) {
        List<Usuario> filtro = usuarios.stream().filter(usr -> usr.getCodigo() == codigo).collect(Collectors.toList());
        return filtro.get(0);
    }

}
