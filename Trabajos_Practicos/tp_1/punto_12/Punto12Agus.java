package tp_1.punto_12;

public class Punto12Agus {

	public static void main(String[] args) {
		
		int[] numbers = {3, 7, 12, 25, 19, 8, 14, 7, 22, 5, 11, 24, 17, 2, 20, 6, 10, 13, 9, 7};
		int[] noduplicados = new int[20];
		
		for (int i = 0; i < numbers.length; i++) {
            for(int j = 0; j < noduplicados.length;j++){
            	if (numbers[i] != numbers [j]) {
            	    noduplicados[i] = numbers[i];
            	}else {
            		noduplicados [i] = 0;
            		
            	}

            }
		}    
		System.out.println("Números sin duplicados:");
        for (int i = 0; i < noduplicados.length; i++) {
            System.out.println(noduplicados[i]);
        }
    }

}