package Estrututras_de_Seleção_02;

import java.util.Scanner;
import java.text.DecimalFormat;

public class atividade12 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o salário do colaborador em reais:");
        double salario = input.nextDouble();

        double salarioReajuste;
        double valorAumento;
        String porcentagemAumento;

        if (salario <= 280) {
            salarioReajuste = salario + (salario * 0.20);
            valorAumento = salario * 0.20;
            porcentagemAumento = "20%";

        }
        else if (salario <= 700) {
            salarioReajuste = salario + (salario * 0.15);
            valorAumento = salario * 0.15;
            porcentagemAumento = "15%";
        }
        else if (salario <= 1500) {
            salarioReajuste = salario + (salario * 0.10);
            valorAumento = salario * 0.10;
            porcentagemAumento = "10%";
        }
        else {
            salarioReajuste = salario + (salario * 0.05);
            valorAumento = salario* 0.05;
            porcentagemAumento = "5%";
        }

        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("O salário antes do reajuste era: R$ " + df.format(salario));
        System.out.println("O percentual de aumento foi: " + porcentagemAumento);
        System.out.println("O valor do aumento foi: R$ " + df.format(valorAumento));
        System.out.println("O novo salário foi: R$ " + df.format(salarioReajuste));

        input.close();
    }
}
