package Estrututras_de_Seleção_02;

import java.util.Scanner;

public class atividade29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int contador = 0;

        System.out.println("Responda às seguintes perguntas sobre um crime com 'sim' ou 'nao':");

        System.out.println("1. Telefonou para a vítima?");
        String resposta1 = input.next();
        if (resposta1.equalsIgnoreCase("sim")) {
            contador++;
        }

        System.out.println("2. Esteve no local do crime?");
        String resposta2 = input.next();
        if (resposta2.equalsIgnoreCase("sim")) {
            contador++;
        }

        System.out.println("3. Mora perto da vítima?");
        String resposta3 = input.next();
        if (resposta3.equalsIgnoreCase("sim")) {
            contador++;
        }

        System.out.println("4. Devia para a vítima?");
        String resposta4 = input.next();
        if (resposta4.equalsIgnoreCase("sim")) {
            contador++;
        }

        System.out.println("5. Já trabalhou com a vítima?");
        String resposta5 = input.next();
        if (resposta5.equalsIgnoreCase("sim")) {
            contador++;
        }

        if (contador == 2) {
            System.out.println("Suspeita");
        } else if (contador == 3 || contador == 4) {
            System.out.println("Cúmplice");
        } else if (contador == 5) {
            System.out.println("Assassino");
        } else {
            System.out.println("Inocente");
        }

        input.close();
    }
}