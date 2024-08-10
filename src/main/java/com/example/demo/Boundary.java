/**
 * Creates a black rectangle that the player cannot pass
 *
 * @author  Jenny Liao
 * @version 2.0
 * @since   2024-05-27
 */
package com.example.demo;

//import libraries
import javafx.scene.paint.Color;
import javafx.scene.canvas.GraphicsContext;


public class Boundary extends GameObject   { //the boundary is a gameObject
    //all final values as the boundary does not move relative to the world.
    private final Color color = Color.BLACK;
    private final int xPos;
    private final int yPos;
    private final int width;
    private final int height;

    //constructor
    public Boundary(int x, int y, int w, int h) {
        xPos = x;
        yPos = y;
        width = w;
        height = h;
    }

    /**
     * draws the rectangle
     * @param pen, GraphicsContext
     */
    public void draw(GraphicsContext pen) {
        //set the color
        pen.setFill(color);

        //drawing and filling the rectangle
        pen.beginPath();
        pen.lineTo(xPos, yPos);
        pen.lineTo(xPos + width, yPos);
        pen.lineTo(xPos + width, yPos + height);
        pen.lineTo(xPos, yPos + height);
        pen.fill();
        pen.closePath();
        pen.stroke();
    }

    //getters and setters
    public double getXPos() {
        return xPos;
    }
    public double getYPos() {
        return yPos;
    }
    public double getWidth() {
        return width;
    }
    public double getHeight() {
        return height;
    }


    //a method that could be used to extend the project in the future
    @Override
    public String interact() {
        return "boundary";
    }
}
