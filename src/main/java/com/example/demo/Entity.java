/**
 * An abstract class for all entities that are living beings (not collectable)
 *
 * @author  Jenny Liao
 * @version 3.0
 * @since   2024-05-27
 */

package com.example.demo;
import javafx.scene.canvas.GraphicsContext;

public abstract class Entity extends GameObject {
    //instance variables that all entities have
    protected PVector velocity;
    protected int lvl;

    /**
     * moves the entity
     */
    public void move() {
        position.add(velocity.getX(), velocity.getY());
    }

    /**
     * An abstract draw class that all entities must implement
     * @param pen, GraphicsContext
     */
    public abstract void draw(GraphicsContext pen);

    /**
     * moves the entity based on keyboard clicks
     * @param direction, char
     */
    public void move(char direction) {
        if(direction == 'w') {
            position.add(0, -10);

        } else if(direction == 'a') {
            position.add(-10, 0);

        } else if(direction == 's') {
            position.add(0, 10);

        } else if(direction == 'd') {
            position.add(10, 0);

        }
    }
}
