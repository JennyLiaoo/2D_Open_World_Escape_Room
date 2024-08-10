package com.example.demo;
/**
 * The player which the user controls
 *
 * @author  Jenny Liao
 * @version 4.0
 * @since   2024-05-27
 */
import javafx.scene.image.Image;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;


import java.util.ArrayList;

public class Player extends Entity{
    private Image user;
    private int atk;
    private int hp;
    private int spd;
    protected Image up1, up2, back1, back2, left1, left2, right1, right2;
    protected int counter;
    protected String direction;
    public Player(int atk, int hp, int spd, double x, double y) {
        size = 50;
        this.position= new PVector(x, y);
        this.velocity = new PVector(0, 0);
        user = new Image("0spaceshipCropped.png");
        up1 = new Image("up1.png");
        up2 = new Image("up2.png");
        back1 = new Image("back1.png");
        back2 = new Image("back2.png");
        right1 = new Image("right1.png");
        right2 = new Image("right2.png");
        left1 = new Image("left1.png");
        left2 = new Image("left2.png");
        direction = "front";
        counter = 0;

    }




    /**
     * changing the player picture depending on user input
     * @param pen, GraphicsContext
     */
    @Override
    public void draw(GraphicsContext pen) {
        move();
        pen.setFill(Color.TRANSPARENT);
        pen.fillRect(position.getX(), position.getY(), size, size);
        if(direction.equals("front")) {
            if(counter < 15) {
                pen.drawImage(up1, position.getX(), position.getY(), size, size);
                counter++;
            }
            else if(counter < 30) {
                pen.drawImage(up2, position.getX(), position.getY(), size, size);
                counter++;
            }
            else {
                pen.drawImage(up1, position.getX(), position.getY(), size, size);
                counter = 0;
            }
        }
        else if (direction.equals("right")) {
            if(counter < 15) {
                pen.drawImage(right1, position.getX(), position.getY(), size, size);
                counter++;
            }
            else if(counter < 30) {
                pen.drawImage(right2, position.getX(), position.getY(), size, size);
                counter++;
            }
            else {
                pen.drawImage(right1, position.getX(), position.getY(), size, size);
                counter = 0;
            }
        }
        else if (direction.equals("left")) {
            if(counter < 15) {
                pen.drawImage(left1, position.getX(), position.getY(), size, size);
                counter++;
            }
            else if(counter < 30) {
                pen.drawImage(left2, position.getX(), position.getY(), size, size);
                counter++;
            }
            else {
                pen.drawImage(left1, position.getX(), position.getY(), size, size);
                counter = 0;
            }
        }
        else if (direction.equals("back")) {
            if(counter < 15) {
                pen.drawImage(back1, position.getX(), position.getY(), size, size);
                counter++;
            }
            else if(counter < 30) {
                pen.drawImage(back2, position.getX(), position.getY(), size, size);
                counter++;
            }
            else {
                pen.drawImage(back1, position.getX(), position.getY(), size, size);
                counter = 0;
            }
        }

    }


    /**
     * Handles the player's collision with gameobjects
     * @param gameObject, ArrayList<GameObject>
     */
    public void handleCollision(ArrayList<GameObject> gameObject) {
        for(int i = 0; i < gameObject.size(); i++) {
            double obsX = gameObject.get(i).getXPos();
            double obsY = gameObject.get(i).getYPos();
            double obsW = gameObject.get(i).getWidth();
            double obsH = gameObject.get(i).getHeight();
            if (position.getX() + size >= obsX && position.getX() <= obsX + obsW && position.getY() == obsY + obsH) { //check bottom of the obs
                position.setPos(position.getX(), position.getY() + 10);
            } // check the left side of the obstacle
            else if (position.getY() + size >= obsY && position.getY() <= obsY + obsH && position.getX() + size == obsX) {
                position.setPos(position.getX() - 10, position.getY());
            } else if (position.getX() + size >= obsX && position.getX() <= obsX + obsW && position.getY() + size == obsY) { //check top
                position.setPos(position.getX(), position.getY() - 10);
            } else if (position.getY() + size >= obsY && position.getY() <= obsY + obsH && position.getX() == obsX + obsW) {
                position.setPos(position.getX() + 10, position.getY());
            }
        }
    }
    public void setPos(double x, double y) { position = new PVector(x, y);}

    /**
     * Checks the player's collision with gameobjects
     * @param gameObject, ArrayList<GameObject>
     */
    public boolean checkCollision(ArrayList<GameObject> gameObject) {
        for(int i = 0; i < gameObject.size(); i++) {
            double obsX = gameObject.get(i).getXPos();
            double obsY = gameObject.get(i).getYPos();
            double obsW = gameObject.get(i).getWidth();
            double obsH = gameObject.get(i).getHeight();
            if (position.getX() + size >= obsX && position.getX() <= obsX + obsW && position.getY() == obsY + obsH) { //check bottom of the obs
                return true;
            } // check the left side of the obstacle
            else if (position.getY() + size >= obsY && position.getY() <= obsY + obsH && position.getX() + size == obsX) {
                return true;
            } else if (position.getX() + size >= obsX && position.getX() <= obsX + obsW && position.getY() + size == obsY) { //check top
                return true;
            } else if (position.getY() + size >= obsY && position.getY() <= obsY + obsH && position.getX() == obsX + obsW) {
                return true;
            }
        }
        return false;
    }
    /**
     * Checks the player's collision with a single gameobject
     * @param gameObject, GameObject
     */
    public boolean checkCollision(GameObject gameObject) {
        double obsX = gameObject.getXPos();
        double obsY = gameObject.getYPos();
        double obsW = gameObject.getWidth();
        double obsH = gameObject.getHeight();
        if (position.getX() + size >= obsX && position.getX() <= obsX && position.getY() >= obsY && position.getY() + size <= obsY + obsH) { //if player covers entire thing
            return true;
        } // check the left side of the obstacle

        else if (position.getX() >= obsX && position.getX() <= obsX + obsW && position.getY() + size >= obsY && position.getY() + size <= obsY + obsH) {   //check player's bottom left corner
            return true;
        }
        else if (position.getX() >= obsX && position.getX() <= obsX + obsW && position.getY() >= obsY && position.getY() <= obsY + obsH) { //check top left corner
            return true;
        }
        else if (position.getX() + size >= obsX && position.getX() + size <= obsX + obsW && position.getY() >= obsY && position.getY() <= obsY + obsH) { //check top right corner
            return true;
        }
        else if (position.getX() + size >= obsX && position.getX() + size <= obsX + obsW && position.getY() + size >= obsY && position.getY() + size <= obsY + obsH) { // botton right corner
            return true;
        }
        return false;
    }

    @Override
    public double getXPos() {
        return position.getX();
    }

    @Override
    public double getYPos() {
        return position.getY();
    }

    @Override
    public double getWidth() {
        return size;
    }

    @Override
    public double getHeight() {
        return size;
    }

    @Override
    public String interact() {
        return "attack";
    }
    @Override
    public void move(char direction) {
        super.move(direction);
    }
}
