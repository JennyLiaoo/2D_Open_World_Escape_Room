/**
 * All collectable objects must implement the methods within this class
 *
 * @author  Jenny Liao
 * @version 4.0
 * @since   2023-12-4
 */
package com.example.demo;

public interface Collectable {
    /**
     * all collectable items have an ID to help identify them
     * @return int
     */
    public int getID();
}