package br.leitor.infrastructure.repository;

import br.leitor.domain.AcessoUsuario;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static br.leitor.infrastructure.repository.QueryUtils.executeQuery;

public class AcessoUsuarioRepositorioDatabase implements AcessoUsuarioRepositorio{
    @Override
    public AcessoUsuario salvar(AcessoUsuario acesso) {
        String query = "insert into T_USERACCESS(codigo, dataAcesso, codigoUsuario) " + "values (nextval('s_useraccess'), select TO_DATE('" + acesso.getDataAcesso().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")) + "','DD-MM-YYYY HH:mm:ss' ),'" + acesso.getCodigoUsuario() + ") RETURNING *";
        ResultSet resultSet = executeQuery(query);
        return parseResultSetToUserAccess(resultSet);
    }

    @Override
    public AcessoUsuario retornaPorCodigo(long codigo) {
        String query = "SELECT * FROM T_USERACCESS tua where tua.codigo = "+ codigo;
        ResultSet resultSet = executeQuery(query);
        return parseResultSetToUserAccess(resultSet);
    }

    @Override
    public List<AcessoUsuario> retornarTodos() {
        String query = "SELECT * FROM T_USERACCESS";
        ResultSet resultSet = executeQuery(query);
        return parseResultSetToListUserAcess(resultSet);
    }

    @Override
    public List<AcessoUsuario> retornarAcessoPorUsuario(long codigoUsuario) {
        String query = "SELECT * FROM T_USERACCESS tua where tua.codigoUsuario = "+ codigoUsuario +" ORDER BY 1 DESC;";
        ResultSet resultSet = executeQuery(query);
        return parseResultSetToListUserAcess(resultSet);
    }

    @Override
    public AcessoUsuario editarAcessoUsuario(long codigo, AcessoUsuario acessoUsuario) {
        String query = "UPDATE T_USERACCESS tua where tua.codigo = "+ codigo +";";
        ResultSet resultSet = executeQuery(query);
        return parseResultSetToUserAccess(resultSet);
    }

    @Override
    public void removePorCodigo(long codigo) {
        String query = "DELETE FROM T_USERACCESS tua where tua.codigo = "+ codigo;
        ResultSet resultSet = executeQuery(query);
    }

    private List<AcessoUsuario> parseResultSetToListUserAcess(ResultSet resultSet) {
        List<AcessoUsuario> acessoUsuarios = new ArrayList<AcessoUsuario>();
        AcessoUsuario acessoUsuario = null;
        do {
            acessoUsuario = null;
            acessoUsuario = parseResultSetToUserAccess(resultSet);
            if(acessoUsuario!=null) acessoUsuarios.add(acessoUsuario);
        }while (acessoUsuario != null);
        return acessoUsuarios;
    }

    private AcessoUsuario parseResultSetToUserAccess(ResultSet resultSet) {
        try {
            resultSet.next();
            int codigo = resultSet.getInt("codigo");
            Date dataAcesso = resultSet.getDate("dataAcesso");
            int codigoUsuario = resultSet.getInt("codigoUsuario");
            return new AcessoUsuario(codigo, dataAcesso.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime(), codigoUsuario);
        } catch (SQLException throwables) {
            return null;
        }
    }

}
