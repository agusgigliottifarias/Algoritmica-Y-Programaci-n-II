package tp_1.punto_6;
import java.util.Scanner;

public class TestConcatenacion {

	public static void main(String[] args) {
		Scanner input = new Scanner( System.in );
		
		System.out.print("Inngrese su nombre: ");
		String name = input.nextLine();
		System.out.print("Ingrese su apellido: ");
		String surname = input.nextLine();
		
		System.out.println(Concatenacion.imprimirnombre(name,surname));
		
		input.close();
	}

}
