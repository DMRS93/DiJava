package testes;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Escolha dois numeros");

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		int c = a + b;

		System.out.println(c);
		sc.close();
	}

}
