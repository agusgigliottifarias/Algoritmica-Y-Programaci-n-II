package tp_1.punto_10;

import java.util.Random;
import java.util.Scanner;

public class test_MenorNumeroFinder {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Ingrese la cantidad de números aleatorios a generar: ");
        int cantidad = input.nextInt();

        if (cantidad <= 0) {
            System.out.println("Debe ingresar al menos un número.");
            input.close();
            return;
        }

        int[] numeros = new int[cantidad];

        System.out.println("Números generados:");
        for (int i = 0; i < cantidad; i++) {
            numeros[i] = random.nextInt(100); // Números aleatorios entre 0 y 99
            System.out.print(numeros[i] + " ");
        }
        System.out.println(); // Salto de línea

        // Llamamos al método de la otra clase para encontrar el menor número
        int menor = MenorNumeroFinder.encontrarMenor(numeros);
        System.out.println("El menor número generado es: " + menor);

        input.close();
    }
}