package com.example.demo;
/**
 * NPCs (not used, for project extension)
 *
 * @author  Jenny Liao
 * @version 4.0
 * @since   2024-05-27
 */
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

import java.util.ArrayList;

public class NPC extends Entity{
    protected ArrayList<Image> dialogue;
    private Image npc;
    protected ArrayList<Item> items;
    private int dialogueCounter;


    public NPC (ArrayList<Image> d, Image person, ArrayList<Item> i, int widthProfile, int heightProfile, Image prof) {
        dialogue = d;
        npc = person;
        items = i;
        dialogueCounter = 0;
        size = 40;
        this.profile = new Profile(position, widthProfile, heightProfile, prof);

    }

    @Override
    public void draw(GraphicsContext pen) {
        pen.drawImage(npc, position.getX(), position.getY(), size, size);
    }

    /**
     * draws the NPC's current dialogue
     * @param pen, GraphicsContext
     */
    public void drawDialogue(GraphicsContext pen) {
        if(dialogueCounter < dialogue.size()) {
            pen.drawImage(dialogue.get(dialogueCounter), position.getX() + 40, position.getY(), size, size);
        } else {
            dialogueCounter = 0;
            pen.drawImage(dialogue.get(dialogueCounter), position.getX() + 40, position.getY(), size, size);
        }
    }




    @Override
    public String interact() {
        return null;
    }
}
