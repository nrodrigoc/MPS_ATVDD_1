package br.leitor;

import br.leitor.service.UsuarioService;

public class Main {

    public static void main(String[] args) throws Exception {

        // As informações são de cadastro de usuário são passadas via parâmetro
        UsuarioService.cadastrarUsuario("riachuelo", "senha123", UsuarioService.EMISSOR);
        UsuarioService.cadastrarUsuario("admin", "admin123", UsuarioService.PAYTAL);


        // Imprime todos os usuarios
        UsuarioService.imprimirTodos();

        // Remove usuario com login "riachuelo"
        UsuarioService.removePorLogin("riachuelo");

        // Imprime novamente todos os usuarios;
        UsuarioService.imprimirTodos();
    }
}
