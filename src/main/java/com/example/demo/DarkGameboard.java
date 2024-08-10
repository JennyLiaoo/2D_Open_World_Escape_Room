/**
 * Creates the objects, background, and boundaries within the DarkGameboard
 *
 * @author  Jenny Liao
 * @version 2.0
 * @since   2024-05-27
 */
package com.example.demo;

import javafx.scene.image.Image;


public class DarkGameboard extends Gameboard{

    //constructor which creates/initializes all the images to be drawn
    public DarkGameboard() {
        background = new Image("DarkScene.png");

        //cutscene dialogue images
        cutsceneDialogue.add(new Image("DarkDialogue1.png"));
        cutsceneDialogue.add(new Image("DarkDialogue2.png"));
        cutsceneDialogue.add(new Image("DarkDialogue3.png"));
        cutsceneDialogue.add(new Image("DarkDialogue4.png"));
        cutsceneDialogue.add(new Image("DarkDialogue5.png"));
        cutsceneDialogue.add(new Image("DarkDialogue6.png"));

        //cutscene background
        cutScene = new CutScene(cutsceneDialogue, new Image("Dark.png"));

        //establishing boundaries
        boundaries.add(new Boundary(0, 0, 1600, 470));
        boundaries.add(new Boundary(0, 0, 30, 1400));
        boundaries.add(new Boundary(0, 1000, 210, 400));
        boundaries.add(new Boundary(0, 1360, 1600, 10));
        boundaries.add(new Boundary(1560, 0, 10, 1400));

        boundaries.add(new Boundary(0, 470, 600, 110));
        boundaries.add(new Boundary(250, 580, 230, 120));
        boundaries.add(new Boundary(330, 900, 460, 170));
        boundaries.add(new Boundary(1000, 490, 360, 300));
        boundaries.add(new Boundary(910, 1000, 450, 130));
        boundaries.add(new Boundary(900, 1000, 60, 350));
        boundaries.add(new Boundary(520, 790, 100, 100));

        //Objects in the gameboard
        gameObjects.add(ItemFactory.makeItem("simple", new PVector(940, 480), 22, "Compass2.png", "CompassProfile.png", 0,0,true)); //*
        gameObjects.add(ItemFactory.makeItem("weapon", new PVector(250, 950), 23, "necklace.png", "NecklaceProfile.png", 0,0,true)); //*
        gameObjects.add(ItemFactory.makeItem("quest", new PVector(530, 590), 24, "Enveloppe.png", "Book.png", 400,300,true));

        gameObjects.add(ItemFactory.makeItem("simple", new PVector(1370, 560), 25, "Potion1.png", "PotionProfile.png", 0,0,true));
        gameObjects.add(ItemFactory.makeItem("simple", new PVector(820, 950), 26, "Cup.png", "CupProfile.png", 0,0,true));
        gameObjects.add(ItemFactory.makeItem("simple", new PVector(60, 620), 27, "BasketOfFlowers.png", "BasketOfFlowersProfile.png", 0,0,true));
        gameObjects.add(ItemFactory.makeItem("simple", new PVector(410, 870), 28, "SkinnyBlue.png", "BluePotionProfile.png", 0,0,true));
    }


}
