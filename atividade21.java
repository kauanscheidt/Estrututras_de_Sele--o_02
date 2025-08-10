package Estrututras_de_Seleção_02;

import java.util.Scanner;

public class atividade21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean dataValida = true;

        System.out.println("Informe o dia (dd):");
        int dia = input.nextInt();

        System.out.println("Informe o mês (mm):");
        int mes = input.nextInt();

        System.out.println("Informe o ano (aaaa):");
        int ano = input.nextInt();

        if (mes < 1 || mes > 12) {
            dataValida = false;
        }

        if (ano <= 0) {
            dataValida = false;
        }

        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
            if (dia < 1 || dia > 31) {
                dataValida = false;
            }
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            if (dia < 1 || dia > 30) {
                dataValida = false;
            }

        } else if (mes == 2) {
            boolean eBissexto = (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
            if (eBissexto) {
                if (dia < 1 || dia > 29) {
                    dataValida = false;
                }
            } else {
                if (dia < 1 || dia > 28) {
                    dataValida = false;
                }
            }
        }

        if (dataValida) {
            System.out.println("A data " + dia + "/" + mes + "/" + ano + " é válida.");
        } else {
            System.out.println("A data " + dia + "/" + mes + "/" + ano + " é inválida.");
        }

        input.close();
    }
}