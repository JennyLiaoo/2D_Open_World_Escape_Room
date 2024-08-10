package com.example.demo;
/**
 * Is the item's description profile
 *
 * @author  Jenny Liao
 * @version 4.0
 * @since   2024-05-27
 */
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;


public class Profile implements Drawable{
    protected boolean profileOn;
    protected PVector position;
    private Image image;
    private int widthProfile;
    private int heightProfile;
    public Profile(PVector pos, int width, int height, Image image) {
        profileOn = false;
        position = pos;
        this.image = image;
        widthProfile = width;
        heightProfile = height;
    }

    /**
     * updates the profile's position depending on the item's position
     * @param pos, PVector
     */
    public void updateProfilePos(PVector pos) {
        position = pos;
    }

    /**
     * draws the profile if it is on
     * @param pen, GraphicsContext
     */
    @Override
    public void draw(GraphicsContext pen) {
        if(profileOn) {
            pen.drawImage(image, position.getX(), position.getY(), widthProfile,heightProfile);
        }
    }
}
