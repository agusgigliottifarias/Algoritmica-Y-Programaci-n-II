package tp_1;

import java.util.Scanner;

public class TestPunto1 {

	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Ingrese el primer núrmero: ");
		int numer1 = input.nextInt();
		System.out.print("Ingrese el segundo núrmero:");
		int numer2 = input.nextInt();
		
		System.out.printf("\nLa suma es %d\n", Punto1.sumarNumeros(numer1, numer2));
		System.out.printf("El producto es %d\n", Punto1.productoNumeros(numer1, numer2));
		System.out.printf("La resta es %d\n", Punto1.restaNumeros(numer1, numer2));
		System.out.printf("La división es %4.2f\n", Punto1.dividirNumeros(numer1, numer2));
		
		input.close();
	}
}
