package tp_1.punto_11;

	import java.util.Scanner;

	public class Punto11 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int[] numeros = new int[5];

	        for (int i = 0; i < 5; i++) {
	            while (true) {
	                System.out.print("Ingresa el número " + (i + 1) + " (entre 1 y 30): ");
	                int num = scanner.nextInt();
	                if (num >= 1 && num <= 30) {
	                    numeros[i] = num;
	                    break;
	                } else {
	                    System.out.println("El número debe estar entre 1 y 30. Intenta de nuevo.");
	                }
	            }
	        }

	        System.out.println("\nHistograma:");
	        for (int num : numeros) {
	            for (int j = 0; j < num; j++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }

	        scanner.close();
	    }
	}