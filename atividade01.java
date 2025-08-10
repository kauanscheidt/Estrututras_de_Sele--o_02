package Estrututras_de_Seleção_02;

import java.util.Scanner;

public class atividade01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe dois números:");
        System.out.println("Primeiro número:");
            double num1 = input.nextDouble();
                String Num1 = String.format("%.2f", num1);
        System.out.println("Segundo número");
            double num2 = input.nextDouble();
                String Num2 = String.format("%.2f", num2);

        if (num1 < num2) {
            System.out.println("O número maior é: "+ Num2);
        } else if (num1 > num2) {
            System.out.println("O número maior é: "+ Num1);
        } else {
            System.out.println("O dois números tem o mesmo valor: " + Num1);
        }

        input.close();
    }
}