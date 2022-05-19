package br.leitor.infrastructure.repository;

import br.leitor.infrastructure.configuration.database.DatabaseConnectionConfig;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class QueryUtils {

    public static ResultSet executeQuery(String query){
        Connection connection = DatabaseConnectionConfig.getInstance().getConnection();
        try{
            Statement statement = connection.createStatement();
            boolean retornouDados = statement.execute(query);
            if(retornouDados) return statement.getResultSet();
            return null;
        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

}
