package Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
 *
 * @author Guilherme
 */
public class ConnectionMySQL {

    private static Connection connection;
    private static final String Driver = "com.mysql.cj.jdbc.Driver";
    public static String Banco = "dadosmes";
    private static String URL = "jdbc:mysql://localhost:3306/" + Banco;
    private static String User = "root";
    private static String Password = "";

    public static String closeConnection() throws SQLException {

        String conf1;
        try {
            getConnection().close();
            conf1 = "Conexão fechada";
            System.out.println("Conexão fechada");
        } catch (SQLException e) {
            System.out.println("Não foi possivel estabelever uma conexao com o banco de dados " + e);
            conf1 = "Error";
            System.out.println("Error");
        }
        return conf1;
    }

    public static String s;

    public static Connection getConnection() {

        if (connection == null) {
            try {
                Class.forName(Driver);
                connection = (Connection) DriverManager.getConnection(URL, User, Password);
                if (connection != null) {
                    s = "Conectado";
                    System.out.println("A conexao com o seu banco " + Banco + " foi realizada com sucesso");
                }
            } catch (ClassNotFoundException e) {
                s = "erro";
                System.out.println("Erro ao carregar o driver de conexao " + e);
            } catch (SQLException e) {
                s = "erro SQL";
                System.out.println("Não foi possivel estabelever uma conexao com o banco de dados " + e);
            }
        }
        return connection;
    }

    public static String openConnection() {
        return s;
    }
}
