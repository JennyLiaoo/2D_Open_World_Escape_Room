package com.example.demo;
/**
 * Creates the objects, background, and boundaries within the GardenGameboard
 *
 * @author  Jenny Liao
 * @version 2.0
 * @since   2024-05-27
 */
import javafx.scene.image.Image;


public class GardenGameboard extends Gameboard{
    //constructor which creates/initializes all the images to be drawn
    public GardenGameboard() {
        background = new Image("GardenScene.png");
        //cutscene dialogue images
        cutsceneDialogue.add(new Image("GardenDialogue1.png"));
        cutsceneDialogue.add(new Image("GardenDialogue2.png"));
        cutsceneDialogue.add(new Image("GardenDialogue3.png"));
        cutsceneDialogue.add(new Image("GardenDialogue4.png"));
        cutsceneDialogue.add(new Image("GardenDialogue5.png"));
        cutsceneDialogue.add(new Image("GardenDialogue6.png"));
        //cutscene background
        cutScene = new CutScene(cutsceneDialogue, new Image("Garden.png"));

        //establishing boundaries
        boundaries.add(new Boundary(0, 0, 10, 1400));    //left side
        boundaries.add(new Boundary(0,0,500,560));      //top side
        boundaries.add(new Boundary(0,0,1400,100));      //castle entrance
        boundaries.add(new Boundary(1510, 0, 10, 1400));    //left side
        boundaries.add(new Boundary(770,430,390,360));      //top side
        boundaries.add(new Boundary(0,850,570,600));      //castle entrance
        boundaries.add(new Boundary(1070,890,570,600));      //castle entrance

        //Objects in the gameboard
        gameObjects.add(new QuestItem(780, 1100, 41, "Enveloppe.png", 60, "Morse code",  430, 230, new Image("FlowerPuzzle.png"), true));
        gameObjects.add(new SimpleItem(580, 1060, 19, "Mushroom.png", 60, "Morse code",  320, 180, new Image("MushroomProfile.png"), true)); //*
        gameObjects.add(new WeaponItem(550, 280, 29, "greenFlower.png", 60, "Morse code",  0,0,0,320, 180, new Image("GreenFlowerProfile.png"), true));//*
        gameObjects.add(new WeaponItem(1160, 830, 30, "purpleFlower.png", 60, "Morse code",  0,0,0,320, 180, new Image("PurpleFlowerProfile.png"), true));//*

        gameObjects.add(new WeaponItem(1000, 800, 31, "Flower 1 - RED.png", 60, "Morse code",  0,0,0,320, 180, new Image("RedFlowerProfile.png"), true));
        gameObjects.add(new WeaponItem(1010, 1130, 32, "Flower 11 - YELLOW.png", 60, "Morse code",  0,0,0,320, 180, new Image("YellowFlowerProfile.png"), true));
        gameObjects.add(new WeaponItem(380, 790, 33, "Flower 12 - PINK.png", 60, "Morse code",  0,0,0,320, 180, new Image("PinkFlowerProfile.png"), true));
        gameObjects.add(new WeaponItem(20, 610, 34, "Flower 10 - PINK.png", 60, "Morse code",  0,0,0,320, 180, new Image("PinkFlowerProfile2.png"), true));
        gameObjects.add(new WeaponItem(1160, 260, 35, "Flower 1 - BLUE.png", 60, "Morse code",  0,0,0,320, 180, new Image("BlueFlowerProfile.png"), true));

    }

}
