package testes;

import java.util.Scanner;

public class Main {
  static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    int firstNumber = requestNumberInput();
    int secondNumber = requestNumberInput();

    int multiplication = MathOperations.multiplication(firstNumber, secondNumber);
    int sum = MathOperations.sum(firstNumber, secondNumber);
    int subtraction = MathOperations.subtraction(firstNumber, secondNumber);

    printOperationResult(firstNumber, secondNumber, " × ", multiplication);
    printOperationResult(firstNumber, secondNumber, " + ", sum);
    printOperationResult(firstNumber, secondNumber, " - ", subtraction);

    // 'scanner.close()' should always be the last instruction.
    // Once closed, it cannot be called anymore.
    scanner.close();
  }

  public static int requestNumberInput() {
    System.out.print("Input a number: ");
    return scanner.nextInt();
  }

  public static void printOperationResult(int firstNumber, int secondNumber, String operator, int result) {
    System.out.println(firstNumber + " " + operator + " " + secondNumber + " = " + result);
  }

}
