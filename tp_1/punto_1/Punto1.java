/**
 * 
 */
package tp_1.punto_1;

import java.util.Scanner;

public class Punto1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        int num1 = input.nextInt(); // Leer el primer numero

        System.out.print("Ingrese el segundo numero: ");
        int num2 = input.nextInt(); // Leer el segundo numero

        // Realizar operaciones
        int suma = num1 + num2;
        int producto = num1 * num2;
        int diferencia = num1 - num2;

        System.out.println("Suma: " + suma);
        System.out.println("Producto: " + producto);
        System.out.println("Diferencia: " + diferencia);

        // Verificar que el divisor no sea 0 antes de dividir
        if (num2 != 0) {
            int cociente = num1 / num2;
            System.out.println("Cociente: " + cociente);
        } else {
            System.out.println("No se puede dividir entre cero.");
        }

        input.close(); // Cerrar el Scanner
    }
}