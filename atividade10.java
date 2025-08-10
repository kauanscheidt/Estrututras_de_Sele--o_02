package Estrututras_de_Seleção_02;

import java.util.Scanner;

public class atividade10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe 3 números inteiros:");

        System.out.println("Primeiro número:");
        int num1 = input.nextInt();

        System.out.println("Segundo número:");
        int num2 = input.nextInt();

        System.out.println("Terceiro número:");
        int num3 = input.nextInt();

        //caso número 1 for maior
        if (num1 > num2 && num2 > num3) {
            System.out.println("Maior número:" +num1);
            System.out.println("Menor número:" +num3);
        } else if (num1 > num3 && num3 > num2) {
            System.out.println("Maior número:" +num1);
            System.out.println("Menor número:" +num2);

        //caso número 2 for maior
        } else if (num2 > num1 && num1 > num3) {
            System.out.println("Maior número:" +num2);
            System.out.println("Menor número:" +num3);
        } else if (num2 > num3 && num3 > num1) {
            System.out.println("Maior número:" +num2);
            System.out.println("Menor número:" +num1);

        //caso número 3 for maior
        } else if (num3 > num1 && num1 > num2) {
            System.out.println("Maior número:" +num3);
            System.out.println("Menor número:" +num2);
        } else if (num3 > num2 && num2 > num1) {
            System.out.println("Maior número:" + num3);
            System.out.println("Menor número:" + num1);
        }
        input.close();
    }
}
