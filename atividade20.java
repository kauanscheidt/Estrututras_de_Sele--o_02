package Estrututras_de_Seleção_02;

import java.util.Scanner;

public class atividade20 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Informe um ano com 4 digitos:");
        double ano = input.nextDouble();

        if (ano >= 1000){
            boolean verificador = ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0);
            if (verificador == true){
                System.out.println("Ano bissexto.");
            }
            else {
                System.out.println("Ano não bissexto.");
            }
        } else {
            System.out.println("Ano inválido, informe um ano com 4 digitos.");
        }
        input.close();
    }
}