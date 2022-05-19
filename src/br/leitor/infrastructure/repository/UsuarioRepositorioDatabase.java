package br.leitor.infrastructure.repository;

import br.leitor.domain.Usuario;
import br.leitor.infrastructure.configuration.database.DatabaseConnectionConfig;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static br.leitor.infrastructure.repository.QueryUtils.executeQuery;

public class UsuarioRepositorioDatabase implements UsuarioRepositorio{

    private final DatabaseConnectionConfig databaseConnection = DatabaseConnectionConfig.getInstance();

    @Override
    public Usuario salvar(Usuario usuario) {
        String query = "insert into T_USER(codigo, login, senha, tipo) " + "values (nextval('s_user'), '" + usuario.getLogin() + "','" + usuario.getSenha()+"'," + usuario.getTipo()+") RETURNING *";
        ResultSet resultSet = executeQuery(query);
        return parseResultSetToUser(resultSet);
    }

    @Override
    public Usuario retornaPorCodigo(long codigo) {
        String query = "SELECT * FROM T_USER tu WHERE tu.codigo ="+codigo;
        ResultSet resultSet = executeQuery(query);
        return parseResultSetToUser(resultSet);
    }

    @Override
    public List<Usuario> retornarTodos() {
        String query = "SELECT * FROM T_USER";
        ResultSet resultSet = executeQuery(query);
        return parseResultSetToListUser(resultSet);
    }

    @Override
    public void removePorLogin(String login) {
        String query = "DELETE FROM T_USER tu WHERE tu.login = '"+login+"'";
        executeQuery(query);
    }

    private List<Usuario> parseResultSetToListUser(ResultSet resultSet) {
        List<Usuario> usuarios = new ArrayList<Usuario>();
        Usuario usuario = null;
        do {
            usuario= null;
            usuario= parseResultSetToUser(resultSet);
            if(usuario!=null) usuarios.add(usuario);
        }while (usuario != null);
        return usuarios;
    }

    private Usuario parseResultSetToUser(ResultSet resultSet) {
        try {
            resultSet.next();
            int codigo = resultSet.getInt("codigo");
            String login = resultSet.getString("login");
            String senha = resultSet.getString("senha");
            int tipo = resultSet.getInt("tipo");
            return new Usuario(codigo, login, senha, tipo);
        } catch (SQLException throwables) {
            return null;
        }
    }
}
