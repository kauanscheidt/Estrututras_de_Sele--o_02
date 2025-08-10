package Estrututras_de_Seleção_02;

import java.util.Scanner;
import java.text.DecimalFormat;

public class atividade32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");


        final double PRECO_FILE_DUPLO_ATE_5 = 4.90;
        final double PRECO_FILE_DUPLO_ACIMA_5 = 5.80;
        final double PRECO_ALCATRA_ATE_5 = 5.90;
        final double PRECO_ALCATRA_ACIMA_5 = 6.80;
        final double PRECO_PICANHA_ATE_5 = 6.90;
        final double PRECO_PICANHA_ACIMA_5 = 7.80;

        System.out.println("Qual carne você deseja comprar?");
        System.out.println("1 - Filé Duplo");
        System.out.println("2 - Alcatra");
        System.out.println("3 - Picanha");
        System.out.print("Digite o número correspondente à carne: ");
        int tipoCarne = input.nextInt();
        String nomeCarne = "";

        System.out.print("Informe a quantidade em Kg: ");
        double quantidade = input.nextDouble();

        System.out.print("Pagamento com Cartão Tabajara? (sim/nao): ");
        String usaCartaoTabajara = input.next();

        double precoBruto = 0;
        double precoPorKgAtual = 0;

        if (tipoCarne == 1) {
            nomeCarne = "Filé Duplo";
            if (quantidade <= 5) {
                precoPorKgAtual = PRECO_FILE_DUPLO_ATE_5;
            } else {
                precoPorKgAtual = PRECO_FILE_DUPLO_ACIMA_5;
            }
            precoBruto = quantidade * precoPorKgAtual;
        } else if (tipoCarne == 2) {
            nomeCarne = "Alcatra";
            if (quantidade <= 5) {
                precoPorKgAtual = PRECO_ALCATRA_ATE_5;
            } else {
                precoPorKgAtual = PRECO_ALCATRA_ACIMA_5;
            }
            precoBruto = quantidade * precoPorKgAtual;
        } else if (tipoCarne == 3) {
            nomeCarne = "Picanha";
            if (quantidade <= 5) {
                precoPorKgAtual = PRECO_PICANHA_ATE_5;
            } else {
                precoPorKgAtual = PRECO_PICANHA_ACIMA_5;
            }
            precoBruto = quantidade * precoPorKgAtual;
        } else {
            System.out.println("Tipo de carne inválido. Por favor, reinicie o programa e escolha uma opção válida.");
            input.close();
            return;
        }

        double desconto = 0;
        String tipoPagamento = "Dinheiro ou Cartão Comum";

        if (usaCartaoTabajara.equalsIgnoreCase("sim")) {
            desconto = precoBruto * 0.05;
            tipoPagamento = "Cartão Tabajara";
        }

        double valorFinal = precoBruto - desconto;

        System.out.println("Tipo da Carne: " + nomeCarne);
        System.out.println("Quantidade: " + df.format(quantidade) + " Kg");
        System.out.println("Preço por Kg: R$ " + df.format(precoPorKgAtual));
        System.out.println("Preço Total (Bruto): R$ " + df.format(precoBruto));
        System.out.println("Tipo de Pagamento: " + tipoPagamento);
        System.out.println("Valor do Desconto: R$ " + df.format(desconto));
        System.out.println("Valor a Pagar: R$ " + df.format(valorFinal));


        input.close();
    }
}
