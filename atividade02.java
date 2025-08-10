package Estrututras_de_Seleção_02;

import java.util.Scanner;

public class atividade02 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Informe um número inteiro:");
            int num = input.nextInt();

        if (num > 0 ){
            System.out.println("Número positivo!");
        } else if (num < 0){
            System.out.println("Número negativo!");
        } else {
            System.out.println("Número igual a zero!");
        }

        input.close();
    }
}
