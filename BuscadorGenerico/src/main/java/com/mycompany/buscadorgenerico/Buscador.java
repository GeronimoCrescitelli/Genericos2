
package com.mycompany.buscadorgenerico;

import java.util.Collection;
import java.util.Iterator;

/**
 *
 * @author Usuario
 */
public class Buscador <T extends Identificable, K>{

    public T buscar(Collection<? extends T> elementos, K id) {
        T encontrado = null;
        Iterator<? extends T> it = elementos.iterator();
        while (it.hasNext() && encontrado == null) {
            T actual = it.next();
            if (actual.sameId(id)) {
                encontrado = actual;
            }
        }
        return encontrado;
    }
}
