package com.example.demo;
/**
 * Starts the game loop and handles key clicks
 *
 * @author  Jenny Liao
 * @version 4.0
 * @since   2024-05-27
 */
import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.input.KeyCode;
import javafx.animation.AnimationTimer;

public class HelloApplication extends Application implements EventHandler{
    Stage window;
    Scene scene1;
    private Canvas canvas;
    private GraphicsContext gc;
    private GameboardManager gameboardManager;
    private CanvasTranslator canvasTranslator;
    private int x = -1;
    private int y = -1;
    private AnimationTimer gameAnimation;
    private boolean T, G, B, M, one, two, three, four, five, six, seven = false; //tracks if a key is pressed

    public static void main(String[] args) {
        launch(args);
    }

    /**
     * Sets up the scene/stage
     * @param primaryStage, Stage
     */
    @Override
    public void start(Stage primaryStage) throws Exception{
        this.gameboardManager = new GameboardManager();
        canvas = new Canvas(1600, 1400);
        gc = canvas.getGraphicsContext2D();
        setupGameLoop();

        window = primaryStage;
        window.setTitle("Hello There Buddy");
        StackPane tempLayout = new StackPane();
        tempLayout.getChildren().add(canvas);
        tempLayout.setStyle("-fx-background-color: black;");
        primaryStage.setResizable(false);

        //scene takes in the layout you choose (i.e stackPane), and the size of window
        scene1 = new Scene(tempLayout, 800, 700);
        scene1.setFill(Color.WHITE);
        window.setScene(scene1);

        //setup keyhandling
        MouseClickHandling(scene1);
        setupKeyHandling(scene1);
        setupKeyReleasing(scene1);
        canvasTranslator = new CanvasTranslator(canvas, gameboardManager.player);
        window.show();
    }

    /**
     * tracks if each key is released/not pressed
     * @param mainScene, Scene
     */
    private void setupKeyReleasing(Scene mainScene) {
        mainScene.setOnKeyReleased(event -> {
            if (event.getCode() == KeyCode.Q) { T = false; y = -1;}
            if (event.getCode() == KeyCode.M) { M = false;}
            if(event.getCode() == KeyCode.A) { G = false; y = -1;}
            if(event.getCode() == KeyCode.Z) { B = false; y = -1;}
            if(event.getCode() == KeyCode.DIGIT1) { one = false; x = -1;}
            if(event.getCode() == KeyCode.DIGIT2) { two = false; x = -1;}
            if(event.getCode() == KeyCode.DIGIT3) { three = false; x = -1;}
            if(event.getCode() == KeyCode.DIGIT4) { four = false; x = -1;}
            if(event.getCode() == KeyCode.DIGIT5) { five = false; x = -1;}
            if(event.getCode() == KeyCode.DIGIT6) { six = false; x = -1;}
            if(event.getCode() == KeyCode.DIGIT7) { seven = false; x = -1;}
        });
    }

