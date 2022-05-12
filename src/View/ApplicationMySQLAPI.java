/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.ConnectionMySQL;
import DAO.MySQLCrud;
import java.sql.SQLException;

/**
 *
 * @author Guilherme
 */
public class ApplicationMySQLAPI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        
        System.out.println("Ola mundo");
        
        MySQLCrud.createDataBase();
    }   
}