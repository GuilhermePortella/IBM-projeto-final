/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

/**
 *
 * @author Guilherme
 */
public class ConversorJSON {

    public static void Converter(Scanner scr) throws IOException {
        System.out.println("Digite o site para a conversão");
        String urlBase = scr.next();
        URL url = new URL(urlBase);
        
        URLConnection connURL = url.openConnection();
        BufferedReader bufferIN = new BufferedReader(new InputStreamReader(connURL.getInputStream()));
        
        System.out.println(bufferIN.getClass().getSimpleName());
        
        String urlString = bufferIN.readLine();
        System.out.println(urlString.getClass().getSimpleName());
        
     //   ObjectMapper objMapper = new ObjectMapper();
        
    }

}
