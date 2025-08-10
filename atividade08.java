package Estrututras_de_Seleção_02;

import java.util.Scanner;

public class atividade08 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Informe a primeira nota do aluno:");
            double nota1 = input.nextDouble();
        System.out.println("Informe a segunda nota do aluno:");
            double nota2 = input.nextDouble();

        double mediaNotas = (nota1 + nota2) / 2;
            if (mediaNotas >= 7) {
                String media = String.format("%.2f", mediaNotas);
                    System.out.println("Aprovado, com nota: " +media);
            } else {
                String media = String.format("%.2f", mediaNotas);
                    System.out.println("Reprovado com nota: " +media);
            }
        input.close();
    }
}
