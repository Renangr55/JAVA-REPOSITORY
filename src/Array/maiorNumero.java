package Array;

public class maiorNumero {

    public static void main (String [] args){
        int [] valores = {1,2,3,4,5,6,7,8,9,10};

        int maior = valores[0];
        int menor = valores[0];

        for (int i = 0; i < valores.length; i++){
            if (valores[i] > maior){
                maior = valores[i];
            }

            if (valores[i] < menor){
                menor = valores[i];
            }
        }

        System.out.println("maior número: " + maior);
        System.out.println("Menor número: " + menor);
    }
}
