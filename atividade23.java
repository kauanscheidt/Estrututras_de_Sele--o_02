package Estrututras_de_Seleção_02;

import java.util.Scanner;
import java.text.DecimalFormat;

public class atividade23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0");

        System.out.println("Informe a idade do primeiro aluno:");
        int idade1 = input.nextInt();

        System.out.println("Informe a idade do segundo aluno:");
        int idade2 = input.nextInt();

        System.out.println("Informe a idade do terceiro aluno:");
        int idade3 = input.nextInt();

        double mediaIdade = (double) (idade1 + idade2 + idade3) / 3.0;

        if (mediaIdade < 25) {
            System.out.println("Média de idade: " + df.format(mediaIdade) + " - Turma Jovem");
        } else if (mediaIdade >= 25 && mediaIdade <= 40) {
            System.out.println("Média de idade: " + df.format(mediaIdade) + " - Turma Adulta");
        } else {
            System.out.println("Média de idade: " + df.format(mediaIdade) + " - Turma Idosa");
        }

        input.close();
    }
}