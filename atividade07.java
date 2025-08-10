package Estrututras_de_Seleção_02;

import java.util.Scanner;

public class atividade07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        int num1 = input.nextInt();
        System.out.println("Digite o segundo número:");
        int num2 = input.nextInt();
        System.out.println("Digite o terceiro número:");
        int num3 = input.nextInt();

        int primeiro = 0;
        int segundo = 0;
        int terceiro = 0;

        if (num1 >= num2 && num1 >= num3) {
            primeiro = num1;
            if (num2 >= num3) {
                segundo = num2;
                terceiro = num3;
            } else {
                segundo = num3;
                terceiro = num2;
            }
        } else if (num2 >= num1 && num2 >= num3) {
            primeiro = num2;
            if (num1 >= num3) {
                segundo = num1;
                terceiro = num3;
            } else {
                segundo = num3;
                terceiro = num1;
            }
        } else {
            primeiro = num3;
            if (num1 >= num2) {
                segundo = num1;
                terceiro = num2;
            } else {
                segundo = num2;
                terceiro = num1;
            }
        }

        System.out.println("Os números em ordem decrescente são:");
        System.out.println(primeiro + ", " + segundo + ", " + terceiro);
        input.close();
    }
}