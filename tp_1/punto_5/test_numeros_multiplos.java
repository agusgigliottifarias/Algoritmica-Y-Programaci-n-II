package tp_1.punto_5;
import java.util.Scanner;

public class test_numeros_multiplos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        int num1 = input.nextInt(); 

        System.out.print("Ingrese el segundo numero: ");
        int num2 = input.nextInt(); 

        // Llamamos al método desde la otra clase
        if (numeros_multiplo.esMultiplo(num1, num2)) {
            System.out.println("Los numeros son multiplos");
        } else {
            System.out.println("Los numeros no son multiplos");
        }

        input.close();
    }
}
