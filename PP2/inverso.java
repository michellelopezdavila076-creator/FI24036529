package PP2;
/**
 * Universidad Fidélitas
 * Curso: Introducción a la Programación
 * Práctica Programada 2 - Inverso
 *
 * Estudiante: Michell López Dávila
 * Carné: FI24036529
 *
 * Descripción:
 * Programa que invierte un número natural utilizando
 * recursividad y operaciones aritméticas (cociente y residuo).
 *
 * Ejemplo:
 * $ java Inverso 123
 * 123 → 321
 */
public class inverso {
    // Método principal
    public static void main(String[] args) {
        // Validar que se haya pasado un argumento
        if (args.length != 1) {
            System.out.println("Uso correcto: java Inverso <numero_natural>");
            return;
        }

        // Convertir el argumento a número entero
        int numero = Integer.parseInt(args[0]);

        // Calcular el inverso usando el método recursivo
        int inverso = invertir(numero, 0);

        // Mostrar los resultados en consola
        System.out.println(numero + " → " + inverso);
    }

    /**
     * Método recursivo que invierte un número natural.
     *
     * @param n   número original
     * @param inv acumulador del número invertido
     * @return número invertido
     */
    public static int invertir(int n, int inv) {
        // Caso base: si el número llega a 0, devolver el resultado acumulado
        if (n == 0) {
            return inv;
        }

        // Calcular residuo y cociente
        int residuo = n % 10;  // último dígito
        int cociente = n / 10; // eliminar último dígito

        // Llamada recursiva acumulando el residuo
        return invertir(cociente, inv * 10 + residuo);
    }
}

