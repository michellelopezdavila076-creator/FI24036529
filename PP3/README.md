#  README – PP3


##  Datos del estudiante

**Nombre:** Julissa Lopez D
**Carné:** FI24036529  



##  IDE o editor utilizado

- **Visual Studio Code (VS Code)**  
- Versión de Java utilizada: **OpenJDK 21 (LTS)**  
- Compilación y ejecución realizadas mediante la terminal integrada con los comandos `javac` y `java`.



##  Páginas web consultadas

Durante el desarrollo de este proyecto, consulté diferentes recursos en línea para reforzar mi comprensión sobre el tema y buscar ejemplos de implementación de listas circulares doblemente enlazadas en Java.  
Entre los sitios más útiles se encuentran:

- [Oracle Java Documentation](https://docs.oracle.com/javase/21/docs/api/) – para revisar documentación oficial del lenguaje.  
- [Baeldung – Linked Lists in Java](https://www.baeldung.com/java-linked-list) – para entender cómo funcionan las listas enlazadas y sus operaciones básicas.  
- [Stack Overflow – Circular Doubly Linked List Implementation](https://stackoverflow.com/questions/45315611) – para analizar ejemplos de código similares al requerido en este trabajo.  
- [Geeks for Geeks – Doubly Circular Linked List](https://www.geeksforgeeks.org/doubly-circular-linked-list/) – para repasar la teoría sobre los punteros `next` y `prev` en estructuras circulares.

## Uso de herramientas de inteligencia artificial

Durante la elaboración de esta práctica utilicé **ChatGPT** (modelo GPT-5) como **herramienta de apoyo personal**, únicamente para **consultar explicaciones teóricas y verificar la lógica** de algunos métodos como `addFirst`, `addLast`, `removeFirst` y `removeLast`.  
No copié código directamente, sino que me basé en las respuestas obtenidas para **entender mejor el funcionamiento** de una lista circular doblemente enlazada y luego redactar mi propia versión del programa.  

Además, utilicé la herramienta para redactar y revisar el formato de este documento `README.md`, asegurándome de aplicar correctamente la sintaxis Markdown.  


## Preguntas y respuestas


### 1. Si tuviera que implementar una estructura tipo **Cola (Queue)**, ¿qué tipo de lista (simple, circular, doblemente enlazada o circular doblemente enlazada) utilizaría y por qué? ¿Y para una estructura tipo **Pila (Stack)?**

### Cola (Queue):
Utilizaría una **lista doblemente enlazada** o una **lista circular doblemente enlazada**, ya que permiten agregar elementos al final (`enqueue`) y eliminar desde el inicio (`dequeue`) de forma eficiente en tiempo **O(1)**.  
Estas estructuras son ideales para implementar colas, ya que mantienen punteros tanto al primer nodo (`head`) como al último (`tail`), lo que evita recorrer toda la lista en cada operación.

####  Pila (Stack):
Para una pila, usaría una **lista simplemente enlazada**, porque solo se necesita trabajar con un extremo (la cima).  
Las operaciones de inserción (`push`) y eliminación (`pop`) se realizan en el mismo nodo, también en tiempo **O(1)**.  
Además, es una estructura más sencilla, ligera y suficiente para este tipo de comportamiento (LIFO: Last In, First Out).


### 2. ¿Cuál cree que podría ser una **ventaja** y una **desventaja** de utilizar una estructura de tipo lista creada por usted mismo, en vez de las opciones provistas directamente por los módulos estándar de Java (como por ejemplo `List`)?  

####  Ventaja:
- Me permite **comprender mejor el funcionamiento interno** de las estructuras enlazadas y cómo se manejan los punteros y la memoria.  
- Puedo **personalizar** la estructura según las necesidades del programa.  
- Refuerza mis conocimientos en **programación orientada a objetos** y en el manejo de nodos en Java.

#### Desventaja:
- La implementación manual **toma más tiempo** y puede ser propensa a errores lógicos o referencias nulas 
- En comparación, las clases estándar de Java como `ArrayList` o `LinkedList` ya están **optimizadas y probadas**, por lo que son más confiables para proyectos reales.


##  Conclusión

Esta práctica me ayudó a **entender cómo funcionan las listas circulares doblemente enlazadas**, el rol de los punteros `next` y `prev`, y la importancia de mantener la conexión entre el primer y último nodo.  
También fortalecí mis habilidades en **manipulación de estructuras dinámicas**, **control de referencias** y en la aplicación de los principios de la **programación orientada a objetos** en Java.  

Considero que el uso responsable de herramientas como ChatGPT puede ser una forma de **reforzar el aprendizaje**, siempre y cuando se utilicen como guía y no como sustituto del trabajo propio.
