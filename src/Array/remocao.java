package Array;

import java.util.Scanner;

public class remocao {
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        int[] myArray = new int[10];

        int numeroRemovido = 1;

        int indeceRemovivel = -1;


        for(int i = 0; i < myArray.length; i++){


            System.out.println("Digite seus números: ");
            int numeros = sc.nextInt();

            myArray[i] = numeros;

            try {
                if (myArray[i] == numeroRemovido){
                    indeceRemovivel = i;
                    break;
                }
            } catch (Exception e){
                System.out.println("Não excluiu");
            }





        }


        for (int i: myArray){
            System.out.println(i);
        }

    }


}
