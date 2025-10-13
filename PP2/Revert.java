package PP2;

import java.io.*;
import java.util.Stack;

public class Revert {

    public static void main(String[] args) {
        // Se crea una pila de tipo Character
        Stack<Character> pila = new Stack<>();

        // Nombres de los archivos
        String archivoEntrada = "input.txt";
        String archivoSalida = "output.txt";

        try {
            // 1 Lectura del archivo input.txt
            FileReader lector = new FileReader(archivoEntrada);
            int caracter;

            // Leer carácter por carácter y almacenarlo en la pila
            while ((caracter = lector.read()) != -1) {
                pila.push((char) caracter);
            }
            lector.close();

            // 2 Escritura en output.txt en orden inverso
            FileWriter escritor = new FileWriter(archivoSalida);

            while (!pila.isEmpty()) {
                escritor.write(pila.pop());
            }

            escritor.close();

            System.out.println(" El archivo se ha invertido correctamente.");
            System.out.println("Archivo de salida generado: " + archivoSalida);

        } catch (IOException e) {
            System.out.println(" Error al procesar los archivos: " + e.getMessage());
        }
    }
}