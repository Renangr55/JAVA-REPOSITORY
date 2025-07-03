package Array;

import java.util.Scanner;

public class pares {
    public static void main(String[] args){
        {
            int a = 90;
        }

        Scanner sc = new Scanner(System.in);

        int[] paresImpares = new int [8];

        for (int i = 0; i < paresImpares.length; i++){
            System.out.println("Digite os numeros: ");
            int numeros = sc.nextInt();

            paresImpares[i] = numeros;

            if (paresImpares[i] % 2 == 0){
                System.out.println(paresImpares[i] % 2 == 0);
            }

        }


    }
}
