
package com.mycompany.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class Comparator {

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
        
        ArrayList<Auto> autos = new ArrayList<>();
        autos.add(new Auto("JKL123", 1234));
        autos.add(new Auto("MNO456", 5678));
        autos.add(new Auto("PQR789", 9101));
        autos.add(new Auto("STU012", 1121));
        autos.add(new Auto("VWX345", 3141));

        
        //Collections.sort(numeros, new ComparadorDeEnteros());
        //Collections.sort(colores, new ComparadorDeCadenas());
        
        Collections.sort(autos, new ComparadorDeAutosPorKilometraje(false));
        
        mostrarLista(autos);
        
    }

    public static void mostrarLista(List<?> lista) {
        for (Object x : lista) {
            System.out.println(x);
        }
    }
}
