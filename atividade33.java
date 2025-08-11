package Estrututras_de_Seleção_02;

import java.util.Scanner;

public class atividade33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String respostaCorretaQ1 = "a";
        String respostaCorretaQ2 = "a";

        String respostaCandidatoQ1;
        String respostaCandidatoQ2;

        System.out.print("Questão 1: ");
        respostaCandidatoQ1 = input.next().toLowerCase();

        System.out.print("Questão 2: ");
        respostaCandidatoQ2 = input.next().toLowerCase();

        System.out.print("Q1: " + respostaCandidatoQ1 + " : ");
        if (respostaCandidatoQ1.equals(respostaCorretaQ1)) {
            System.out.println("Correto");
        } else {
            System.out.println("Errada, resposta correta (" + respostaCorretaQ1 + ")");
        }

        System.out.print("Q2: " + respostaCandidatoQ2 + " : ");
        if (respostaCandidatoQ2.equals(respostaCorretaQ2)) {
            System.out.println("Correto");
        } else {
            System.out.println("Errada, resposta correta (" + respostaCorretaQ2 + ")");
        }

        input.close();
    }
}
