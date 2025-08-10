package Estrututras_de_Seleção_02;

import java.util.Scanner;
import java.text.DecimalFormat;

public class atividade13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("Informe o valor da sua hora em reais:");
        double valorHora = input.nextDouble();

        System.out.println("Informe a quantidade de horas trabalhadas no mês:");
        int horasTrabalhadas = input.nextInt();

        double salarioBruto = valorHora * horasTrabalhadas;

        double ir = 0;
        String percentualIr = "Isento";


        if (salarioBruto <= 900.00) {
            ir = 0;
            percentualIr = "Isento";
        } else if (salarioBruto <= 1500.00) {
            ir = salarioBruto * 0.05;
            percentualIr = "5%";
        } else if (salarioBruto <= 2500.00) {
            ir = salarioBruto * 0.10;
            percentualIr = "10%";
        } else {
            ir = salarioBruto * 0.20;
            percentualIr = "20%";
        }

        double sindicato = salarioBruto * 0.03;

        double fgts = salarioBruto * 0.11;

        double totalDescontos = ir + sindicato;

        double salarioLiquido = salarioBruto - totalDescontos;

        System.out.println("Salário Bruto: R$ " + df.format(salarioBruto));
        System.out.println("(-) IR (" + percentualIr + "): R$ " + df.format(ir));
        System.out.println("(-) Sindicato (3%): R$ " + df.format(sindicato));
        System.out.println("FGTS (11%): R$ " + df.format(fgts));
        System.out.println("Total de Descontos: R$ " + df.format(totalDescontos));
        System.out.println("Salário Líquido: R$ " + df.format(salarioLiquido));

        input.close();
    }
}