# 🧩 Proyecto Java: Programación Genérica y Comparación de Objetos
Este proyecto en Java tiene como objetivo aplicar conceptos avanzados de programación orientada a objetos, haciendo uso de interfaces genéricas, comparadores y un buscador genérico.
El desarrollo está dividido en 4 etapas, cada una enfocada en una técnica distinta.

## 📌 Etapas del Proyecto
### 🔹 Etapa 1: Interfaces Genéricas
Se implementa una interfaz genérica Identificable<T> que permite abstraer cualquier clase que posea un identificador.
Esto permite reutilizar código y mejorar la escalabilidad del diseño.

Ejemplo:

```java
public interface Identificable<T> {
    public abstract T getId();
    public abstract void setId(T x);
}
```
Clases como Persona y Auto implementan esta interfaz.

### 🔹 Etapa 2: Comparable
La clase Persona implementa la interfaz Comparable<Persona> para permitir el ordenamiento natural de los objetos, por ejemplo, según el DNI.

```java
@Override
    public int compareTo(Persona otra) {
        return this.DNI - otra.DNI; // ASCENDENTE
        //return otra.DNI - this.DNI; // DESCENDENTE
    }
```
En este ejemplo, la comparación se realiza a través del dni, pero comentados dentro del mismo archivo podemos encontrar otras funciones 
de ordenamiento a través del apellido, la estatura o el estado civil de la persona.


Dentro del main incorporado en el archivo Comparable.java, Collections.sort() utiliza el método compareTo() para determinar el orden de los objetos en una lista. 
Al implementar Comparable y definir compareTo(), se puede personalizar la forma en que tus objetos son ordenados, lo que permite una gran flexibilidad en la manipulación de colecciones en Java.

### 🔹 Etapa 3: Uso de Comparator
Se crean múltiples clases que implementan la interfaz Comparator para permitir ordenamientos personalizados.
En este proyecto comparamos Autos por los siguientes criterios:

- Por kilometraje
- Por patente

```java

 @Override
    public int compare(Auto o1, Auto o2) {
        return multiplicador * (o1.getKilometraje() - o2.getKilometraje());
    }
```

Tambien tenemos comparaciones de enteros y de cadenas.

Una vez generados los comparadores,pueden usarse con Collections.sort() para ordenar una lista de objetos Auto o de otro tipo según el criterio deseado,
permitiendo una gran flexibilidad en el ordenamiento de objetos. Puedes definir múltiples comparadores para una misma clase y utilizarlos según sea necesario, sin tener que modificar la clase original.


### 🔹 Etapa 4: Buscador Genérico
Se desarrolla un buscador genérico que permite filtrar listas de cualquier tipo de objeto que implemente Identificable<T>.
Esto permite realizar búsquedas por identificador sin acoplar el código a clases concretas.

```java
public interface Identificable<T> {
    public abstract T getId();
    public abstract void setId(T x);
    public abstract boolean sameId(T anotherID);
    
}
```

Utilizando esa interfaz generica junto con la clase generica Buscador, nos permite buscar elementos usando el ID del objeto
```java
    public T buscar(Collection<? extends T> elementos, K id) 
```

Finalmente, dentro del archivo que contiene el main (BuscadorGenerico.java) se puede buscar de la siguiente manera:
```java
        Auto a = buscadorDeAutosPorPatente.buscar(autos, "NBV432");
```

En este ejemplo, mostramos la busqueda de un auto por su patente pero se podría utilizar para cualquier objeto con un id.

## 🛠️ Tecnologías Utilizadas
Java 8 o superior

Maven (para la gestión del proyecto)

NetBeans (IDE recomendado)
