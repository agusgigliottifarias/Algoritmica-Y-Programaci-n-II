package tp_1.punto_9;

import java.util.Scanner;

public class Punto9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int mayor, menor, numero;

        // Pedimos el primer número fuera del bucle para inicializar "mayor" y "menor"
        System.out.print("Ingrese un número: ");
        numero = scanner.nextInt();
        mayor = menor = numero; // Inicializamos ambos con el primer número

        // Pedimos los otros 9 números
        for (int i = 1; i < 10; i++) { 
            System.out.print("Ingrese otro número: ");
            numero = scanner.nextInt();

            // Comparamos para encontrar el mayor y el menor
            if (numero > mayor) {
                mayor = numero;
            }
            if (numero < menor) {
                menor = numero;
            }
        }

        // Mostramos los resultados
        System.out.println("El número más grande es: " + mayor);
        System.out.println("El número más pequeño es: " + menor);

        scanner.close();
    }
}
