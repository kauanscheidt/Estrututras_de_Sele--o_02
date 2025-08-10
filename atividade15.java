package Estrututras_de_Seleção_02;

import java.util.Scanner;
import java.text.DecimalFormat;

public class atividade15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("Informe o preço de custo do produto (em R$):");
        double precoCusto = input.nextDouble();

        System.out.println("Informe o código de origem:");
        System.out.println("1 - Sul");
        System.out.println("2 - Norte");
        System.out.println("3 - Leste");
        System.out.println("4 - Oeste");
        System.out.println("5 ou 6 - Nordeste");
        System.out.println("7 ou 8 - Centro-Oeste");
        int codigoOrigem = input.nextInt();

        String procedencia;

        switch (codigoOrigem) {
            case 1:
                procedencia = "Sul";
                break;
            case 2:
                procedencia = "Norte";
                break;
            case 3:
                procedencia = "Leste";
                break;
            case 4:
                procedencia = "Oeste";
                break;
            case 5:
            case 6:
                procedencia = "Nordeste";
                break;
            case 7:
            case 8:
                procedencia = "Centro-Oeste";
                break;
            default:
                procedencia = "Importado";
                break;
        }

        System.out.println("Preço de Custo: R$ " + df.format(precoCusto));
        System.out.println("Procedência: " + procedencia);

        input.close();
    }
}
