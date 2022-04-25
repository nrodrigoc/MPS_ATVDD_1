package br.leitor;

import br.leitor.domain.Usuario;
import br.leitor.application.service.UsuarioService;
import br.leitor.infrastructure.repository.UsuarioRepositorioMemoria;

public class Main {

    public static void main(String[] args) throws Exception {
        UsuarioService usuarioService = new UsuarioService(new UsuarioRepositorioMemoria());

        // As informações são de cadastro de usuário são passadas via parâmetro
        usuarioService.cadastrarUsuario("riachuelo", "senha123", Usuario.EMISSOR);
        usuarioService.cadastrarUsuario("admin", "admin123", Usuario.PAYTAL);


        // Imprime todos os usuarios
        usuarioService.imprimirTodos();

        // Remove usuario com login "riachuelo"
        usuarioService.removePorLogin("riachuelo");

        // Imprime novamente todos os usuarios;
        usuarioService.imprimirTodos();
    }
}
