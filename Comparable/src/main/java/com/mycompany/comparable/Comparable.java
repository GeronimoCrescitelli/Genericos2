
package com.mycompany.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class Comparable {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(33);
        numeros.add(11);
        numeros.add(44);
        numeros.add(22);
        
        ArrayList<String> colores = new ArrayList<>();
        colores.add("Celeste");
        colores.add("Blanco");
        colores.add("Rojo");
        colores.add("Verde");
        colores.add("Azul");
        
        ArrayList<Persona> personas = new ArrayList<>();
        
        personas.add(new Persona(4545, "Paula", "Lopez", 1.56, EstadoCivil.VIUDO));
        personas.add(new Persona(2332, "Federico", "Gomez", 1.66, EstadoCivil.DIVORCIADO));
        personas.add(new Persona(7171, "Geronimo", "Lopez", 1.78, EstadoCivil.SOLTERO));
        personas.add(new Persona(3609, "Luca", "Crescitelli", 1.69, EstadoCivil.CASADO));
        
        Collections.sort(numeros);
        mostrarLista(numeros);
        
    }

    public static void mostrarLista(List<?> lista) {
        for (Object x : lista) {
            System.out.println(x);
        }
    }
}
