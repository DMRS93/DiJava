package testes;
import java.util.Scanner;

public class Main {
  static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.print("Input a number: ");
    int firstNumber = scanner.nextInt();

    System.out.print("Input another number: ");
    int secondNumber = scanner.nextInt();

    int multiplication = MathOperations.multiplication(firstNumber,secondNumber);
    int sum = MathOperations.sum(firstNumber, secondNumber);
    int subtraction = MathOperations.subtraction(firstNumber, secondNumber);

    System.out.println(firstNumber + " × " + secondNumber + " = " + multiplication);
    System.out.println(firstNumber + " + " + secondNumber + " = " + sum);
    System.out.println(firstNumber + " - " + secondNumber + " = " + subtraction);

    // 'scanner.close()' should always be the last instruction.
    // Once closed, it cannot be called anymore.
    scanner.close();
  }

}
