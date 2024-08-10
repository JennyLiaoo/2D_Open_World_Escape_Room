package com.example.demo;
/**
 * Creates the objects, background, and boundaries within the RoomGameboard
 *
 * @author  Jenny Liao
 * @version 2.0
 * @since   2024-05-27
 */
import javafx.scene.image.Image;


public class RoomGameboard extends Gameboard{
    //constructor which creates/initializes all the images to be drawn
    public RoomGameboard() {
        background = new Image("RoomScene.png");
        cutsceneDialogue.add(new Image("RoomDialogue1.png"));
        cutsceneDialogue.add(new Image("RoomDialogue2.png"));
        cutsceneDialogue.add(new Image("RoomDialogue3.png"));
        cutsceneDialogue.add(new Image("RoomDialogue4.png"));
        cutsceneDialogue.add(new Image("RoomDialogue5.png"));
        cutsceneDialogue.add(new Image("RoomDialogue6.png"));
        //cutscene background
        cutScene = new CutScene(cutsceneDialogue, new Image("Room.png"));
        //establishing boundaries
        boundaries.add(new Boundary(0, 0, 300, 1400));
        boundaries.add(new Boundary(0, 0, 1600, 750));
        boundaries.add(new Boundary(1300, 970, 1600, 750));
        boundaries.add(new Boundary(630, 760, 160, 180));
        boundaries.add(new Boundary(1410, 0, 10, 1400));
        boundaries.add(new Boundary(0, 1320, 620, 50));
        boundaries.add(new Boundary(950, 1320, 620, 50));
        //Objects in the gameboard
        gameObjects.add(new QuestItem(680, 1000, 42, "Enveloppe.png", 60, "Morse code",  200, 100, new Image("TimeHint.png"), true));
        gameObjects.add(new SimpleItem(680, 800, 35, "Clock.png", 60, "Morse code",  320, 180, new Image("introduction.png"), true));
        gameObjects.add(new WeaponItem(420, 760, 36, "gun.png", 60, "Morse code",  0,0,0,320, 180, new Image("GunProfile.png"), true));//*
        gameObjects.add(new WeaponItem(760, 950, 37, "knife.png", 60, "Morse code",  0,0,0,320, 180, new Image("KnifeProfile.png"), true));//*
        gameObjects.add(new SimpleItem(1350, 910, 38, "WhiteCrystals.png", 60, "Morse code",  320, 180, new Image("WhiteCrystalsProfile.png"), true));
        gameObjects.add(new SimpleItem(310, 1260, 39, "pirate.png", 60, "Morse code",  320, 180, new Image("PirateProfile.png"), true));
        gameObjects.add(new SimpleItem(800, 760, 40, "Card.png", 60, "Morse code",  320, 180, new Image("CardProfile.png"), true));

    }
}
