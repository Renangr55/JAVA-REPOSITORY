package Array;
import java.util.Scanner;

public class inverterArray {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);



        int[] array = new int [6];
        int tamanhoOriginal = array.length;


        int[] vetorCopia = new int[tamanhoOriginal];

        for (int i = 0; i < array.length; i++){
            System.out.println("Digite os numeros: ");
            int numeros = sc.nextInt();

            array[i] = numeros;





        }
        // invertendo a array
        for (int i = 0; i < tamanhoOriginal; i++){
            vetorCopia[i] = array[tamanhoOriginal -1 - i]; // invertendo a array com menos 1 pq vai ficar 0,1,2,3,4,5 - 1 e vai inverter depois
            System.out.println("Vetor invertido: " + vetorCopia[i]);

        }


        // imprimindo a array original
        for (int i: array){
            System.out.println("valor certo: " + i);
        }





    }
}
