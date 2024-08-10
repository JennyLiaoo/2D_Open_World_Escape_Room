/**
 * Creates the objects, background, and boundaries within the CellGameboard
 *
 * @author  Jenny Liao
 * @version 2.0
 * @since   2024-05-27
 */
package com.example.demo;

import javafx.scene.image.Image;

public class CellGameboard extends Gameboard{ //CellGameboard contains all the variables and methods in gameboard

    //constructor which creates/initializes all the images to be drawn
    public CellGameboard() {
        background = new Image("CellScene.png");

        //cutscene dialogue images
        cutsceneDialogue.add(new Image("CellDialogue1.png"));
        cutsceneDialogue.add(new Image("CellDialogue2.png"));
        cutsceneDialogue.add(new Image("CellDialogue3.png"));
        cutsceneDialogue.add(new Image("CellDialogue4.png"));
        cutsceneDialogue.add(new Image("CellDialogue5.png"));
        cutsceneDialogue.add(new Image("CellDialogue6.png"));
        cutsceneDialogue.add(new Image("CellDialogue7.png"));

        //cutscene background
        cutScene = new CutScene(cutsceneDialogue, new Image("Cell.png"));

        //establishing boundaries
        boundaries.add(new Boundary(0, 0, 1600, 810));
        boundaries.add(new Boundary(0,1080,1380,100));
        boundaries.add(new Boundary(1480,1080,100,100));
        boundaries.add(new Boundary(0,0,10,1400));
        boundaries.add(new Boundary(1590,0,10,1400));

        //Objects in the gameboard
        gameObjects.add(new HiddenItem(150, 820, 14, "Enveloppe.png", 60, "Morse code",  270, 80, new Image("CellHint1.png"), false));
        gameObjects.add(new HiddenItem(560, 820, 15, "Enveloppe.png", 60, "Morse code",  270, 80, new Image("CellHint2.png"), false));
        gameObjects.add(new HiddenItem(980, 820, 16, "Enveloppe.png", 60, "Morse code",  270, 80, new Image("CellHint3.png"), false));
        gameObjects.add(new HiddenItem(1300, 820, 17, "Enveloppe.png", 60, "Morse code",  270, 80, new Image("CellHint4.png"), false));

    }

}
