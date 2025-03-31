package application;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		try {
		System.out.print("Digite graus em celsius: ");
		double celsius = sc.nextDouble();
	
		double fahrenheit;
		
		fahrenheit = celsius * 9 / 5 + 32;
		
		System.out.println("Temperatura em fahrenheit: " + fahrenheit);
		
		}
		catch (InputMismatchException e) {
			System.out.println("Valor inválido: ");
		}


		sc.close();
	}

}
