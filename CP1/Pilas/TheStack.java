// Fuente: ejemplos del curso y chatGPT
// Se corrigió el método push() y se mejoraron pop() y peek().

import java.util.Stack;
import java.util.Random;

public class TheStack<T> implements TheStackInterface<T> {

    private Stack<T> pila;
    private int capacidad;

    public TheStack(int capacidad) {
        this.capacidad = capacidad;
        this.pila = new Stack<>();
    }

    @Override
    public Boolean push(T item) {
        if (pila.size() < capacidad) {
            pila.push(item);
            return true;
        }
        return false;
    }

    @Override
    public T pop() {
        return pila.isEmpty() ? null : pila.pop();
    }

    @Override
    public T peek() {
        return pila.isEmpty() ? null : pila.peek();
    }

    @Override
    public Boolean empty() {
        return pila.isEmpty();
    }

    @Override
    public Integer size() {
        return pila.size();
    }

    @Override
    public String print() {
        return pila.toString();
    }

    public static void main(String[] args) {
        int capacidad = Integer.parseInt(args[0]);
        TheStackInterface<Double> stack = new TheStack<>(capacidad);
        Random random = new Random();

        System.out.println("Pushing {capacity + 1}");
        for (int i = 0; i <= capacidad; i++) {
            double num = random.nextDouble();
            System.out.println(" ↳ push(" + num + ") → " + stack.push(num));
        }

        System.out.println("\nPushed {full}");
        System.out.println(" ↳ print() → " + stack.print());
        System.out.println("   ↳ peek() → " + stack.peek());
        System.out.println("   ↳ size() → " + stack.size());
        System.out.println("   ↳ empty() → " + stack.empty());

        System.out.println("\nPopping {capacity + 1}");
        for (int i = 0; i <= capacidad; i++) {
            System.out.println(" ↳ pop() → " + stack.pop());
        }

        System.out.println("\nPopped {empty}");
        System.out.println(" ↳ print() → " + stack.print());
        System.out.println("   ↳ peek() → " + stack.peek());
        System.out.println("   ↳ size() → " + stack.size());
        System.out.println("   ↳ empty() → " + stack.empty());
    }
}
