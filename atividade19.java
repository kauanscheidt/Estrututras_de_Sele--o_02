package Estrututras_de_Seleção_02;

import java.util.Scanner;

public class atividade19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o valor de A:");
        double a = input.nextDouble();

        if (a == 0) {
            System.out.println("A equação não é do segundo grau. O programa será encerrado.");
        } else {
            System.out.println("Informe o valor de B:");
            double b = input.nextDouble();

            System.out.println("Informe o valor de C:");
            double c = input.nextDouble();

            double delta = (b * b) - (4 * a * c);

            if (delta < 0) {
                System.out.println("A equação não possui raízes reais.");
            } else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.println("A equação possui apenas uma raiz real: x = " + x);
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);

                System.out.println("A equação possui duas raízes reais:");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            }
        }

        input.close();
    }
}