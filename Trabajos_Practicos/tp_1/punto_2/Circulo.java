package tp_1.punto_2;
//import java.util.Scanner;

public class Circulo {

	public static double diameter(double radio) {
		return radio*2;
	}
	
	public static double circumference(double radio) {
		return  2* Math.PI * radio;
	}
	
	public static double area(double radio) {
		return Math.PI * Math.pow(radio, 2);
	}

}
