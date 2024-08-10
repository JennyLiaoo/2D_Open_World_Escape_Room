package com.example.demo;
/**
 * Items that the player can collect
 *
 * @author  Jenny Liao
 * @version 4.0
 * @since   2024-05-27
 */
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

import java.util.ArrayList;

public abstract class Item extends GameObject implements Collectable {
    protected String description;
    protected int ID;



    @Override
    public int getID() {
        return ID;
    }

    //extra methods that can be used when extending this project
    public void read(GraphicsContext pen) {
        profile.draw(pen);
    }
    public String getDescription() {
        return description;
    }
    public void  setDescription(String d) {
        description = d;
    }
}
