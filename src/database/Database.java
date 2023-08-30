package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Database {
    public Connection dbConnection(String database, String port, String password, String user) {
        String url = "jdbc:postgresql://localhost:" + port + "/" + database;

        Properties pros = new Properties();
        pros.setProperty("user", user);
        pros.setProperty("password", password);

        try
        {
            Connection connection = DriverManager.getConnection(url, pros);
            System.out.println("Conexión establecida");
            return connection;
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }
}