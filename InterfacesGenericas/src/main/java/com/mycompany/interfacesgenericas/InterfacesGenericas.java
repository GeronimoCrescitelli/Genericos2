package com.mycompany.interfacesgenericas;

/**
 *
 * @author Usuario
 */
public class InterfacesGenericas {

   public static void main(String[] args) {
        Persona p = new Persona(1234, "Alberto", "Gimenez");
        Auto a = new Auto("JKL156", "Azul");
        
        identificar(p);
        identificar(a);
    }
    
    public static void identificar(Identificable objIdentif) {
        System.out.println("Yo soy " + objIdentif.getId());
    }
}
