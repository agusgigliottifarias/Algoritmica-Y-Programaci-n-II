package tp_1.punto_20;

import java.util.Random;
import java.util.Scanner;

class NumberGuessingGame {
    public static int generateRandomNumber() {
        Random random = new Random();
        return random.nextInt(1000) + 1;
    }

    public static String checkGuess(int guess, int target) {
        if (guess > target) {
            return "Demasiado alto";
        } else if (guess < target) {
            return "Demasiado bajo";
        } else {
            return "correcto";
        }
    }
}

public class Punto20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean jugarDeNuevo;
        
        do {
            int numeroSecreto = NumberGuessingGame.generateRandomNumber();
            int intentos = 0;
            int numeroIngresado;
            
            System.out.println("¡Bienvenido al juego de adivinanza! Adivina un número entre 1 y 1000.");
            
            do {
                System.out.print("Ingresa un número: ");
                while (!scanner.hasNextInt()) {
                    System.out.println("Por favor, ingrese un número válido.");
                    scanner.next();
                }
                
                numeroIngresado = scanner.nextInt();
                intentos++;
                
                String resultado = NumberGuessingGame.checkGuess(numeroIngresado, numeroSecreto);
                
                if (resultado.equals("correcto")) {
                    System.out.printf("¡Adivinaste en %d intentos!\n", intentos);
                } else {
                    System.out.println(resultado);
                }
            } while (numeroIngresado != numeroSecreto);
            
            System.out.print("¿Quieres jugar de nuevo? (s/n): ");
            jugarDeNuevo = scanner.next().equalsIgnoreCase("s");
            
        } while (jugarDeNuevo);
        
        System.out.println("¡Gracias por jugar!");
        scanner.close();
    }
}
