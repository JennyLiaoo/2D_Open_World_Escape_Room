package com.example.demo;

/**
 * Collision interface for all collideable objects
 *
 * @author  Jenny Liao
 * @version 4.0
 * @since   2024-05-27
 */
public interface Collideable {
    /**
     * Checks if this object is colliding with another GameObject, implemented by all collideable objects
     * @param other, GameObject
     * @return boolean
     */
    boolean isColliding(GameObject other);
}