    /**
     * tracks if a key is pressed down
     * @param mainScene, Scene
     */
    private void setupKeyHandling(Scene mainScene) {
        mainScene.setOnKeyPressed(event -> {
            if(!gameboardManager.currentGameboard.cutScene.cutSceneOn) {
                if(event.getCode() == KeyCode.P) {  //pick up
                    gameboardManager.manageInteraction("pick up", gc, x, y); //picks up item and places in inventory
                }
                if (event.getCode() == KeyCode.W) { //move
                    gameboardManager.getPlayer().move('w');
                    gameboardManager.player.direction = "back";
                    if(gameboardManager.player.getYPos() == gameboardManager.boundaryHandler.checkY(gameboardManager.player.getYPos()) && !gameboardManager.player.checkCollision(gameboardManager.currentGameboard.getBoundaries()) ) {
                        canvas.setTranslateY(canvas.getTranslateY()+10);
                    }
                    gameboardManager.inventory.inventoryOn = false;
                } else if (event.getCode() == KeyCode.D) { //move
                    gameboardManager.getPlayer().move('d');
                    gameboardManager.player.direction = "right";
                    if(gameboardManager.player.getXPos() == gameboardManager.boundaryHandler.checkX(gameboardManager.player.getXPos()) && !gameboardManager.player.checkCollision(gameboardManager.currentGameboard.getBoundaries())) {
                        canvas.setTranslateX(canvas.getTranslateX()-10);
                    }
                    gameboardManager.inventory.inventoryOn = false;
                } else if (event.getCode() == KeyCode.A) { //move
                    gameboardManager.getPlayer().move('a');
                    gameboardManager.player.direction = "left";
                    if(gameboardManager.player.getXPos() == gameboardManager.boundaryHandler.checkX(gameboardManager.player.getXPos()) && !gameboardManager.player.checkCollision(gameboardManager.currentGameboard.getBoundaries())) {
                        canvas.setTranslateX(canvas.getTranslateX()+10);
                    }
                    gameboardManager.inventory.inventoryOn = false;
                } else if (event.getCode() == KeyCode.S) { //move
                    gameboardManager.getPlayer().move('s');
                    gameboardManager.player.direction = "front";
                    if(gameboardManager.player.getYPos() == gameboardManager.boundaryHandler.checkY(gameboardManager.player.getYPos()) &&  !gameboardManager.player.checkCollision(gameboardManager.currentGameboard.getBoundaries())) {
                        canvas.setTranslateY(canvas.getTranslateY()-10);
                    }
                    gameboardManager.inventory.inventoryOn = false;
                } else if (event.getCode() == KeyCode.I) {gameboardManager.inventory.inventoryOn = true;}
                else if(event.getCode() == KeyCode.X) {gameboardManager.inventory.inventoryOn = false;}
                else if (event.getCode() == KeyCode.T) { T = true; y = 0;}
                else if (event.getCode() == KeyCode.M) { M = true;}
                else if(event.getCode() == KeyCode.G) { G = true; y = 1;}
                else if(event.getCode() == KeyCode.B) { B = true; y = 2;}
                else if(event.getCode() == KeyCode.DIGIT1) { one = true; x = 0;}
                else if(event.getCode() == KeyCode.DIGIT2) { two = true; x = 1;}
                else if(event.getCode() == KeyCode.DIGIT3) { three = true; x = 2;}
                else if(event.getCode() == KeyCode.DIGIT4) { four = true; x = 3;}
                else if(event.getCode() == KeyCode.DIGIT5) {five = true; x = 4;}
                else if(event.getCode() == KeyCode.DIGIT6) { six = true; x = 5;}
                else if(event.getCode() == KeyCode.DIGIT7) { seven = true; x = 6;}
            }
        });
    }
    /**
     * tracks if a mouse is clicked and changes cutscene
     * @param mainScene, Scene
     */
    private void MouseClickHandling(Scene mainScene) {mainScene.setOnMouseClicked(event -> {gameboardManager.currentGameboard.cutScene.dialogueCounter++;});}

    /**
     * Sets up gameloop, drawing the gameboard
     */
    private void setupGameLoop() {
        gameAnimation = new AnimationTimer() {
            @Override
            public void handle(long now) {
                gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
                gameboardManager.draw(gc);
                if(gameboardManager.inventory.inventoryOn) {removeInventory();}
                if(gameboardManager.gameBoardSwitched) {
                    gameboardManager.gameBoardSwitched = false;
                    canvasTranslator.translateCanvas(gameboardManager.gameboardNumber, gameboardManager.currentGameboard.cutScene.seen, gameboardManager.previousGameboard);
                } if(!gameboardManager.currentGameboard.cutScene.cutSceneOn) {
                    gameboardManager.drawPlayer(gc);
                }
            }
        };
        gameAnimation.start();
    }
    /**
     * removes item in given spot from inventory
     */
    private void removeInventory() {
        if(x != -1 && y != -1) {
            if(M) {
                gameboardManager.removeItem(x, y);
            }
        }
    }
    @Override
    public void handle(Event event) {}
}