package testes;

import java.util.Scanner;

public class Multiplicacao {

    public static void multiplicacao(){
        Scanner scanner = new Scanner(System.in);

        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();

        System.out.println(firstNumber * secondNumber);
    }

}