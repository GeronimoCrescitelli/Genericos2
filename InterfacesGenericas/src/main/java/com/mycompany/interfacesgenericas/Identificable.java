
package com.mycompany.interfacesgenericas;

/**
 *
 * @author Usuario
 * @param <T>
 */
public interface Identificable<T> {
    public abstract T getId();
    public abstract void setId(T x);
}