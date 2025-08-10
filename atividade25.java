package Estrututras_de_Seleção_02;

import java.util.Scanner;

public class atividade25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o valor do saque (entre R$ 10 e R$ 600):");
        int valorSaque = input.nextInt();

        if (valorSaque < 10 || valorSaque > 600) {
            System.out.println("Valor de saque inválido. O programa será encerrado.");
        } else {
            int notas100 = 0;
            int notas50 = 0;
            int notas10 = 0;
            int notas5 = 0;
            int notas1 = 0;

            int valorRestante = valorSaque;

            if (valorRestante >= 100) {
                notas100 = valorRestante / 100;
                valorRestante %= 100;
            }
            if (valorRestante >= 50) {
                notas50 = valorRestante / 50;
                valorRestante %= 50;
            }
            if (valorRestante >= 10) {
                notas10 = valorRestante / 10;
                valorRestante %= 10;
            }
            if (valorRestante >= 5) {
                notas5 = valorRestante / 5;
                valorRestante %= 5;
            }
            if (valorRestante >= 1) {
                notas1 = valorRestante / 1;
                valorRestante %= 1;
            }

            System.out.println("Para o saque de R$ " + valorSaque + ", serão fornecidas:");
            if (notas100 > 0) {
                System.out.println(notas100 + " nota(s) de R$ 100.");
            }
            if (notas50 > 0) {
                System.out.println(notas50 + " nota(s) de R$ 50.");
            }
            if (notas10 > 0) {
                System.out.println(notas10 + " nota(s) de R$ 10.");
            }
            if (notas5 > 0) {
                System.out.println(notas5 + " nota(s) de R$ 5.");
            }
            if (notas1 > 0) {
                System.out.println(notas1 + " nota(s) de R$ 1.");
            }
        }

        input.close();
    }
}