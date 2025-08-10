package Estrututras_de_Seleção_02;

import java.util.Scanner;

public class atividade03 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o sexo, 'F' - Feminino ou 'M' - Masculino");
                char sexo = input.next().charAt(0);

        if (sexo == 'F' || sexo == 'f'){
            System.out.println("F - Feminino");
        } else if (sexo == 'M' || sexo == 'm'){
            System.out.println("M - Masculino");
        } else {
            System.out.println("Sexo inválido, digite 'F' ou 'M'");
        }
        input.close();
    }
}