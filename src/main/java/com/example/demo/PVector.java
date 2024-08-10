package com.example.demo;

/**
 * PVectors for handling positions and velocities!!
 *
 * @author  Jenny Liao
 * @version 4.0
 * @since   2023-12-4
 */
public class PVector {
    protected double x;       //tracks x
    protected double y;       //tracks y
    public PVector() {       //initial Vector position is 0, 0
        this.setPos(0, 0);
    }
    public PVector(double xPos, double yPos) {       //set position of object when created
        this.setPos(xPos, yPos);
    }
    public void setPos(double xPos, double yPos) {  //set position when needed
        x = xPos;
        y = yPos;
    }
    /**
     * PVectors methods for different movements
     */
    public void add(double xAdd, double yAdd) {    //when moving at constant velocity in some direction
        x += xAdd;
        y += yAdd;
    }
    public void mult(double xyMul) {               //moving at constant acceleration at xyMul
        x *= xyMul;
        y *= xyMul;
    }
    public double getSize() {                        //returns size of vector based on xpos and ypos using pythagorean
        return Math.abs(Math.sqrt(x*x + y*y));
    }
    public void setSize(double S) {
        double currentSize = this.getSize();
        if(currentSize==0) {        //check if vector is 0
            setPos(S, 0);
        }
        else{
            this.mult(1/currentSize);      //handles if previous vector exists
            this.mult(S);                         //changes vector size
        }
    }

    public double getX() {return x;}
    public double getY() {return y;}

}
