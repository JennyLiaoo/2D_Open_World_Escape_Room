/**
 * This translates the canvas, making the camera view follow the player's world position changes whenever a gameboard is switched..
 *
 * @author  Jenny Liao
 * @version 4.0
 * @since   2024-05-28
 */
package com.example.demo;

import javafx.scene.canvas.Canvas;

public class CanvasTranslator {
    protected Canvas canvas;
    protected Player player;
    public CanvasTranslator(Canvas c, Player player) {
        canvas = c;
        this.player = player;
    }

    /**
     * Translates the canvas a certain amount depending on which gameboard it has been switched to, which gameboard the player came from, and if the cutscene had already been seen.
     * @param gameboardNumber, int
     * @param cutSceneSeen, boolean
     * @param previousGameboard, int
     */
    public void translateCanvas(int gameboardNumber, boolean cutSceneSeen, int previousGameboard) {
        if (gameboardNumber == 0) {
            canvas.setTranslateX((0));
            canvas.setTranslateY((100));
            player.setPos(770, 600);
        } else if (gameboardNumber == 1) {
            if(!cutSceneSeen) {
                canvas.setTranslateX((0));
                canvas.setTranslateY((-320));
                player.setPos(770, 1020);
            } else if(previousGameboard == 0){
                canvas.setTranslateX((0));
                canvas.setTranslateY((-620));
                player.setPos(770, 1320);
            } else if(previousGameboard == 2){
                canvas.setTranslateX((720));
                canvas.setTranslateY((-600));
                player.setPos(50, 1300);
            } else if(previousGameboard == 3){
                canvas.setTranslateX((650));
                canvas.setTranslateY((-500));
                player.setPos(120, 1200);
            } else if(previousGameboard == 4){
                canvas.setTranslateX((-410));
                canvas.setTranslateY((-120));
                player.setPos(1160, 820);
            } else if(previousGameboard == 5){
                canvas.setTranslateX((-770));
                canvas.setTranslateY((-620));
                player.setPos(1520, 1320);
            } else if(previousGameboard == 6){
                canvas.setTranslateX((-110));
                canvas.setTranslateY((470));
                player.setPos(860, 230);
            } else if(previousGameboard == 7){
                canvas.setTranslateX((510));
                canvas.setTranslateY((470));
                player.setPos(260, 230);
            }
        } else if (gameboardNumber == 2) {
            if(!cutSceneSeen) {
                canvas.setTranslateX((-400));
                canvas.setTranslateY((30));
                player.setPos(1160, 670);
            } else {
                canvas.setTranslateX((-700));
                canvas.setTranslateY((-100));
                player.setPos(1460, 800);
            }
        } else if (gameboardNumber == 3) {
            if(!cutSceneSeen) {
                canvas.setTranslateX((-400));
                canvas.setTranslateY((-240));
                player.setPos(1160, 940);
            } else {
                canvas.setTranslateX((-640));
                canvas.setTranslateY((-340));
                player.setPos(1400, 1040);
            }

        } else if (gameboardNumber == 4) {
            if(!cutSceneSeen) {
                canvas.setTranslateX((-30));
                canvas.setTranslateY((-350));
                player.setPos(790, 1050);
            } else {
                canvas.setTranslateX((-30));
                canvas.setTranslateY((-650));
                player.setPos(790, 1350);
            }

        }else if (gameboardNumber == 5) {
            if(!cutSceneSeen) {
                canvas.setTranslateX((-30));
                canvas.setTranslateY((-350));
                player.setPos(790, 1050);
            } else {
                canvas.setTranslateX((-340));
                canvas.setTranslateY((-700));
                player.setPos(1100, 1300);
            }

        } else if (gameboardNumber == 6) {
            if(!cutSceneSeen) {
                canvas.setTranslateX((-30));
                canvas.setTranslateY((-350));
                player.setPos(790, 1050);
            } else {
                canvas.setTranslateX((-10));
                canvas.setTranslateY((-630));
                player.setPos(770, 1330);
            }
        }
        else if (gameboardNumber == 7) {
            if(!cutSceneSeen) {
                canvas.setTranslateX((-30));
                canvas.setTranslateY((-350));
                player.setPos(790, 1050);
            } else {
                canvas.setTranslateX((-10));
                canvas.setTranslateY((-630));
                player.setPos(770, 1330);
            }
        }

    }

}

