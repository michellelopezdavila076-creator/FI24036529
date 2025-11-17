#  PP4 

##  Estudiante  
**Nombre:** Julissa Michelle Lopez Davila 
**Carné:** FI24036529 

---

##  Curso  

Esta práctica tiene como propósito implementar un **árbol binario de búsqueda (Binary Search Tree)** utilizando un **arreglo estático** como estructura principal, en lugar de nodos enlazados o referencias dinámicas.  

El enfoque de este trabajo es comprender cómo un árbol binario puede ser representado completamente mediante posiciones dentro de un arreglo, aplicando fórmulas matemáticas para localizar hijos e interpretar la jerarquía del árbol.  

Además, se solicitó completar únicamente los métodos indispensables para que la estructura funcione:

- **Inserción de valores respetando el orden del árbol**
- **Recorrido en preorden**
- **Recorrido en postorden**

La práctica busca reforzar el razonamiento iterativo y el manejo de índices, ya que **no se permite el uso de recursividad ni estructuras avanzadas**, manteniendo la lógica estrictamente dentro de los estándares del curso.

---

# Funcionamiento del Árbol

El árbol binario se almacena dentro de un arreglo usando:

- **Hijo izquierdo:** `2 * i + 1`  
- **Hijo derecho:** `2 * i + 2`

Esto permite simular la estructura jerárquica del árbol sin necesidad de punteros.

---

#  Implementación Realizada

### ✔ `insert(int value)`
Método encargado de colocar cada valor en la posición correspondiente según las reglas del árbol binario de búsqueda. Se implementa exclusivamente mediante ciclos y operaciones sobre índices.

### ✔ `preOrderTraversal()`
Recorrido **Preorden**  
**Raíz → Izquierdo → Derecho**  
Se utiliza una pila para evitar la recursión.

### ✔ `postOrderTraversal()`
Recorrido **Postorden**  
**Izquierdo → Derecho → Raíz**  
Se implementa utilizando dos pilas, técnica necesaria cuando no se puede utilizar recursividad.
**Estructuras de Datos — SC-304**  
**Profesor:** Luis Andrés Rojas Matey  
**Universidad Fidélitas**

---

#  Descripción del Proyecto

Esta práctica tiene como propósito implementar un **árbol binario de búsqueda (Binary Search Tree)** utilizando un **arreglo estático** como estructura principal, en lugar de nodos enlazados o referencias dinámicas.  

El enfoque de este trabajo es comprender cómo un árbol binario puede ser representado completamente mediante posiciones dentro de un arreglo, aplicando fórmulas matemáticas para localizar hijos e interpretar la jerarquía del árbol.  

Además, se solicitó completar únicamente los métodos indispensables para que la estructura funcione:

- **Inserción de valores respetando el orden del árbol**
- **Recorrido en preorden**
- **Recorrido en postorden**

La práctica busca reforzar el razonamiento iterativo y el manejo de índices, ya que **no se permite el uso de recursividad ni estructuras avanzadas**, manteniendo la lógica estrictamente dentro de los estándares del curso.


# Funcionamiento del Árbol

El árbol binario se almacena dentro de un arreglo usando:

- **Hijo izquierdo:** `2 * i + 1`  
- **Hijo derecho:** `2 * i + 2`

Esto permite simular la estructura jerárquica del árbol sin necesidad de punteros.

---

#  Implementación Realizada

###  `insert(int value)`
Método encargado de colocar cada valor en la posición correspondiente según las reglas del árbol binario de búsqueda. Se implementa exclusivamente mediante ciclos y operaciones sobre índices.

###  `preOrderTraversal()`
Recorrido **Preorden**  
**Raíz → Izquierdo → Derecho**  
Se utiliza una pila para evitar la recursión.

###  `postOrderTraversal()`
Recorrido **Postorden**  
**Izquierdo → Derecho → Raíz**  
Se implementa utilizando dos pilas, técnica necesaria cuando no se puede utilizar recursividad.
