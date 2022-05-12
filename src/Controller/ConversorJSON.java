package Controller;

import DAO.ListaMap;
import DAO.MySQLCrud;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author Guilherme
 */
public class ConversorJSON {

    public static void Converter(Scanner scr) throws IOException, SQLException {
        System.out.println("Digite o site para a conversão");
        String urlBase = scr.next();
        URL url = new URL(urlBase);

        URLConnection connURL = url.openConnection();
        BufferedReader bufferIN = new BufferedReader(new InputStreamReader(connURL.getInputStream()));

        System.out.println(bufferIN.getClass().getSimpleName());

        String urlString = bufferIN.readLine();
        System.out.println(urlString.getClass().getSimpleName());

        ObjectMapper objMapper = new ObjectMapper();
        ListaMap value = objMapper.readValue(urlString, ListaMap.class);

        int size = value.getValue().size();
        int table = 1;
        System.out.println("we add " + size + " records");

        while (table < size) {
            MySQLCrud.inserDataBase(
                    value.getValue().get(table).getIndicador(),
                    value.getValue().get(table).getData(),
                    value.getValue().get(table).getDataReferencia(),
                    value.getValue().get(table).getMedia(),
                    value.getValue().get(table).getMediana(),
                    value.getValue().get(table).getDesvioPadrao(),
                    value.getValue().get(table).getCoeficienteVariacao(),
                    value.getValue().get(table).getMinimo(),
                    value.getValue().get(table).getMaximo(),
                    value.getValue().get(table).getNumeroRespondentes(),
                    value.getValue().get(table).getBaseCalculo());
            table++;
        }
    }
}
