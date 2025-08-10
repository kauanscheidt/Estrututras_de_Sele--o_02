package Estrututras_de_Seleção_02;

import java.util.Scanner;
import java.text.DecimalFormat;

public class atividade31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        final double PRECO_MORANGO_ATE_5KG = 2.50;
        final double PRECO_MORANGO_ACIMA_5KG = 2.20;
        final double PRECO_MACA_ATE_5KG = 1.80;
        final double PRECO_MACA_ACIMA_5KG = 1.50;

        System.out.println("Informe a quantidade de morangos (em Kg):");
        double kgMorango = input.nextDouble();

        System.out.println("Informe a quantidade de maçãs (em Kg):");
        double kgMaca = input.nextDouble();

        double subtotalMorango, subtotalMaca;

        if (kgMorango <= 5) {
            subtotalMorango = kgMorango * PRECO_MORANGO_ATE_5KG;
        } else {
            subtotalMorango = kgMorango * PRECO_MORANGO_ACIMA_5KG;
        }

        if (kgMaca <= 5) {
            subtotalMaca = kgMaca * PRECO_MACA_ATE_5KG;
        } else {
            subtotalMaca = kgMaca * PRECO_MACA_ACIMA_5KG;
        }

        double valorBruto = subtotalMorango + subtotalMaca;
        double totalKg = kgMorango + kgMaca;

        double valorFinal = valorBruto;
        double desconto = 0;

        if (totalKg > 8 || valorBruto > 25.0) {
            desconto = valorBruto * 0.10;
            valorFinal = valorBruto - desconto;
        }

        System.out.println("Quantidade de Morangos: " + df.format(kgMorango) + " Kg");
        System.out.println("Quantidade de Maçãs: " + df.format(kgMaca) + " Kg");
        System.out.println("Valor total (Bruto): R$ " + df.format(valorBruto));
        System.out.println("Desconto: R$ " + df.format(desconto));
        System.out.println("Valor total a ser pago: R$ " + df.format(valorFinal));

        input.close();
    }
}