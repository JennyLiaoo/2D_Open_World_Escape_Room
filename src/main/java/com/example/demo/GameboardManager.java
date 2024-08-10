package com.example.demo;
/**
 * Gameboard manager which manages everything when the game starts. It contains the player and the current gameboard while checking for the collisions between objects
 *
 * @author  Jenny Liao
 * @version 4.0
 * @since   2024-05-27
 */
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

import java.util.ArrayList;

public class GameboardManager implements Drawable{
    private final Gameboard gameboard, gameboard2, gameboard3, gameboard4, gameboard5, gameboard6, gameboard7, gameboard8, gameboard9;
    protected boolean gameBoardSwitched;
    protected Player player;
    protected int previousGameboard;
    protected int gameboardNumber;
    protected final BoundaryHandler boundaryHandler = new BoundaryHandler();
    protected Inventory inventory;
    protected boolean won = false;
    protected Gameboard currentGameboard;
    protected GameboardSwapper gameboardSwapper;

    public GameboardManager() {
        player = new Player(5, 400, 10, 770, 700);
        gameboard = new OutsideGameboard();
        gameboard2 = new EntranceGameboard();
        gameboard3 = new StatueGameboard();
        gameboard4 = new CellGameboard();
        gameboard5 = new GardenGameboard();
        gameboard6 = new DarkGameboard();
        gameboard7 = new RoomGameboard();
        gameboard8 = new StairsGameboard();
        gameboard9 = new EndGameboard();
        gameboardNumber = 0;
        inventory = new Inventory(gameboard, player);
        currentGameboard = gameboard;
        gameBoardSwitched = false;
        previousGameboard = 0;
        gameboardSwapper = new GameboardSwapper(gameboard, gameboard2,gameboard3,gameboard4,gameboard5,gameboard6,gameboard7,gameboard8);
    }
    /**
     * Checks to see if the player has triggered a scene change. If not, draw current scene. If yes, change scene
     * @param pen, GraphicsContext
     */
    @Override
    public void draw(GraphicsContext pen) {
        double xPos = player.getXPos();
        double yPos = player.getYPos();
        currentGameboard.setPlayerPos(xPos, yPos);
        checkWin();
        boolean swapped = gameboardSwapper.swapGameboard(xPos, yPos, gameboardNumber);
        if(swapped) {
            this.previousGameboard = gameboardSwapper.previousGameboard;
            this.gameboardNumber = gameboardSwapper.gameboardNumber;
            this.currentGameboard = gameboardSwapper.currentGameboard;
            gameBoardSwitched = true;
        } else if (xPos < 1600 && xPos > 0 && yPos > 0 && yPos < 1400) {
            currentGameboard.draw(pen);
            for (int numObs = 0; numObs < currentGameboard.getBoundaries().size(); numObs++) {
                player.handleCollision(currentGameboard.getBoundaries());
            }
        }
        drawCutscene(pen);
    }
    /**
     * draws the player
     * @param pen, GraphicsContext
     */
    public void drawPlayer(GraphicsContext pen) {
        player.setPos(boundaryHandler.checkX(player.getPos().getX()), boundaryHandler.checkY(player.getPos().getY()));
        player.draw(pen);
        gameboard.setPlayerPos(player.getPos().getX(), player.getPos().getY());
        inventory.draw(pen);
        drawProfile(pen);
    }
    /**
     * checks if the game has been completed
     */
    public void checkWin() {
        if(inventory.checkPassword()) {
            won = true;
            currentGameboard = gameboard9;
        }
    }
    /**
     * checks if the player is colliding with an item and draws its profile
     * @param pen, GraphicsContext
     */
    public void drawProfile(GraphicsContext pen) {
        for(int i = 0; i < currentGameboard.getObjects().size(); i++){
            currentGameboard.getObjects().get(i).profile.profileOn = false;
            boolean interacting = player.checkCollision(currentGameboard.getObjects().get(i));
            if (interacting) {
                currentGameboard.getObjects().get(i).profile.profileOn = true;
                currentGameboard.getObjects().get(i).profile.updateProfilePos(currentGameboard.getObjects().get(i).position);
                currentGameboard.getObjects().get(i).profile.draw(pen);
            }
        }
    }

    /**
     * checks if the player is colliding with an item and draws its profile if it is colliding
     * @param pen, GraphicsContext
     * @param interactionType, String
     * @param x, int
     * @param y, int
     */
    public void manageInteraction(String interactionType, GraphicsContext pen, int x, int y) {
        for(int i = 0; i < currentGameboard.getObjects().size(); i++){
            boolean interacting = player.checkCollision(currentGameboard.getObjects().get(i));
            if (interacting) {
                if(interactionType.equals("pick up")) {
                    if(currentGameboard.getObjects().get(i) instanceof HiddenItem) {
                        ((HiddenItem) currentGameboard.getObjects().get(i)).invisibleOn = false;
                    }
                    if(currentGameboard.getObjects().get(i).collectOn && x != -1 && y != -1) {
                            boolean added = inventory.addItem((Item) currentGameboard.getObjects().get(i), x, y);
                            if(added) {
                                currentGameboard.getObjects().remove(currentGameboard.getObjects().get(i));
                            }
                    }
                }
            }
        }
    }
    /**
     * draws the current gameboard's cutscene if it hasn't already been seen
     * @param pen, GraphicsContext
     */
    public void drawCutscene(GraphicsContext pen) {
        if(!currentGameboard.cutScene.seen) {
            currentGameboard.cutScene.cutSceneOn = true;
            currentGameboard.cutScene.setPos(player.getXPos(), player.getYPos());
            currentGameboard.cutScene.draw(pen);
        } else {
            currentGameboard.cutScene.cutSceneOn = false;
        }
    }
    /**
     * removes an item from the inventory given the item's coordinates
     * @param x, int
     * @param y, int
     */
    public void removeItem(int x, int y) {
        if(inventory.getItem(x, y) != null) {
            GameObject g = inventory.removeItem(x, y);
            g.position = new PVector(player.getXPos(), player.getYPos());
            currentGameboard.getObjects().add(g);
        }
    }
    public Player getPlayer() {
        return player;
    }
}