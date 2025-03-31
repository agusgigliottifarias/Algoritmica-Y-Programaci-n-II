package tp_1.punto_12;

import java.util.ArrayList;

public class Punto12Fede {
    public static void main(String[] args) {
        int[] numbers = {3, 7, 12, 25, 19, 8, 14, 7, 22, 5, 11, 24, 17, 2, 20, 6, 10, 13, 9, 7};
        ArrayList<Integer> noduplicados = new ArrayList<>();

        for (int num : numbers) {
            if (!noduplicados.contains(num)) { // Si no está en la lista, lo agregamos
                noduplicados.add(num);
            }
        }

        System.out.println("Números sin duplicados:");
        for (int num : noduplicados) {
            System.out.println(num);
        }
    }
}