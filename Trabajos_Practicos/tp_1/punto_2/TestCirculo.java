package tp_1.punto_2;
import java.util.Scanner;

public class TestCirculo {

	public static void main(String[] args) {
	
		Scanner input = new Scanner( System.in );
		
		System.out.print("Ingrese el radio ");
		double radio = input.nextDouble();
		
		System.out.printf("El diametro es %4.2f\n", Circulo.diameter(radio));
		System.out.printf("La circunferencia es %4.2f\n", Circulo.circumference(radio));
		System.out.printf("El area es %4.2f\n", Circulo.area(radio));
		
		input.close();
	}

}