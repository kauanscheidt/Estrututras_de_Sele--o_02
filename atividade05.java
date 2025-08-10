package Estrututras_de_Seleção_02;

import java.util.Scanner;

public class atividade05 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

            System.out.println("Informe uma letra:");
                char l = input.next().charAt(0);
                    if(l == 'a' ||  l == 'e' || l == 'o' || l == 'u' || l == 'A' || l == 'E' || l == 'O' || l == 'U'){
                        System.out.println("Letra: " + l + " é uma vogal.");
                    } else{
                        System.out.println("A letra: " + l +"  não é vogal");
                    }
        input.close();
    }
}