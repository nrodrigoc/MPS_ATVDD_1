package br.leitor;

import br.leitor.service.UsuarioService;

public class Main {

    public static void main(String[] args) throws Exception {

        // As informações são de cadastro de usuário são passadas via parâmetro
        UsuarioService.cadastrarUsuario("riachuelo", "senha123", UsuarioService.EMISSOR);

        System.out.println(UsuarioService.retonarPorCodigo(0).toString());
    }
}
