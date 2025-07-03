package Array;

public class somaNumeros {

    public static void main(String[] args){

        int [] array = {1,2,3,4,5};
        int soma = 0;

        for (int i = 0; i < array.length; i++){
            soma+=i;
        }

        System.out.println(soma);
    }
}
