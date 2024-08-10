package com.example.demo; /**
 * Holds all the information that each Gameboard must have
 *
 * @author  Jenny Liao
 * @version 4.0
 * @since   2024-05-27
 */
import javafx.scene.canvas.GraphicsContext;

import java.util.ArrayList;
import javafx.scene.image.Image;


public abstract class Gameboard {
    protected double playerX = 0;
    protected double playerY = 0;
    protected CutScene cutScene;
    protected ArrayList<Image> cutsceneDialogue = new ArrayList<>();

    protected ArrayList<GameObject>  gameObjects = new ArrayList<>();

    protected Image background;
    protected ArrayList<GameObject> boundaries = new ArrayList<>();

    /**
     * draws everything in the gameboard
     * @param pen, GraphicsContext
     */
    public void draw(GraphicsContext pen) {

        for(int i = 0; i < boundaries.size(); i++) {
            boundaries.get(i).draw(pen);
        }
        pen.drawImage(background, 0,0, 1600, 1400);
        for(int i = 0; i < gameObjects.size(); i++) {
            gameObjects.get(i).draw(pen);
        }
    }

    /**
     * getters and setters
     */
    public void setPlayerPos(double x, double y) {
        playerX = x;
        playerY = y;
    }
    public ArrayList<GameObject> getObjects() {
        return gameObjects;
    }
    public ArrayList<GameObject> getBoundaries() {
        return boundaries;
    }

}