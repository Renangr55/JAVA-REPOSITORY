package exercicioGerais;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Validacao_par_impar {

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        int tentativas = 0;


        while (tentativas < 5){
            System.out.println("Digite um número: ");

            try {
                int entradaUsuario = sc.nextInt();

                if (entradaUsuario % 2 == 0){
                    System.out.println("Esse número é par");
                } else {
                    System.out.println("Esse número impar ");
                } continue;
            } catch (InputMismatchException e) {
                System.out.println("Erro: tipo de dados que foi inserida pelo usuario - Digite um número inteiro");
                break;
            } finally {
                System.out.println("programa finalizado");

            }
        }
    }
}
