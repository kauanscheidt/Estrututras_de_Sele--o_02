package Estrututras_de_Seleção_02;

import java.util.Scanner;
import java.text.DecimalFormat;

public class atividade16 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("Informe a primeira nota do aluno:");
        double nota1 = input.nextDouble();
        System.out.println("Informe a segunda nota do aluno:");
        double nota2 = input.nextDouble();

        double mediaNotas = (nota1 + nota2) / 2;
        String situacao;

        if (mediaNotas >= 0 && mediaNotas < 3) {
            situacao = "Reprovado";
        } else if (mediaNotas >= 3 && mediaNotas < 7) {
            situacao = "Em Exame";
        } else if (mediaNotas >= 7 && mediaNotas <= 10) {
            situacao = "Aprovado";
        } else {
            situacao = "Média inválida";
        }

        System.out.println("Média do aluno: " + df.format(mediaNotas));
        System.out.println("Situação: " + situacao);

        input.close();
    }
}