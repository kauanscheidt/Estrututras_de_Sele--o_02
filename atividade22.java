package Estrututras_de_Seleção_02;

import java.util.Scanner;

public class atividade22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe um número inteiro menor que 1000:");
        int numero = input.nextInt();

        if (numero >= 1000) {
            System.out.println("O número informado é inválido. O programa será encerrado.");
        } else {
            int centenas = numero / 100;
            int dezenas = (numero % 100) / 10;
            int unidades = numero % 10;

            System.out.println("\nAnalisando o número " + numero + ":");

            System.out.print(centenas);
            if (centenas == 1) {
                System.out.print(" centena");
            } else {
                System.out.print(" centenas");
            }

            System.out.print(", " + dezenas);
            if (dezenas == 1) {
                System.out.print(" dezena");
            } else {
                System.out.print(" dezenas");
            }

            System.out.print(" e " + unidades);
            if (unidades == 1) {
                System.out.println(" unidade.");
            } else {
                System.out.println(" unidades.");
            }
        }

        input.close();
    }
}