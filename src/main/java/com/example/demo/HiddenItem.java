package com.example.demo;

/**
 * an item than cannot initially be seen
 *
 * @author  Jenny Liao
 * @version 4.0
 * @since   2024-05-27
 */
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

public class HiddenItem extends SimpleItem{
    protected boolean invisibleOn = true;
    public HiddenItem(int xPos, int yPos, int id, String pic, int s, String description, int widthProfile, int heightProfile, Image prof, boolean collect) {
        super(xPos, yPos, id, pic, s, description, widthProfile, heightProfile, prof, collect);
    }
    /**
     * only draws the item if invisible is not on
     * @param pen, GraphicsContext
     */
    @Override
    public void draw(GraphicsContext pen) {
        if(!invisibleOn) {
            pen.drawImage(picture, position.getX(), position.getY(), size, size);
        }
    }


}
