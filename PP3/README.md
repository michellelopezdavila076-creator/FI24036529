# PP3

**Nombre:** Julissa Lopez  
**Carné:** FI24036529

 Objetivo

Familiarizarse con la estructura de **lista (List)** en el lenguaje de programación **Java**, creando un programa capaz de trabajar con una **lista circular doblemente enlazada** que utilice nodos con valores naturales entre cero y nueve generados aleatoriamente.



 ## Especificaciones funcionales

El programa implementa los siguientes métodos definidos por la interfaz genérica `ListInterface`:

| **addFirst(T value)** | Agrega un nodo al inicio de la lista. No tiene restricción de capacidad. |
| **addLast(T value)** | Agrega un nodo al final de la lista. No tiene restricción de capacidad. |
| **removeFirst()** | Elimina el primer nodo de la lista retornando su valor. Si la lista está vacía, retorna `null`. |
| **removeLast()** | Elimina el último nodo de la lista retornando su valor. Si la lista está vacía, retorna `null`. |

Al ejecutarse el programa con un parámetro **n**, se realizan los siguientes pasos:

1. Se generan **n × 4 números aleatorios** (entre 0 y 9).  
2. Se insertan `n × 2` nodos al inicio (`addFirst`) y `n × 2` al final (`addLast`).  
3. Se eliminan `n` nodos desde el inicio (`removeFirst`) y `n` desde el final (`removeLast`).  
4. Se eliminan todos los nodos restantes para verificar los casos de lista vacía.  
5. Se imprime el estado de la lista en cada operación.

#  Preguntas y Respuestas – PP3  
 

##  1️⃣ Si tuviera que implementar una estructura tipo **Cola (Queue)**, ¿qué tipo de lista utilizaría y por qué? ¿Y para una estructura tipo **Pila (Stack)?**

### **Cola (Queue):**
Usaría una **lista doblemente enlazada** o una **lista circular doblemente enlazada**, porque este tipo de lista permite **insertar elementos al final** (`enqueue`) y **eliminar desde el inicio** (`dequeue`) en tiempo constante **O(1)**.  
Gracias a que mantiene referencias a `head` y `tail`, las operaciones son directas sin necesidad de recorrer toda la estructura.  
Esto hace que sea ideal para representar colas donde se requiere un orden FIFO (First In, First Out).

###  **Pila (Stack):**
Usaría una **lista simplemente enlazada**, ya que en una pila solo se necesita trabajar con un extremo. 
Las operaciones `push` (insertar) y `pop` (eliminar) se realizan en el mismo nodo, también en tiempo **O(1)**.  
Además, su implementación es más ligera y eficiente en memoria que una lista doblemente enlazada, lo cual la hace perfecta para estructuras tipo LIFO (Last In, First Out).

---

## 2️⃣ ¿Cuál podría ser una ventaja y una desventaja de utilizar una estructura de tipo lista creada por usted mismo, en vez de las opciones provistas directamente por los módulos estándar de Java (como `List`)?

### **Ventaja:**
- Permite entender cómo funcionan internamente las estructuras de datos enlazadas.  
- Da control total sobre la manipulación de los nodos, optimización de operaciones y comportamiento interno.  
- Facilita personalizar la estructura según las necesidades del programa o el rendimiento buscado.  
- Fomenta el aprendizaje de conceptos como punteros, referencias, memoria dinámica y recursividad.

### **Desventaja:**
- Se requiere más tiempo para diseñar, probar y depurar la implementación.  
- Es más propensa a errores lógicos o referencias nulas.  





