public class CustomStack {

    private StackNode _head;

    public CustomStack() {
        _head = null;
    }

    public void push(String word) {
        var node = new StackNode(word);

        // Actualizar
//Material de la clase con ayuda de ChatGPT
        node.setNext(_head);
        _head = node;
    }

    public String pop() {
        String word = null;

        // Actualizar
         //Material de la clase con ayuda de ChatGPT
        if (_head != null) {
            word = _head.getWord();     
            _head = _head.getNext();
    }
     return word;
     }

    public int size() {
        var length = 0;

        // Actualizar
        //Material de la clase con ayuda de ChatGPT
        StackNode current = _head;
        while (current != null) {
            length++;
            current = current.getNext();   
        }

        return length;
    }

    public String getWords() {
        var builder = new StringBuilder("(" + size() + ") [");
        for (var word = pop(); word != null; word = pop()) {
            builder.append(" " + word);
        }
        builder.append(" ]");
        return builder.toString();
    }
}