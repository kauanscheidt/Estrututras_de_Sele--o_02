package Estrututras_de_Seleção_02;

import java.util.Scanner;

public class atividade09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe seu sexo:");
        System.out.println("Masculino - (M):");
        System.out.println("Feminino - (F):");
        String sexo = input.next();
        System.out.println("Informe seu peso em kgs:");
        double peso = input.nextDouble();
        System.out.println("Inf orme sua altura em metros:");
        double altura = input.nextDouble();

        if (sexo.equalsIgnoreCase("masculino") || sexo.equalsIgnoreCase("m")) {
            double pesoIdeal = (72.7 * altura) - 58;
            System.out.println("Altura: " + altura +"m");
            System.out.println("Peso: " + peso);
            String pesoIdealH = String.format("%.2f", pesoIdeal);
            System.out.println("PesoIdeal: " + pesoIdealH +"Kgs");
                if (peso > pesoIdeal) {
                    System.out.println("Está acima do peso ideal!");
                } else if (peso < pesoIdeal) {
                    System.out.println("Está abaixo do peso ideal!");
                } else if (peso == pesoIdeal) {
                    System.out.println("Está no peso idedal!");
                }
        }

        if (sexo.equalsIgnoreCase("feminino") || sexo.equalsIgnoreCase("f")) {
            double pesoIdeal = (62.1 * altura) - 44.7;
            System.out.println("Altura: " + altura +"m");
            System.out.println("Peso: " + peso +"Kgs");
            String pesoIdealM = String.format("%.2f", pesoIdeal);
            System.out.println("PesoIdeal: " + pesoIdealM +"Kgs");
                if (peso > pesoIdeal) {
                    System.out.println("Está acima do peso ideal!");
                } else if (peso < pesoIdeal) {
                    System.out.println("Está abaixo do peso ideal!");
                } else if (peso == pesoIdeal) {
                    System.out.println("Está no peso idedal!");
            }
        }

    input.close();
    }
}