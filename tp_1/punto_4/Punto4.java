/**
 * 
 */
package tp_1.punto_4;

import java.util.Scanner; // Importamos la clase Scanner para leer la entrada del usuario

public class Punto4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Creamos un objeto Scanner

        System.out.print("Ingrese un numero: ");
        int numero = input.nextInt(); // Leer el numero ingresado por el usuario

        // Usamos el operador modulo 
        if (numero % 2 == 0) {
            System.out.println("El numero " + numero + " es par.");
        } else {
            System.out.println("El numero " + numero + " es impar.");
        }

        input.close(); // Cerramos el Scanner 
    }
}