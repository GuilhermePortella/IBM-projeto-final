package Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author Guilherme
 */
public class ConnectionMySQL {

    private static Connection connection;
    private static final String Driver = "com.mysql.cj.jdbc.Driver";
    public static String Banco = "";
    private static String URL = "jdbc:mysql://127.0.0.1:3306/"+Banco;
    private static String User = "";
    private static String Password = "";

    public static Connection getConnection() {
        
        Scanner scr = new Scanner(System.in);
        
        System.out.println("Digite o nome do seu Banco de dados: ");
        Banco = scr.next();
        System.out.println("Digite o seu nome de usuario: ");
        User = scr.next();
        System.out.println("Digite sua senha: ");
        Password = scr.next();
        
        if (connection == null) {
            try {
                Class.forName(Driver);
                connection = (Connection) DriverManager.getConnection(URL, User, Password);
                if (connection != null) {
                    System.out.println("A conexao com o seu banco " + Banco + " foi realizada com sucesso");
                }
            } catch (ClassNotFoundException e) {
                System.out.println("Erro ao carregar o driver de conexao " + e);
            }catch (SQLException e){
                System.out.println("Não foi possivel estabelever uma conexao com o banco de dados " + e);
            }
        }
        return connection;
    }
}