package br.leitor.infrastructure.configuration.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DatabaseConnectionConfig {

    private static DatabaseConnectionConfig instance;
    private  Connection connection;

    private DatabaseConnectionConfig() {
        connection = createConnection();
    }

    public static DatabaseConnectionConfig getInstance() {
        if (instance == null)
            instance = new DatabaseConnectionConfig();
        return instance;
    }

    public Connection getConnection() {
        return connection;
    }

    private static Connection createConnection() {
        try {
            Class.forName("org.postgresql.Driver");
            String url = "jdbc:postgresql://localhost/mps";
            Properties props = new Properties();
            props.setProperty("user", "mps_usr");
            props.setProperty("password", "mps_pss");
            props.setProperty("ssl", "false");
            return DriverManager.getConnection(url, props);
        } catch (SQLException throwables) {
            throw new RuntimeException("Falha ao conectar no banco: " + throwables.getSQLState());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Falha ao inicializar. Adicione o Driver do Postgresql");
        }
    }


}
