// Fuente: documentación Java y material del curso
// Se corrigió la función recursiva y se implementó una versión iterativa diferente.

public class Numbers {

    private static final int N = 25;

    public static double formula(double z) {
        double result = (z + Math.sqrt(4 + z * z)) / 2;
        return redondear(result);
    }

    public static double recursive(double z) {
        double num = calcularRecursivo(z, N);
        double den = calcularRecursivo(z, N - 1);
        return redondear(num / den);
    }

    private static double calcularRecursivo(double z, double n) {
        if (n == 0 || n == 1)
            return 1;
        return z * calcularRecursivo(z, n - 1) + calcularRecursivo(z, n - 2);
    }

    public static double iterative(double z) {
        double a = 1, b = 1, temp;
        for (int i = 2; i <= N; i++) {
            temp = z * b + a;
            a = b;
            b = temp;
        }
        return redondear(b / a);
    }

    private static double redondear(double valor) {
        double r = 10000000000.0;
        return Math.round(valor * r) / r;
    }

    public static void main(String[] args) {
        String[] metales = {"Platinum", "Golden", "Silver", "Bronze", "Copper", "Nickel", "Aluminum", "Iron", "Tin", "Lead"};

        for (int i = 0; i < metales.length; i++) {
            System.out.println("\n[" + i + "] " + metales[i]);
            System.out.println(" ↳ formula(" + i + ")   ≈ " + formula(i));
            System.out.println(" ↳ recursive(" + i + ") ≈ " + recursive(i));
            System.out.println(" ↳ iterative(" + i + ") ≈ " + iterative(i));
        }
    }
}
