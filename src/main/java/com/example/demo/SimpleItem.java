package com.example.demo;
/**
 * a simple item is one that just gets collected (no other purpose)
 * @author  Jenny Liao
 * @version 4.0
 * @since   2024-05-27
 */
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

import java.util.ArrayList;

public class SimpleItem extends Item{

    public SimpleItem (int xPos, int yPos, int id, String pic, int s, String description, int widthProfile, int heightProfile, Image prof, boolean collect) {
        position = new PVector(xPos, yPos);
        ID = id;
        picture = new Image(pic);
        size = s;
        this.description = description;
        profile = new Profile(position, widthProfile, heightProfile, prof);
        collectOn = collect;
    }

    @Override
    public void draw(GraphicsContext pen) {
        pen.drawImage(picture, position.getX(), position.getY(), size, size);
    }




    @Override
    public double getWidth() {
        return size;
    }

    @Override
    public double getHeight() {
        return size;
    }

    @Override
    public String interact() {
        return "pick up";

    }
}
