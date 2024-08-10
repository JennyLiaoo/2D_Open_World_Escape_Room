package com.example.demo;
/**
 * Creates the objects, background, and boundaries within the EntranceGameboard
 *
 * @author  Jenny Liao
 * @version 2.0
 * @since   2024-05-27
 */
import javafx.scene.image.Image;


public class OutsideGameboard extends Gameboard{
    //constructor which creates/initializes all the images to be drawn
    public OutsideGameboard() {
        background = new Image("FirstScene.png");
        cutsceneDialogue.add(new Image("ForestDialogue1.png"));
        cutsceneDialogue.add(new Image("ForestDialogue2.png"));
        cutsceneDialogue.add(new Image("ForestDialogue3.png"));
        cutsceneDialogue.add(new Image("ForestDialogue4.png"));
        cutsceneDialogue.add(new Image("ForestDialogue5.png"));
        cutsceneDialogue.add(new Image("ForestDialogue6.png"));
        cutsceneDialogue.add(new Image("ForestDialogue7.png"));
        cutsceneDialogue.add(new Image("ForestDialogue8.png"));
        cutsceneDialogue.add(new Image("ForestDialogue9.png"));
        cutsceneDialogue.add(new Image("ForestDialogue10.png"));
        cutsceneDialogue.add(new Image("ForestDialogue11.png"));

        //cutscene background
        cutScene = new CutScene(cutsceneDialogue, new Image("forestCutscene.png"));

        //establishing boundaries
        boundaries.add(new Boundary(0, 0, 180, 1400));    //left side
        boundaries.add(new Boundary(0,0,1600,480));      //top side
        boundaries.add(new Boundary(460,460,680,100));      //castle entrance
        boundaries.add(new Boundary(1420,0,180,1400));      //right side
        boundaries.add(new Boundary(0,1180,1600,400));      //bottom side
        boundaries.add(new Boundary(1180,1360,600,40));      //hole boundary
        //Objects in the gameboard
        gameObjects.add(new QuestItem(770, 800, 1, "Enveloppe.png", 60, "welcome home",  330, 430, new Image("introduction.png"), true));
        gameObjects.add(new WeaponItem(1180, 1150, 2, "Ax.png", 60, "axe", 0,0,0,320, 180, new Image("AxeProfile.png"), true));//*
        gameObjects.add(new HiddenItem(770, 540, 3, "WhiteKey.png", 60, "key to somewhere", 320, 180, new Image("WhiteKeyProfile.png"), true));
        gameObjects.add(new SimpleItem(350, 480, 4, "Tree.png", 60, "tree.", 320, 180, new Image("TreeProfile.png"), false));
        gameObjects.add(new HiddenItem(220, 1000, 5, "starfish.png", 150, "teleport", 320, 180, new Image("StarfishProfile.png"), true));//*
        gameObjects.add(new HiddenItem(350, 550, 20, "GoldCoin.png", 150, "teleport", 320, 180, new Image("GoldCoinProfile.png"), true));//*

    }

}
