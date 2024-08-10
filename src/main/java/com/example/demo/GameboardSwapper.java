package com.example.demo;
/**
 * Swaps the gameboards if the player has entered an area that triggers a gameboard change
 *
 * @author  Jenny Liao
 * @version 2.0
 * @since   2024-05-27
 */
import javafx.scene.canvas.Canvas;

public class GameboardSwapper {
    protected int previousGameboard;
    protected int gameboardNumber;
    protected Gameboard currentGameboard;
    protected boolean gameBoardSwitched;
    private Gameboard gameboard, gameboard2, gameboard3, gameboard4, gameboard5, gameboard6, gameboard7, gameboard8;
    public GameboardSwapper(Gameboard gameboard1, Gameboard gameboard2, Gameboard gameboard3, Gameboard gameboard4, Gameboard gameboard5, Gameboard gameboard6, Gameboard gameboard7, Gameboard gameboard8 ) {
        this.previousGameboard = 0;
        this.gameboardNumber = 0;
        this.currentGameboard = gameboard1;
        gameBoardSwitched = false;
        this.gameboard = gameboard1;
        this.gameboard2 = gameboard2;
        this.gameboard3 = gameboard3;
        this.gameboard4 = gameboard4;
        this.gameboard5 = gameboard5;
        this.gameboard6 = gameboard6;
        this.gameboard7 = gameboard7;
        this.gameboard8 = gameboard8;


    }

    /**
     * Swaps the gameboard to another depending on the current gameboard and the player's position
     * @param gameboardNumber, int
     * @param yPos, double
     * @param xPos, double
     * @return boolean
     */
    public boolean swapGameboard(double xPos, double yPos, int gameboardNumber) {
        gameBoardSwitched = false;
        if(gameboardNumber == 0 && xPos >= 740 && xPos <= 840 && yPos >= 540 && yPos <= 580) {
            previousGameboard = 0;
            this.gameboardNumber = 1;
            currentGameboard = gameboard2;
            gameBoardSwitched = true;
        } else if (gameboardNumber == 1 && xPos > 70 && xPos < 180 && yPos > 1100 && yPos < 1180) {
            previousGameboard = 1;
            this.gameboardNumber = 3;
            currentGameboard = gameboard4;
            gameBoardSwitched = true;
        } else if (gameboardNumber == 1 && xPos > 1130 && xPos < 1230 && yPos > 780 && yPos < 800) {
            previousGameboard = 1;
            this.gameboardNumber = 4;
            currentGameboard = gameboard5;
            gameBoardSwitched = true;
        } else if (gameboardNumber == 1 && xPos > 1520 && yPos > 1100) {
            previousGameboard = 1;
            this.gameboardNumber = 5;
            currentGameboard = gameboard6;
            gameBoardSwitched = true;
        } else if (gameboardNumber == 1 && xPos > 810 && xPos < 910 && yPos < 215) {
            previousGameboard = 1;
            this.gameboardNumber = 6;
            currentGameboard = gameboard7;
            gameBoardSwitched = true;
        } else if (gameboardNumber == 1 && xPos > 190 && xPos < 340 && yPos < 215) {
            previousGameboard = 1;
            this.gameboardNumber = 7;
            currentGameboard = gameboard8;
            gameBoardSwitched = true;
        } else if (gameboardNumber == 1 && yPos >= 1380-50 && xPos >= 640 && xPos <= 960) {
            previousGameboard = 1;
            this.gameboardNumber = 0;
            currentGameboard = gameboard;
            gameBoardSwitched = true;
        }  else if (gameboardNumber == 1 && xPos < 40 && yPos > 1000) { //switch from entrance to statue scene
            this.gameboardNumber = 2;
            previousGameboard = 1;
            currentGameboard = gameboard3;
            gameBoardSwitched = true;
        } else if (gameboardNumber == 2 && xPos > 1580) {
            this.gameboardNumber = 1;
            previousGameboard = 2;
            currentGameboard = gameboard2;
            gameBoardSwitched = true;
        } else if (gameboardNumber == 3 && yPos > 1090) {
            this.gameboardNumber = 1;
            previousGameboard = 3;
            currentGameboard = gameboard2;
            gameBoardSwitched = true;
        } else if (gameboardNumber == 4 && yPos > 1350) {
            this.gameboardNumber = 1;
            previousGameboard = 4;
            currentGameboard = gameboard2;
            gameBoardSwitched = true;
        } else if (gameboardNumber == 5 && xPos > 1000 && xPos < 1030 && yPos > 1260) {
            this.gameboardNumber = 1;
            previousGameboard = 5;
            currentGameboard = gameboard2;
            gameBoardSwitched = true;
        } else if (gameboardNumber == 6 && yPos > 1350) {
            this.gameboardNumber = 1;
            previousGameboard = 6;
            currentGameboard = gameboard2;
            gameBoardSwitched = true;
        } else if (gameboardNumber == 7 && yPos > 1350) {
            this.gameboardNumber = 1;
            previousGameboard = 7;
            currentGameboard = gameboard2;
            gameBoardSwitched = true;
        }
        return gameBoardSwitched;
    }



}

