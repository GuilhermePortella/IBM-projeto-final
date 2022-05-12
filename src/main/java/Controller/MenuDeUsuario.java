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
            System.out.println("1 - Criar tabela padrão");
            System.out.println("2 - converter dados Json");
            System.out.println("3 - Exibir Dados");
            System.out.println("4 - Deletar algum registro");
            System.out.println("5 - Alterar algum registro ");
            System.out.println("6 - Sair");
            entrada = MenuDeUsuario.validacaoInt(scr);
        } while (entrada < 1 || entrada > 6);
        return entrada;
    }

    public static int entradaUsuario2(Scanner scr) {
        int entrada;
        do {
            System.out.println("1 - Exibir toda tabela ");
            System.out.println("2 - Exibir com filtro de indicador");
            System.out.println("3 - Exibir com filtro de Data de referecia");
            System.out.println("4 - Exibir com filtro de numero de respondentes");
            System.out.println("5 - Exibir com filtro de Coeficiente Variacao");
            System.out.println("6 - Sair");
            entrada = MenuDeUsuario.validacaoInt(scr);
        } while (entrada < 1 || entrada > 6);
        return entrada;
    }
}
