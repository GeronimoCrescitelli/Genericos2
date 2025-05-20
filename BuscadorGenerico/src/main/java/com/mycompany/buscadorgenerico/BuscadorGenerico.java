
package com.mycompany.buscadorgenerico;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class BuscadorGenerico {

        public static void main(String[] args) {
        ArrayList<Auto> autos = new ArrayList<>();
        autos.add(new Auto("SKM123", "Verde"));
        autos.add(new Auto("FDF789", "Blanco"));
        autos.add(new Auto("NBV432", "Azul"));
        autos.add(new Auto("WRE165", "Gris"));

        Buscador<Auto, String> buscadorDeAutosPorPatente;
        buscadorDeAutosPorPatente = new Buscador<>();
        Auto a = buscadorDeAutosPorPatente.buscar(autos, "NBV432");
        System.out.println(a);

        ArrayList<Persona> personas = new ArrayList<>();
        personas.add(new Persona(2345, "Ana", "Martínez"));
        personas.add(new Persona(3456, "Luis", "Fernández"));
        personas.add(new Persona(4567, "Carla", "Rodríguez"));
        personas.add(new Persona(5678, "Jorge", "López"));
        personas.add(new Persona(6789, "Lucía", "Pérez"));

        Buscador<Persona, Integer> buscadorDePersonasPorDNI;
        buscadorDePersonasPorDNI = new Buscador<>();
        Persona p = buscadorDePersonasPorDNI.buscar(personas, 3456);
        System.out.println(p);


    }
    
}
