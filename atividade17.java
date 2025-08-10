package Estrututras_de_Seleção_02;

import java.util.Scanner;
import java.text.DecimalFormat;

public class atividade17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0");

        System.out.println("Informe a primeira nota:");
        double nota1 = input.nextDouble();

        System.out.println("Informe a segunda nota:");
        double nota2 = input.nextDouble();

        double media = (nota1 + nota2) / 2.0;

        String conceito;
        String situacao;

        if (media >= 9.0 && media <= 10.0) {
            conceito = "A";
        } else if (media >= 7.5 && media < 9.0) {
            conceito = "B";
        } else if (media >= 6.0 && media < 7.5) {
            conceito = "C";
        } else if (media >= 4.0 && media < 6.0) {
            conceito = "D";
        } else {
            conceito = "E";
        }

        if (conceito.equals("A") || conceito.equals("B") || conceito.equals("C")) {
            situacao = "APROVADO";
        } else {
            situacao = "REPROVADO";
        }

        System.out.println("Média de Aproveitamento: " + df.format(media));
        System.out.println("Conceito: " + conceito);
        System.out.println("Mensagem: " + situacao);

        input.close();
    }
}