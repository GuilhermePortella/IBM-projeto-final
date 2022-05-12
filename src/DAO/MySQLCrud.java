/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import Controller.ConnectionMySQL;

/**
 *
 * @author Guilherme
 */
public class MySQLCrud {

    private static String Tabela;

    public static void inserDataBase(String indicador, String data, String dataReferencia, double media,
            double mediana, double desvioPadrao, double coeficienteVariacao, double minimo, double maximo,
            int numeroRespondentes, int baseCalculo) throws SQLException {

        Connection conn = ConnectionMySQL.getConnection();

        Statement stmt = null;
        ResultSet rs = null;
        boolean headResult = false;

        Scanner scr = new Scanner(System.in);
        System.out.println("Digite o nome da sua tabela: ");
        Tabela = scr.next();

        try {
            stmt = conn.createStatement();
            headResult = stmt.execute("insert into " + Tabela + " (indicador, data, datareferencia, media, mediana, desviopadrao, coeficientevariacao,"
                    + " minimo, maximo, numerorespondentes, basecalculo)"
                    + " values(' " + indicador + "','" + data + "','" + dataReferencia + "'," + media + "," + mediana + ","
                    + desvioPadrao + "," + coeficienteVariacao + "," + minimo + "," + maximo + ","
                    + numeroRespondentes + "," + baseCalculo + ");"
            );
            rs = stmt.getResultSet();
        } catch (SQLException e) {

            System.out.println("SQLException: " + e.getMessage());
            System.out.println("SQLState: " + e.getSQLState());
            System.out.println("VendorError: " + e.getErrorCode());

        } finally {
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException sqlEx) {
                    System.out.println("SQLException: " + sqlEx.getMessage());
                    System.out.println("SQLState: " + sqlEx.getSQLState());
                    System.out.println("VendorError: " + sqlEx.getErrorCode());
                }
                stmt = null;
            }
        }
    }//final inset

    public static void createDataBase() throws SQLException {

        Connection conn = ConnectionMySQL.getConnection();

        Statement pstm = null;
        ResultSet rs = null;
        boolean headResult = false;

        String v1 = "CREATE SCHEMA IF NOT EXISTS `dadosmes` DEFAULT CHARACTER SET utf8 ;";
        String v2 = "USE `dadosmes` ;";
        String v3 = "CREATE TABLE IF NOT EXISTS `dadosmes`.`DadosJson` (\n"
                + "  `id` INT NOT NULL AUTO_INCREMENT,\n"
                + "  `indicador` VARCHAR(60) NOT NULL,\n"
                + "  `data` VARCHAR(10) NOT NULL,\n"
                + "  `dataReferencia` VARCHAR(20) NOT NULL,\n"
                + "  `media` decimal(10) NOT NULL,\n"
                + "  `mediana` decimal(10) NOT NULL,\n"
                + "  `desvioPadrao` decimal(10) NOT NULL,\n"
                + "  `coeficienteVariacao` decimal(10) NOT NULL,\n"
                + "  `minimo` decimal(10) NOT NULL,\n"
                + "  `maximo` decimal(10) NOT NULL,\n"
                + "  `numeroRespondentes` decimal(10) NOT NULL,\n"
                + "  `baseCalculo` decimal(10) NOT NULL,\n"
                + "   PRIMARY KEY (`id`))\n"
                + "ENGINE = InnoDB\n"
                + "AUTO_INCREMENT = 2\n"
                + "DEFAULT CHARACTER SET = latin1;";

        pstm = conn.prepareStatement(v1);

        pstm.addBatch(v2);
        pstm.addBatch(v3);
        pstm.executeBatch();
        pstm.clearBatch();
        pstm.close();
    }

    public static void printResult() throws SQLException {

        Connection conn = ConnectionMySQL.getConnection();

        Statement stmt = null;
        ResultSet rs = null;

        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM dadosmes");

            while (rs.next()) {
                System.out.println(rs.getString("indicador") + " " + rs.getString("data") + " "
                        + rs.getString("dataReferencia") + " " + rs.getString("media") + " " + rs.getString("mediana")
                        + " " + rs.getString("desvioPadrao") + " " + rs.getString("coeficienteVariacao") + " "
                        + rs.getString("minimo") + " " + rs.getString("maximo") + " "
                        + rs.getString("numeroRespondentes") + " " + rs.getString("baseCalculo"));
            }
        } catch (SQLException e) {

            System.out.println("SQLException: " + e.getMessage());
            System.out.println("SQLState: " + e.getSQLState());
            System.out.println("VendorError: " + e.getErrorCode());

        } finally {
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException sqlEx) {
                    System.out.println("SQLException: " + sqlEx.getMessage());
                    System.out.println("SQLState: " + sqlEx.getSQLState());
                    System.out.println("VendorError: " + sqlEx.getErrorCode());
                }
                stmt = null;
            }
        }
    } //final printResult

}
