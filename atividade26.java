package Estrututras_de_Seleção_02;

import java.util.Scanner;

public class atividade26{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe um número inteiro para verificar se ele é par ou ímpar:");
        int numero = input.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O número " + numero + " é par.");
        } else {
            System.out.println("O número " + numero + " é ímpar.");
        }

        input.close();
    }
}