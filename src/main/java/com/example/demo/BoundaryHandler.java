/**
 * Handles entities which reach the boundaries of the canvas, preventing them from leaving the screen.
 *
 * @author  Jenny Liao
 * @version 4.0
 * @since   2024-05-27
 */
package com.example.demo;

public class BoundaryHandler {
    /**
     * Checks if an entity's x value has reached the boundaries
     * @param x, double
     * @return double
     */
    public double checkX(double x) {
        if(x >= 1600) {
            x += -10;
        }
        else if(x <= 0) {
            x += 10;
        }
        return x;
    }
    /**
     * Checks if an entity's y value has reached the boundaries
     * @param y, double
     * @return double
     */
    public double checkY(double y) {
        if(y >= 1400) {
            y += -10;
        }
        else if(y <= 0) {
            y += 10;
        }
        return y;
    }
}
