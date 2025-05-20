
package com.mycompany.buscadorgenerico;

/**
 *
 * @author Usuario
 * @param T
 */
public interface Identificable<T> {
    public abstract T getId();
    public abstract void setId(T x);
    public abstract boolean sameId(T anotherID);
    
}
