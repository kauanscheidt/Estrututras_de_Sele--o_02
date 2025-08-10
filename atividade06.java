package Estrututras_de_Seleção_02;

import java.util.Scanner;

public class atividade06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número inteiro:");
        int numero = input.nextInt();
        int numeroOriginal = numero;

        if (numero % 2 == 0) {
            numero = numero + 1;
            System.out.println("O número " + numeroOriginal + " era par e foi transformado em " + numero);
        } else {
            numero = numero + 1;
            System.out.println("O número " + numeroOriginal + " era ímpar e foi transformado em " + numero);
        }

        input.close();
    }
}