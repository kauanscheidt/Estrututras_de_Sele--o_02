package Estrututras_de_Seleção_02;

import java.util.Scanner;

public class atividade28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o primeiro número:");
        double num1 = input.nextDouble();

        System.out.println("Informe o segundo número:");
        double num2 = input.nextDouble();

        System.out.println("Qual operação você deseja realizar?");
        System.out.println("Soma (+)");
        System.out.println("Subtração (-)");
        System.out.println("Multiplicação (*)");
        System.out.println("Divisão (/)");
        String operacao = input.next();

        double resultado = 0;
        boolean operacaoValida = true;

        switch (operacao) {
            case "+":
                resultado = num1 + num2;
                break;
            case "-":
                resultado = num1 - num2;
                break;
            case "*":
                resultado = num1 * num2;
                break;
            case "/":
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("Erro: Divisão por zero não é permitida.");
                    operacaoValida = false;
                }
                break;
            default:
                System.out.println("Operação inválida.");
                operacaoValida = false;
                break;
        }

        if (operacaoValida) {
            System.out.println("Resultado da operação: " + resultado);

            long resultadoInteiro = (long) resultado;
            if (resultado == resultadoInteiro && resultadoInteiro % 2 == 0) {
                System.out.println("O resultado é par.");
            } else if (resultado == resultadoInteiro && resultadoInteiro % 2 != 0) {
                System.out.println("O resultado é ímpar.");
            } else {
                System.out.println("O resultado não é um número inteiro, então não é par nem ímpar.");
            }

            if (resultado > 0) {
                System.out.println("O resultado é positivo.");
            } else if (resultado < 0) {
                System.out.println("O resultado é negativo.");
            } else {
                System.out.println("O resultado é zero.");
            }

            if (resultado == resultadoInteiro) {
                System.out.println("O resultado é um número inteiro.");
            } else {
                System.out.println("O resultado é um número decimal.");
            }
        }

        input.close();
    }
}
