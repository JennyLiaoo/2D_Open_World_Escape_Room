package com.example.demo;
/**
 * Creates the objects, background, and boundaries within the StatueGameboard
 *
 * @author  Jenny Liao
 * @version 2.0
 * @since   2024-05-27
 */
import javafx.scene.image.Image;


public class StatueGameboard extends Gameboard{
    //constructor which creates/initializes all the images to be drawn
    public StatueGameboard() {

        background = new Image("StatueScene.png");
        cutsceneDialogue.add(new Image("StatueDialogue1.png"));
        cutsceneDialogue.add(new Image("StatueDialogue2.png"));
        cutsceneDialogue.add(new Image("StatueDialogue3.png"));
        cutsceneDialogue.add(new Image("StatueDialogue4.png"));
        cutsceneDialogue.add(new Image("StatueDialogue5.png"));
        cutsceneDialogue.add(new Image("StatueDialogue6.png"));


        cutScene = new CutScene(cutsceneDialogue, new Image("Statue.png"));
        //establishing boundaries
        boundaries.add(new Boundary(0, 0, 800, 1400));    //left side
        boundaries.add(new Boundary(0,0,1600,480));      //top side
        boundaries.add(new Boundary(0,1180,1600,400));      //bottom side

        boundaries.add(new Boundary(1330, 490, 270, 230));
        boundaries.add(new Boundary(1290,900,310,520));      //top side
        boundaries.add(new Boundary(0,1180,1600,400));      //bottom side

        //Objects in the gameboard
        gameObjects.add(new QuestItem(840, 600, 6, "Enveloppe.png", 60, "Morse code",  470, 100, new Image("MorseCode.png"), false));
        gameObjects.add(new SimpleItem(810, 930, 7, "BluePendant.png", 60, "Morse code",  320, 180, new Image("BluePendantProfile.png"), true)); //*
        gameObjects.add(new SimpleItem(1300, 500, 8, "Crown.png", 60, "Morse code",  320, 180, new Image("CrownProfile.png"), true)); //*
        gameObjects.add(new SimpleItem(1200, 840, 9, "Feather.png", 60, "Morse code",  320, 180, new Image("FeatherProfile.png"), true));
        gameObjects.add(new SimpleItem(840, 450, 10, "Gold.png", 60, "Morse code",  320, 180, new Image("GoldProfile.png"), true));
        gameObjects.add(new SimpleItem(870, 1090, 11, "BlueCoral1.png", 60, "Morse code",  320, 180, new Image("BlueCoralProfile.png"), true));
        gameObjects.add(new SimpleItem(860, 720, 12, "Shell.png", 60, "Morse code",  320, 180, new Image("ShellProfile.png"), true));
        gameObjects.add(new WeaponItem(1130, 1120, 13, "Hook.png", 60, "Morse code",  0,0,0,320, 180, new Image("HookProfile.png"), true));
    }
}
