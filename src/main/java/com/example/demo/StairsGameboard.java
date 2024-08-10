package com.example.demo;
/**
 * Creates the objects, background, and boundaries within the StairsGameboard
 *
 * @author  Jenny Liao
 * @version 2.0
 * @since   2024-05-27
 */
import javafx.scene.image.Image;


public class StairsGameboard extends Gameboard{
    //constructor which creates/initializes all the images to be drawn
    public StairsGameboard() {

        background = new Image("StairsScene.png");
        //cutscene background
        cutsceneDialogue.add(new Image("StairsDialogue1.png"));
        cutsceneDialogue.add(new Image("StairsDialogue2.png"));
        cutsceneDialogue.add(new Image("StairsDialogue3.png"));
        cutsceneDialogue.add(new Image("StairsDialogue4.png"));


        cutScene = new CutScene(cutsceneDialogue, new Image("Stairs.png"));
        //establishing boundaries
        boundaries.add(new Boundary(0, 0, 1600, 80));
        boundaries.add(new Boundary(230, 80, 250, 170));
        boundaries.add(new Boundary(680, 80, 260, 550));
        boundaries.add(new Boundary(1090, 60, 250, 170));
        boundaries.add(new Boundary(1310, 400, 200, 350));
        boundaries.add(new Boundary(990, 780, 800, 700));
        boundaries.add(new Boundary(0, 780, 580, 700));
        boundaries.add(new Boundary(0, 0, 50, 1400));
        boundaries.add(new Boundary(1550, 0, 50, 1400));
        boundaries.add(new Boundary(0, 410, 260, 700));
        //Objects in the gameboard
        gameObjects.add(new QuestItem(760, 670, 29, "Enveloppe.png", 150, "teleport", 320, 320, new Image("map.png"), true));



    }

}
