package Array;

import java.util.Scanner;

public class media {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Seja bem vindo ao Mood Map");
        System.out.println();
        System.out.println("Crie sua sala em forma de matrizes");

        System.out.println("Digite a quantidade de linhas: ");
        int linhas = sc.nextInt();

        System.out.println("Digite a quantidade de clunas ");
        int colunas = sc.nextInt();

        sc.nextLine();

        String [][] numeros = new String[linhas][colunas];

        for (int i = 0; i < linhas;i++){
            for (int j = 0; j < colunas; j++){
                System.out.println("Digite os elementos da matriz: ");
                numeros[i][j] = sc.nextLine();

                if (numeros[i][j] == ""){
                    numeros[i][j] = "*";
                }

            }

        }

        for (int i = 0; i < numeros.length; i++){
            for (int j = 0; j < numeros[i].length; j++){
                System.out.print("Conteudo: " + numeros[i][j] + " [ " + i + " ] " + " [ " + j + " ] "  );

            }
            System.out.println();
        }



    }
}
