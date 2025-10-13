# Práctica Programada 2 - Revert

##  Datos
- **Nombre:** [Julissa Michelle Lopez Davila]  
- **Carné:** [FI24036529]

---

##  Información general
Programa en Java que lee un archivo de texto, guarda sus caracteres en una pila y luego escribe el contenido invertido en otro archivo.

- **Versión:** Java SE 21  
- 

---

##  Fuentes consultadas
- Documentación de Java (Stack, FileReader, FileWriter)
- W3Schools y GeeksForGeeks para ejemplos de uso de pila y archivos.

---

##  Chatbots usados
Se utilizó ChatGPT para aclarar dudas sobre el uso de `Stack` y `FileWriter`.  


---

## Preguntas

## 1 ¿Cree que exista otra forma de efectuar la inversión del contenido de un archivo sin necesidad de usar una pila?
Sí. Se podría lograr sin una pila usando una **estructura de tipo cadena (String)** o un **arreglo de caracteres**.  
Por ejemplo, al leer todo el texto del archivo como un `String`, se podría usar el método `StringBuilder.reverse()` para invertir su contenido y luego escribirlo nuevamente en el archivo de salida.  
Esto sería una forma más directa, aunque no cumpliría con el propósito académico de practicar el uso de pilas.

---

### 2 ¿En qué ejemplo de la vida real (no informático) se puede ver reflejado el uso de una pila?
Un ejemplo claro de una pila en la vida real es una **pila de platos**:  
- El primer plato en entrar queda en la parte inferior.  
- El último plato en colocarse es el primero que se saca.  
Esto representa exactamente el comportamiento **LIFO** (*Last In, First Out*) de una pila en programación.

---

