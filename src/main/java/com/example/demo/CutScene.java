/**
 * Cutscenes appear after the gameboard changes.
 * The Dialogue plays with each mouse click, and the cutscene can only be watched once
 *
 * @author  Jenny Liao
 * @version 2.0
 * @since   2024-05-27
 */
package com.example.demo;

//import libraries
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import java.util.ArrayList;

public class CutScene implements Drawable{ //is drawable
    protected ArrayList<Image> dialogue;
    protected Image background;
    protected boolean seen;               //tracks if the cutscene has already been drawn before
    protected int dialogueCounter;        //tracks which dialogue the cutscene is currently on
    private PVector position;
    protected boolean cutSceneOn;         //tracks if the cutscene is currently playing

    public CutScene(ArrayList<Image> dialogue, Image background) {
        this.dialogue = dialogue;
        this.background = background;
        seen = false;
        dialogueCounter = 0;
        position = new PVector(0,0);
        cutSceneOn = false;
    }

    /**
     * Sets the position of the cutscene so that it fills the current camera view
     * @param xPos, double
     * @param yPos, double
     */
    public void setPos(double xPos, double yPos) {
        position.setPos(xPos, yPos);
    }

    /**
     * Draws the cutscene based on which dialogue the player is currently on.
     * @param pen, GraphicsContext
     */
    @Override
    public void draw(GraphicsContext pen) {
        if(dialogueCounter < dialogue.size()) {
            pen.drawImage(background, position.getX()-400, position.getY()-360, 850, 730);
            pen.drawImage(dialogue.get(dialogueCounter), position.getX()-350, position.getY()+150, 760, 190);
        } else {
            seen = true;
        }
    }
}
