package com.example.demo;
/**
 * a quest item is one that gives hints (originally it was supposed to do more, giving the player different stats when one was added to the inventory)
 *
 * @author  Jenny Liao
 * @version 4.0
 * @since   2024-05-27
 */
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

import java.util.ArrayList;

public class WeaponItem extends Item{   //have no other purposes other than being collectable
    protected int atk;
    protected int hp;
    protected int spd;

    public WeaponItem (int xPos, int yPos, int id, String pic, int s, String description, int atk, int hp, int spd, int widthProfile, int heightProfile, Image prof, boolean collect) {
        position = new PVector(xPos, yPos);
        ID = id;
        picture = new Image(pic);
        size = s;
        this.description = description;
        this.atk = atk;
        this.hp = hp;
        this.spd = spd;
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
