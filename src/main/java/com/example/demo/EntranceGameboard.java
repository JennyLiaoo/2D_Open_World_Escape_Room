/**
 * Creates the objects, background, and boundaries within the EntranceGameboard
 *
 * @author  Jenny Liao
 * @version 2.0
 * @since   2024-05-27
 */
package com.example.demo;

import javafx.scene.image.Image;


public class EntranceGameboard extends Gameboard{

    //constructor which creates/initializes all the images to be drawn
    public EntranceGameboard() {
        background = new Image("Entrance.png");
        cutsceneDialogue.add(new Image("EntranceDialogue1.png"));
        cutsceneDialogue.add(new Image("EntranceDialogue2.png"));
        cutsceneDialogue.add(new Image("EntranceDialogue3.png"));
        cutsceneDialogue.add(new Image("EntranceDialogue4.png"));
        cutsceneDialogue.add(new Image("EntranceDialogue5.png"));
        cutsceneDialogue.add(new Image("EntranceDialogue6.png"));
        cutsceneDialogue.add(new Image("EntranceDialogue7.png"));

        //cutscene background
        cutScene = new CutScene(cutsceneDialogue, new Image("EntranceCutscene.png"));

        //establishing boundaries
        boundaries.add(new Boundary(0, 0, 1600, 200)); //top side
        boundaries.add(new Boundary(0, 800, 240, 370)); //left side
        boundaries.add(new Boundary(240, 400, 400, 390)); //middle left side
        boundaries.add(new Boundary(960, 400, 400, 390)); //middle right side
        boundaries.add(new Boundary(1360, 760, 240, 390)); //right side
        boundaries.add(new Boundary(520, 790, 120, 210)); //columns left up
        boundaries.add(new Boundary(960, 790, 130, 210)); //columns right up
        boundaries.add(new Boundary(0, 1380, 1600, 20)); //bottom
        boundaries.add(new Boundary(610, 1000, 30, 130)); //column left up bottom
        boundaries.add(new Boundary(960, 1000, 30, 130)); //columns right up bottom
        boundaries.add(new Boundary(620, 1215, 30, 210)); //columns bottom left
        boundaries.add(new Boundary(950, 1215, 30, 210)); // column bottom left
        boundaries.add(new Boundary(0, 0, 10, 1400)); //columns bottom left
        boundaries.add(new Boundary(1590, 0, 10, 1400)); // column bottom left

        //Objects in the gameboard
        gameObjects.add(new WeaponItem(1300, 1130, 18, "Sword.png", 60, "Morse code",  0,0,0,300, 160, new Image("SwordProfile.png"), true)); //*
        gameObjects.add(new HiddenItem(860, 250, 21, "RedJewel.png", 60, "Morse code",  320, 180, new Image("RedJewelProfile.png"), true)); //*

    }

}
