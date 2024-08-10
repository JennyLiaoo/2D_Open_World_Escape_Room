/**
 * Creates the objects, background, and boundaries within the EndGameboard
 *
 * @author  Jenny Liao
 * @version 2.0
 * @since   2024-05-27
 */
package com.example.demo;

import javafx.scene.image.Image;

public class EndGameboard extends Gameboard{

    //constructor which creates/initializes all the images to be drawn
    public EndGameboard() {
        background = new Image("YOUWIN.jpeg");

        //cutscene dialogue images
        cutsceneDialogue.add(new Image("Win.png"));
        //cutscene background
        cutScene = new CutScene(cutsceneDialogue, new Image("YOUWIN.jpeg"));

        //establishing boundaries
        boundaries.add(new Boundary(0, 0, 10, 1400));
        boundaries.add(new Boundary(0,0,1600,10));
        boundaries.add(new Boundary(1590,0,10,1400));
        boundaries.add(new Boundary(0, 1390, 1600, 10));

    }

}
