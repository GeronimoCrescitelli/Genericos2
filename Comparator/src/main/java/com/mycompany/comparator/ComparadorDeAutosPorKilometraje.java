
package com.mycompany.comparator;
import java.util.Comparator;

/**
 *
 * @author Usuario
 */
public class ComparadorDeAutosPorKilometraje implements Comparator<Auto>{
    
     private int multiplicador;

    public ComparadorDeAutosPorKilometraje(boolean ascendente) {
        if (ascendente) multiplicador = 1;
        else multiplicador = -1;
    } 
    
    @Override
    public int compare(Auto o1, Auto o2) {
        return multiplicador * (o1.getKilometraje() - o2.getKilometraje());
    }
    
}
