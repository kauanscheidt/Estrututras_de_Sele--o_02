package Estrututras_de_Seleção_02;

import java.util.Scanner;

public class atividade11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe qual turno você estuda:");
        String turno = input.next();

        if (turno.equalsIgnoreCase("matutino")){
            System.out.println("Bom Dia!");
        } else if (turno.equalsIgnoreCase("vespertino")){
            System.out.println("Boa Tarde!");
        } else if (turno.equalsIgnoreCase("noturno")){
            System.out.println("Boa Noite!");
        }
        input.close();
    }
}
