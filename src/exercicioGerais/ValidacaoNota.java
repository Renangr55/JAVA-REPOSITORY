package exercicioGerais;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ValidacaoNota {
    public static void main( String[] args){
        Scanner sc = new Scanner(System.in);


        int tentativas = 0;

        while (tentativas < 5){

            try {
                System.out.println("Digite uma nota entre 0 e 10: ");
                int nota = sc.nextInt();

                if (nota > 10 || nota < 0){
                    System.out.println("Por favor insira uma nota de 0 a 10");
                    break;
                }


            } catch (InputMismatchException e){
                throw new InputMismatchException("Erro de entrada");
            }



        }


    }
}
