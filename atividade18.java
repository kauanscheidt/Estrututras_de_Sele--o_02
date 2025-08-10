package Estrututras_de_Seleção_02;

import java.util.Scanner;

public class atividade18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o comprimento do primeiro lado do triângulo:");
        double lado1 = input.nextDouble();

        System.out.println("Informe o comprimento do segundo lado do triângulo:");
        double lado2 = input.nextDouble();

        System.out.println("Informe o comprimento do terceiro lado do triângulo:");
        double lado3 = input.nextDouble();

        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
            System.out.println("Os lados informados podem formar um triângulo.");

            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("O triângulo é Equilátero.");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("O triângulo é Isósceles.");
            } else {
                System.out.println("O triângulo é Escaleno.");
            }
        } else {
            System.out.println("Os lados informados não podem formar um triângulo.");
        }

        input.close();
    }
}