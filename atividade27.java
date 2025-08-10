package Estrututras_de_Seleção_02;

import java.util.Scanner;

public class atividade27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe um número:");
        double numero = input.nextDouble();

        long numeroInteiro = (long) numero;

        if (numero == numeroInteiro) {
            System.out.println("O número " + numero + " é inteiro.");
        } else {
            System.out.println("O número " + numero + " é decimal.");
        }

        input.close();
    }
}