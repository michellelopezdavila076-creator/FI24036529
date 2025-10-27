public interface TheStackInterface<T> {
    Boolean push(T item);
    T pop();

    T peek();

    Boolean empty();
  
    Integer size();

    String print();
}

