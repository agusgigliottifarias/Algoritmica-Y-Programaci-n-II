package tp_1.punto_8;

import java.util.Scanner;

public class Punto8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int positivos = 0, negativos = 0, ceros = 0;
        
        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            int num = scanner.nextInt();
            
            if (num > 0) {
                positivos++;
            } else if (num < 0) {
                negativos++;
            } else {
                ceros++;
            }
        }
        
        System.out.println("Cantidad de números positivos: " + positivos);
        System.out.println("Cantidad de números negativos: " + negativos);
        System.out.println("Cantidad de ceros: " + ceros);
        
        scanner.close();
    }
}
