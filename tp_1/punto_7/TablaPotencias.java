package tp_1.punto_7;

public class TablaPotencias {

    // Método estático para imprimir la tabla
    public static void imprimirTabla() {
        System.out.println("Número | Cuadrado | Cubo");
        System.out.println("------------------------");
        for (int i = 0; i <= 10; i++) {
            int cuadrado = i * i;
            int cubo = i * i * i;
            System.out.printf("%6d | %8d | %4d%n", i, cuadrado, cubo);
        }
    }
}
