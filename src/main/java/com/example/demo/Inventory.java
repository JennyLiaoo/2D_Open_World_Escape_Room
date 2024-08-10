package com.example.demo;
/**
 * inventory which stores items
 *
 * @author  Jenny Liao
 * @version 4.0
 * @since   2024-05-27
 */
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import java.util.ArrayList;
public class Inventory{
    //attributes
    private Item[][] items;
    public static final Image inventory = new Image("Inventory.png");
    public static final int x = 48;
    public static final int y = 45;
    protected int counter1;
    protected int counter2;
    protected int counter3;
    protected boolean inventoryOn;
    private Player user;
    public Inventory(Gameboard gameboard, Player player) {
        items = new Item[7][3];
        counter1 = 0;
        counter2 = 0;
        counter3 = 0;
        inventoryOn = false;
        user = player;

    }

    /**
     * draws the inventory depending on where the player is
     * @param pen, GraphicsContext
     */
    public void draw(GraphicsContext pen) {     //fix placement of obj
        if(inventoryOn) {
            double inventoryXPos = user.getPos().getX() - 140;
            double inventoryYPos = user.getPos().getY() + 50;

            pen.drawImage(inventory, inventoryXPos, inventoryYPos, 350, 200);
            for(int j = 0; j < items[0].length; j++) {
                for(int i = 0; i < items.length; i++) {
                    if(items[i][j] != null) {
                        items[i][j].position.setPos(15 + inventoryXPos + i * x, 70+inventoryYPos + j * y);
                        items[i][j].setSize(35);
                        items[i][j].draw(pen);
                    }

                }
            }
        }
    }
    /**
     * adds item to the inventory
     * @param obtained, Item
     * @param x, int
     * @param y, int
     */
    public boolean addItem(Item obtained, int x, int y) {        //add item to player inventory
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        if(items[x][y] == null) {
            items[x][y] = obtained;
            return true;
        }
        return false;
    }
    public GameObject getItem(int xInventory, int yInventory){        //get item from player inventory
        return items[xInventory][yInventory];
    }

    /**
     * checks if inventory contains everything that the password requires
     * @return boolean
     */
    public boolean checkPassword() {
        int[] itemIDPassword = {22, 21, 5, 20, 7, 8, 19, 23, 18, 29, 30, 2, 36, 37};
        int[] givenID = new int[14];

        int counter = 0;
        for(int i = 0; i < 7; i++) {
            if(items[i][1] == null) {
                return false;
            }
            if(items[i][2] == null) {
                return false;
            }
        }

        //adds first row to array
        for(int i = 0; i < 7; i++) {
            givenID[i] = items[i][1].getID();
        }
        //adds second row to array
        for(int i = 0; i < 7; i++) {
            givenID[i+7] = items[i][2].getID();
        }

        //compare the id of the given objects to the password
        for (int i = 0; i < 14; i++) {
            for (int j = 0; j < 14; j++) {
                if(givenID[i] == itemIDPassword[j]) {
                    counter++;
                }
            }
        }
        return counter == 14;
    }

    /**
     * removes item from the inventory
     * @param x, int
     * @param y, int
     * @return GameObject
     */
    public GameObject removeItem(int x, int y) {
                GameObject g = items[x][y];

                items[x][y] = null;
                System.out.println(counter1);

                return g;
            }
        }

