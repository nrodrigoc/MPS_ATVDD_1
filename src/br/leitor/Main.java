package br.leitor;

import br.leitor.application.facade.UsuarioFacadeService;
import br.leitor.domain.Administrador;
import br.leitor.domain.AdministradorAdapter;
import br.leitor.domain.Usuario;
import br.leitor.application.service.UsuarioServiceImpl;
import br.leitor.infrastructure.repository.UsuarioRepositorioMemoria;

public class Main {

    public static void main(String[] args) throws Exception {
        UsuarioFacadeService facade = UsuarioFacadeService.getInstance();
        UsuarioServiceImpl usuarioService = new UsuarioServiceImpl(new UsuarioRepositorioMemoria());

        // As informações são de cadastro de usuário são passadas via parâmetro
        Usuario usuarioRiachuelo = usuarioService.cadastrarUsuario("riachuelo", "senha123", Usuario.EMISSOR);
        usuarioService.cadastrarUsuario("admin", "admin123", Usuario.PAYTAL);

        // Imprime todos os usuarios
        usuarioService.imprimirTodos();

        // Remove usuario com login "riachuelo"
        usuarioService.removePorLogin("riachuelo");

        // Imprime novamente todos os usuarios;
        usuarioService.imprimirTodos();


        // Demonstração do Adapter
        Administrador administrador = new Administrador(1, "admin-1", "token-de-aceso-123");

        usuarioService.logar(usuarioRiachuelo);

        usuarioService.logar(new AdministradorAdapter(administrador));

        // Demonstração do singleton e do template
        facade.gerarRelatorioPDF();

    }
}
