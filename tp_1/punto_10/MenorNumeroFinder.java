package tp_1.punto_10;

public class MenorNumeroFinder {

    // Método para encontrar el menor número en un array de enteros
    public static int encontrarMenor(int[] numeros) {
        if (numeros.length == 0) {
            throw new IllegalArgumentException("El array no puede estar vacío.");
        }

        int menor = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }
        return menor;
    }
}
