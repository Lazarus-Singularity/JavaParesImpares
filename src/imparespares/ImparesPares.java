package imparespares;

import java.util.Scanner;

public class ImparesPares {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int numero;
		int Pares = 0;
		int Impares = 0;

		System.out.println("Favor de ingresar un numero positivo. Selecciona 0 para detener el programa");
		numero = scan.nextInt();

		while (numero != 0) {
			if (numero % 2 == 0) 
				Pares = Pares + 1;
			 else 
				Impares = Impares + 1;
			

			System.out.println("Favor de ingresar un numero positivo. Selecciona 0 para detener el programa");
			numero = scan.nextInt();

		}

		System.out.println("Cantidad de numeros pares: " + Pares);
		System.out.println("Cantidad de numeros impares: " + Impares);

	}

}
