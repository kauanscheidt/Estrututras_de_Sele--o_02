package Estrututras_de_Seleção_02;

import java.util.Scanner;
import java.text.DecimalFormat;

public class atividade24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0");

        System.out.println("Informe a primeira nota:");
        double nota1 = input.nextDouble();

        System.out.println("Informe a segunda nota:");
        double nota2 = input.nextDouble();

        System.out.println("Informe a terceira nota:");
        double nota3 = input.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3.0;

        System.out.println("Média alcançada: " + df.format(media));

        if (media == 10) {
            System.out.println("Aprovado com Distinção");
        } else if (media >= 7) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }

        input.close();
    }
}