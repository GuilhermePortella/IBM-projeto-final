package View;

import Controller.ConnectionMySQL;
import DAO.MySQLCrud;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author Guilherme
 */
public class ApplicationMySQLAPI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, IOException {
        // TODO code application logic here
        Scanner scr = new Scanner(System.in);

        System.out.println("Ola seja bem vindo ao sistema");

        int cond = 0;
        do {
            cond = Controller.MenuDeUsuario.entradaUsuario(scr);

            switch (cond) {

                case 1:
                    DAO.MySQLCrud.createDataBasePadrao();
                    break;
                case 2:
                    Controller.ConversorJSON.Converter(scr);
                    break;
                case 3:
                    System.out.println("3 - Exibir tabela");
                    int aux;
                    do {
                        aux = Controller.MenuDeUsuario.entradaUsuario2(scr);
                        switch (aux) {
                            case 1:
                                DAO.MySQLCrud.printResult();
                                break;
                            case 2:
                                DAO.MySQLCrud.printIndicador();
                                
                                break;
                            case 3:
                                DAO.MySQLCrud.printReferencia();
                                break;
                            case 4:
                                DAO.MySQLCrud.printnumeroRespondentes();
                                break;
                            case 5:
                                DAO.MySQLCrud.printCoeficienteVariacao();
                                break;
                        }
                    } while (aux != 6);
                case 4:
                    DAO.MySQLCrud.deleteResult();
                    break;
                case 5:
                    DAO.MySQLCrud.updateDataBase();
                    break;
            }
        } while (cond != 6);
    }
}
