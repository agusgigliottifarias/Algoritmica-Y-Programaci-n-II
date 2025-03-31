package tp_1;
import java.util.Scanner;

public class TestPunto2 {
	

	public static void main(String[] args) {
	
		Scanner input = new Scanner( System.in );
		
		System.out.print("Ingrese el radio ");
		double radio = input.nextDouble();
		
		System.out.printf("El diametro es %4.2f\n", Punto2.diameter(radio));
		System.out.printf("La circunferencia es %4.2f\n", Punto2.circumference(radio));
		System.out.printf("El area es %4.2f\n", Punto2.area(radio));
		
		input.close();
	}

}
