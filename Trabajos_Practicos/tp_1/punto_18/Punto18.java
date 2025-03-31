package tp_1.punto_18;

import java.util.Scanner;

//Clase que contiene los métodos de conversión de temperatura
class TemperatureConverter {
 // Método para convertir Celsius a Fahrenheit
 public static double centToFahr(double celsius) {
     return (9.0 / 5.0) * celsius + 32;
 }

 // Método para convertir Fahrenheit a Celsius
 public static double fahrToCent(double fahrenheit) {
     return (5.0 / 9.0) * (fahrenheit - 32);
 }
}

//Clase que prueba los métodos de conversión
public class Punto18 {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     
     System.out.print("Ingrese la temperatura en grados centígrados: ");
     if (scanner.hasNextDouble()) {
         double celsius = scanner.nextDouble();
         double fahrenheit = TemperatureConverter.centToFahr(celsius);
         System.out.printf("%.2f°C equivale a %.2f°F\n", celsius, fahrenheit);
     } else {
         System.out.println("Por favor, ingrese un número válido.");
         scanner.next(); 
     }
     
     System.out.print("Ingrese la temperatura en grados Fahrenheit: ");
     if (scanner.hasNextDouble()) {
         double fahrenheit = scanner.nextDouble();
         double celsius = TemperatureConverter.fahrToCent(fahrenheit);
         System.out.printf("%.2f°F equivale a %.2f°C\n", fahrenheit, celsius);
     } else {
         System.out.println("Por favor, ingrese un número válido.");
     }
     
     scanner.close();
 }
}
