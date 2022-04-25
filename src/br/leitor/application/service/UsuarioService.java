package br.leitor.application.service;


import br.leitor.domain.Usuario;
import br.leitor.infrastructure.repository.UsuarioRepositorio;

import java.util.List;

public class UsuarioService {

    private final UsuarioRepositorio usuarioRepositorio;

    public UsuarioService(UsuarioRepositorio usuarioRepositorio) {
        this.usuarioRepositorio = usuarioRepositorio;
    }

    public Usuario cadastrarUsuario(String login, String senha, int tipoUsuario) throws Exception {
        Usuario usuario = new Usuario();

        if (loginValido(login))
            usuario.setLogin(login);
        if (senhaValida(senha))
            usuario.setSenha(senha);

        usuario.setTipo(tipoUsuario);

        return usuarioRepositorio.salvar(usuario);
    }

    public Usuario retonarPorCodigo(long codigo) {
        return usuarioRepositorio.retornaPorCodigo(codigo);
    }

    private static boolean loginValido(String login) throws Exception {

        if (login.isEmpty()) {
            throw new Exception("O login não deve ser vazio!");
        }else if (login.length() > 12) {
            throw new Exception("O login não deve ter mais de 12 caracteres!");
        }else if (login.matches(".*[0-9].*")) {
            throw new Exception("O login não deve conter números!");
        }

        return true;
    }

    private static boolean senhaValida(String senha) throws Exception {

        if (senha.isEmpty()) {
            throw new Exception("A senha não deve ser vazia!");
        }else if (senha.length() > 20) {
            throw new Exception("A senha não deve ter mais de 20 caracteres!");
        }else if (senha.length() < 8) {
            throw new Exception("A senha não deve ter menos de 8 caracteres!");
        }else if (senha.matches("[0-9]")) {
            throw new Exception("A senha não deve conter números!");
        }
        return true;
    }

    public void imprimirTodos() {
        String stringUsuarios = "[\n";

        List<Usuario> usuarios = usuarioRepositorio.retornarTodos();

        for (Usuario usr : usuarios) {
            stringUsuarios = stringUsuarios.concat(usr.toString());
            stringUsuarios = stringUsuarios.concat(",\n");
        }

        stringUsuarios = stringUsuarios.concat("]");

        System.out.println("Lista com todos os usuarios: \n");
        System.out.println(stringUsuarios);
    }

    public void removePorLogin(String login) {
        usuarioRepositorio.removePorLogin(login);
    }

}
