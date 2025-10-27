// Fuente: chatGPT
// Se corrigieron los métodos dequeue() y getFront() sin usar if/else.
// Se implementó getCodons() correctamente.

import java.util.*;

public class TheQueue<T> implements TheQueueInterface<T> {

    private Deque<T> cola;

    public TheQueue() {
        cola = new ArrayDeque<>();
    }

    @Override
    public void enqueue(T item) {
        cola.addLast(item);
    }

    @Override
    public T dequeue() {
        return cola.pollFirst(); // retorna null si está vacía
    }

    @Override
    public T getFront() {
        return cola.peekFirst(); // retorna null si está vacía
    }

    @Override
    public boolean isEmpty() {
        return cola.isEmpty();
    }

    @Override
    public int getSize() {
        return cola.size();
    }

    @Override
    public String[] getCodons() {
        int grupos = cola.size() / 3;
        String[] codones = new String[grupos];
        for (int i = 0; i < grupos; i++) {
            String a = String.valueOf(cola.pollFirst());
            String b = String.valueOf(cola.pollFirst());
            String c = String.valueOf(cola.pollFirst());
            codones[i] = a + b + c;
        }
        return codones;
    }

    @Override
    public String print() {
        return cola.toString();
    }

    public static void main(String[] args) {
        int cantidad = Integer.parseInt(args[0]);
        String[] nucleotidos = {"A", "C", "G", "T"};
        Random random = new Random();

        TheQueueInterface<String> queue = new TheQueue<>();

        for (int i = 0; i < cantidad; i++) {
            queue.enqueue(nucleotidos[random.nextInt(4)]);
        }

        System.out.println("Filled {full}");
        System.out.println(" ↳ print() → " + queue.print());
        System.out.println("   ↳ getFront() → " + queue.getFront());
        System.out.println("   ↳ getSize() → " + queue.getSize());
        System.out.println("   ↳ isEmpty() → " + queue.isEmpty());

        System.out.println("\ngetCodons() → " + Arrays.toString(queue.getCodons()));

        System.out.println("\nEnd {empty}");
        System.out.println(" ↳ print() → " + queue.print());
        System.out.println("   ↳ getFront() → " + queue.getFront());
        System.out.println("   ↳ getSize() → " + queue.getSize());
        System.out.println("   ↳ isEmpty() → " + queue.isEmpty());
    }
}
