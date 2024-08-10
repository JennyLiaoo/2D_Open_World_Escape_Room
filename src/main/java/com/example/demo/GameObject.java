package com.example.demo;
/**
 * GameObject class for all objects within the game, checks for their collisions.
 *
 * @author  Jenny Liao
 * @version 4.0
 * @since   2024-05-27
 */
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

import java.util.ArrayList;

public abstract class GameObject implements Collideable, Drawable, Interactable{ //must implement these methoffs
    protected PVector position;
    protected Image picture;
    protected int size;
    protected Profile profile;
    protected boolean collectOn;
    public abstract void draw(GraphicsContext pen);
    public int getSize() {return size;}

    public PVector getPos() {
        return position;
    }

    /**
     * Checks if the object is colliding with another gameObject (circular)
     * @param other, GameObject
     * @return boolean
     */
    public boolean isColliding(GameObject other) {
        PVector otherPosition = other.getPos();
        double thisRadius = this.getSize()/2.0;
        double otherRadius = other.getSize()/2.0;
        double thisMidPointX = position.getX() + thisRadius;
        double thisMidPointY = position.getY() + thisRadius;
        double otherMidPointX = otherPosition.getX() + otherRadius;
        double otherMidPointY = otherPosition.getY() + otherRadius;
        double dx = thisMidPointX- otherMidPointX;
        double dy = thisMidPointY - otherMidPointY;
        double distance = Math.sqrt(dx * dx + dy * dy);
        return distance < (thisRadius + otherRadius);
    }

    //getters and setters
    public double getXPos() {
        return position.getX();
    }
    public double getYPos() {
        return position.getY();
    }
    public double getWidth() {
        return size;
    }
    public double getHeight() {
        return size;
    }
    public void setSize(int s) {
        size = s;
    }

}
