package br.leitor.application.facade;

import br.leitor.application.presentation.Relatorio;
import br.leitor.application.presentation.UsuarioPresentation;
import br.leitor.application.service.AcessoUsuarioService;
import br.leitor.application.service.UsuarioService;
import br.leitor.application.service.factory.AcessoUsuarioServiceFactoryImpl;
import br.leitor.application.service.factory.UsuarioServiceFactoryImpl;
import br.leitor.domain.AcessoUsuario;
import br.leitor.domain.Usuario;

import java.util.List;

public class UsuarioFacadeService {

    // Singleton
    private static UsuarioFacadeService instance;

    private final AcessoUsuarioService acessoUsuarioService;
    private final UsuarioService usuarioService;

    private UsuarioFacadeService() {
        this.acessoUsuarioService = new AcessoUsuarioServiceFactoryImpl().criarAcessoUsuarioService();
        this.usuarioService = new UsuarioServiceFactoryImpl().criarUsuarioService();
    }

    public static UsuarioFacadeService getInstance() {
        if (instance == null)
            instance = new UsuarioFacadeService();
        return instance;
    }

    public UsuarioPresentation buscarUsuarioPorId(long codigo){
        Usuario usuario = usuarioService.retonarPorCodigo(codigo);
        List<AcessoUsuario> acessoUsuarios = acessoUsuarioService.buscarAcessoPorUsuario((int) usuario.getCodigo());
        return montarPresentation(usuario, acessoUsuarios);
    }

    public Relatorio gerarRelatorio(){
        return new Relatorio();
    }

    private UsuarioPresentation montarPresentation(Usuario user, List<AcessoUsuario> acessoUsuarioList){
        return new UsuarioPresentation(user, acessoUsuarioList);
    }

}
