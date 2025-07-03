package Casting;

import java.util.Scanner;

public class introducao_casting {

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        int primeiroNumero = sc.nextInt();

        System.out.println("Digite o segundo numero: ");
        int segundoNumero = sc.nextInt();

        System.out.println("Digite o terceiro numero: ");
        int terceiroNumero = sc.nextInt();

        System.out.println("Digite o quarto numero: ");
        int quartoNumero = sc.nextInt();

        System.out.println("Digite o quinto numero: ");
        int quintoNumero = sc.nextInt();

        float conversao = (float) primeiroNumero;

        float segundaConversao = (float) segundoNumero;

        float terceiraConversao = (float) terceiroNumero;

        float quartaConversao = (float) quartoNumero;

        float quintaConversao = (float) quintoNumero;

        float media = (conversao + segundaConversao + terceiraConversao + quartaConversao + quintaConversao) / 5;
        System.out.printf("media");







    }
}
