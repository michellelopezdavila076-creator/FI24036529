import java.util.ArrayDeque;
import java.util.Random;

public class ListDoublyCircular<T> implements ListInterface<T> {

    private NodeDoubly<T> head = null; // Primer nodo (inicio)
    private NodeDoubly<T> tail = null; // Último nodo (final)

    public ListDoublyCircular() {
        head = null;
        tail = null;
    }

    
    // MÉTODO: addFirst()
    // Agrega un nuevo nodo al inicio de la lista.
    
    public void addFirst(T value) {
        NodeDoubly<T> newNode = new NodeDoubly<>(value); // Crear nuevo nodo con el valor recibido

        if (head == null) {
            // Caso 1: la lista está vacía
            // El nuevo nodo se apunta a sí mismo (circularidad)
            head = tail = newNode;
            newNode.next = newNode;
            newNode.prev = newNode;
        } else {
            // Caso 2: la lista tiene al menos un elemento
            // Enlazar el nuevo nodo antes del head actual
            newNode.next = head;   // el nuevo apunta al que era head
            newNode.prev = tail;   // su anterior será el tail actual
            head.prev = newNode;   // el head actual apunta hacia atrás al nuevo nodo
            tail.next = newNode;   // el tail apunta hacia adelante al nuevo nodo
            head = newNode;        // el nuevo nodo se convierte en el head
        }
    }

    
    // MÉTODO: addLast()
    // Agrega un nuevo nodo al final de la lista.
    
    public void addLast(T value) {
        NodeDoubly<T> newNode = new NodeDoubly<>(value); // Crear nuevo nodo

        if (tail == null) {
            // Caso 1: lista vacía (mismo comportamiento que addFirst)
            head = tail = newNode;
            newNode.next = newNode;
            newNode.prev = newNode;
        } else {
            // Caso 2: lista con elementos
            newNode.prev = tail;   // el nuevo apunta hacia atrás al antiguo tail
            newNode.next = head;   // y hacia adelante al head para mantener el círculo
            tail.next = newNode;   // el tail apunta hacia el nuevo nodo
            head.prev = newNode;   // el head apunta hacia atrás al nuevo nodo
            tail = newNode;        // el nuevo nodo se convierte en el nuevo tail
        }
    }

   
    // MÉTODO: removeFirst()
    // Elimina el primer nodo (head) y devuelve su valor.
    // Si la lista está vacía, retorna null.
    
    public T removeFirst() {
        if (head == null) {
            // Caso: lista vacía
            return null;
        }

        T first = head.data; // Guardar el valor del nodo eliminado

        if (head == tail) {
            // Caso: solo hay un elemento en la lista
            head = tail = null; // la lista queda vacía
        } else {
            // Caso: hay más de un elemento
            head = head.next;   // mover el head al siguiente nodo
            head.prev = tail;   // mantener el enlace circular hacia atrás
            tail.next = head;   // mantener el enlace circular hacia adelante
        }

        return first; // devolver el valor eliminado
    }
    // MÉTODO: removeLast()
    // Elimina el último nodo (tail) y devuelve su valor.
    // Si la lista está vacía, retorna null.
    
    public T removeLast() {
        if (tail == null) {
            // Caso: lista vacía
            return null;
        }

        T last = tail.data; // Guardar el valor del nodo eliminado

        if (head == tail) {
            // Caso: solo hay un nodo
            head = tail = null; // lista vacía
        } else {
            // Caso: hay más de un nodo
            tail = tail.prev;   // mover el tail hacia atrás
            tail.next = head;   // mantener la conexión circular hacia adelante
            head.prev = tail;   // mantener la conexión circular hacia atrás
        }

        return last; // devolver el valor eliminado
    }

    // LOS SIGUIENTES MÉTODOS YA ESTABAN IMPLEMENTADOS POR EL PROFESOR
  

    public T getFirst() {
        return head != null ? head.data : null;
    }

    public T getLast() {
        return tail != null ? tail.data : null;
    }

    public Boolean isEmpty() {
        return head == null;
    }

    public Integer getSize() {
        var size = 0;
        if (!isEmpty()) {
            var current = head;
            do {
                size++;
                current = current.next;
            } while (current != tail.next);
        }
        return size;
    }

    public void printList() {
        if (!isEmpty()) {
            var curr = head;
            do {
                System.out.println("\t" + curr.prev.data + " ⇄ | " + curr.data + " | ⇄ " + curr.next.data);
                curr = curr.next;
            } while (curr != tail.next);
        }
    }

    public void printListInReverse() {
        if (!isEmpty()) {
            var curr = tail;
            System.out.print("| ");
            do {
                System.out.print(curr.data + " | ");
                curr = curr.prev;
            } while (curr != head.prev);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        var n = Integer.parseInt(args[0]);
        ListInterface<Integer> list = new ListDoublyCircular<Integer>();
        var arrayDeque = new ArrayDeque<Integer>();
        var random = new Random();
        for (var counter = n * 2; counter > 0; counter--) {
            var value = random.nextInt(0, 10);
            list.addFirst(value);
            arrayDeque.addFirst(value);
            value = random.nextInt(0, 10);
            list.addLast(value);
            arrayDeque.addLast(value);
        }
        System.out.println();
        System.out.println("List {added: n * 4}: " + arrayDeque);
        System.out.println(" ↳ Size: " + list.getSize());
        System.out.println(" ↳ Empty: " + list.isEmpty());
        System.out.println(" ↳ First: " + list.getFirst());
        System.out.println(" ↳ Last: " + list.getLast());
        System.out.print(" ↳ Reverse: ");
        list.printListInReverse();
        System.out.println(" ↳ Print: ");
        list.printList();
        for (var counter = n; counter > 0; counter--) {
            list.removeFirst();
            arrayDeque.removeFirst();
            list.removeLast();
            arrayDeque.removeLast();
        }
        System.out.println();
        System.out.println("List {removed: n * 2}: " + arrayDeque);
        System.out.println(" ↳ Size: " + list.getSize());
        System.out.println(" ↳ Empty: " + list.isEmpty());
        System.out.println(" ↳ First: " + list.getFirst());
        System.out.println(" ↳ Last: " + list.getLast());
        System.out.print(" ↳ Reverse: ");
        list.printListInReverse();
        System.out.println(" ↳ Print: ");
        list.printList();
        for (var counter = arrayDeque.size(); counter > 0; counter--) {
            list.removeFirst();
            list.removeLast();
        }
        arrayDeque.clear();
        System.out.println();
        System.out.println("List {empty}: " + arrayDeque);
        System.out.println(" ↳ Size: " + list.getSize());
        System.out.println(" ↳ Empty: " + list.isEmpty());
        System.out.println(" ↳ First: " + list.getFirst());
        System.out.println(" ↳ Last: " + list.getLast());
        System.out.print(" ↳ Reverse: ");
        list.printListInReverse();
        System.out.println(" ↳ Print: ");
        list.printList();
    }
}

    

