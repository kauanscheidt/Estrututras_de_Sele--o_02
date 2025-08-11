package Estrututras_de_Seleção_02;

import java.util.Scanner;
import java.text.DecimalFormat;

public class atividade30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        final double PRECO_ALCOOL = 1.90;
        final double PRECO_GASOLINA = 2.50;

        System.out.println("Informe o tipo de combustível (A-álcool, G-gasolina):");
        String tipoCombustivel = input.next();

        System.out.println("Informe o número de litros vendidos:");
        double litros = input.nextDouble();

        double valorTotal;

        if (tipoCombustivel.equalsIgnoreCase("a")) {
            double precoBruto = litros * PRECO_ALCOOL;
            double desconto;

            if (litros <= 20) {
                desconto = precoBruto * 0.03;
            } else {
                desconto = precoBruto * 0.05;
            }
            valorTotal = precoBruto - desconto;

            System.out.println("Combustível: Álcool");
            System.out.println("Litros: " + litros);
            System.out.println("Desconto aplicado: " + df.format(desconto));
            System.out.println("Valor total a ser pago: R$ " + df.format(valorTotal));

        } else if (tipoCombustivel.equalsIgnoreCase("g")) {
            double precoBruto = litros * PRECO_GASOLINA;
            double desconto;

            if (litros <= 20) {
                desconto = precoBruto * 0.04;
            } else {
                desconto = precoBruto * 0.06;
            }
            valorTotal = precoBruto - desconto;

            System.out.println("Combustível: Gasolina");
            System.out.println("Litros: " + litros);
            System.out.println("Desconto aplicado: " + df.format(desconto));
            System.out.println("Valor total a ser pago: R$ " + df.format(valorTotal));

        } else {
            System.out.println("Tipo de combustível inválido.");
        }

        input.close();
    }
}
