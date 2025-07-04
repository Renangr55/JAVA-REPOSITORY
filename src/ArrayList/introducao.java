package ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.InputMismatchException;
import java.util.Scanner;

public class introducao {

    public static void main( String[] args){
        Scanner sc = new Scanner(System.in);

        ArrayList<String> cars = new ArrayList<String>();


        int i = 1;

        do {
            System.out.println("Digite os nomes do carros: ");

            try {
                String carrosUsers = sc.nextLine();
                cars.add(carrosUsers);
            } catch (InputMismatchException e){
                throw new InputMismatchException("Erro: Tipo de entrada do usuario está incorreta: ");
            }



            System.out.println("Deseja continuar");
            String opcao = sc.nextLine().toUpperCase();

            if (opcao.equals("S")){
                System.out.println("Continuando....");
                continue;
            } else if (opcao.equals("N")) {
                System.out.println("Encerrando....");
                i--;
                break;
            } else {
                System.out.println("Ocorreu um erro com a entrada de dados");
            }
        } while (i != 0);
        System.out.println("Finalizado>>>>>>>");

        for (String idx : cars){
            System.out.println("Carros: " + idx);
        }

    }
}
