/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.util.Scanner;

/**
 *
 * @author Guilherme
 */
public class MenuDeUsuario {

    public static int validacaoInt(Scanner leitor) {
        int inputUsuario = 0;
        if (leitor.hasNextInt()) {
            inputUsuario = leitor.nextInt();
        } else {
            leitor.next();
            System.out.println("Opção não existe. Tente novamente. ");
        }
        return inputUsuario;
    }

    public static int entradaUsuario(Scanner scr) {
        int entrada;
        do {
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            entrada = MenuDeUsuario.validacaoInt(scr);
        } while (entrada < 1 || entrada > 6);
        return entrada;
    }

    public static int entradaUsuario2(Scanner scr) {
        int entrada;
        do {
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            entrada = MenuDeUsuario.validacaoInt(scr);
        } while (entrada < 1 || entrada > 5);
        return entrada;
    }
}
