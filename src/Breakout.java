import acm.graphics.GImage;
import acm.graphics.GObject;
import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.graphics.GLabel;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;
import stanford.cs106.audio.StdAudio;

import java.awt.*;
import java.awt.event.MouseEvent;

public class Breakout extends GraphicsProgram {

    // Breakout CONSTANTS
    private static final int CANVAS_WIDTH = 655;
    private static final int CANVAS_HEIGHT = 720;
    private static final double BRICK_Y_OFFSET = 60;   // from top
    private static final double cx = CANVAS_WIDTH/2;
    private static final double cy = 60;   // from top

    private static final double PADDLE_WIDTH = 80;
    private static final double PADDLE_HEIGHT = 12;
    private static final double PADDLE_Y_OFFSET = 30;    // from bottom

    private static final double BALL_RADIUS = 12;
    private static final double VELOCITY_Y = 6.0;
    private static final double VELOCITY_X_MIN = 2.0;
    private static final double VELOCITY_X_MAX = 4.0;
    private static final int BALL_DELAY = 1000 / 60;

    private static final int NTURNS = 3;

    // Breakout class variables: main actors in the app
    private gamePaddle paddle = new gamePaddle();
    private gameBall ball = new gameBall();
    private GLabel display;
    private GLabel score;

    // Ball velocity
    private double dx;
    private double dy;

    private RandomGenerator rgen = RandomGenerator.getInstance();
    int points = 0;

    public void run() {
        setTitle("LBYCPEI Breakout");
        setSize(new Dimension(CANVAS_WIDTH,CANVAS_HEIGHT));
        drawBricks();
        gameBall();
        gamePaddle();
        int tries = 3;

        for(int i=0; i < NTURNS; i++) {
            //displays number of tries
            display = new GLabel("Tries: " + tries);
            add(display, 12, 24);
            //display score
            score = new GLabel("Score: " + points);
            add(score, 570, 24);
            playGame();
            if(brickCounter == 0) {
                ball.setVisible(false);
                printWinner();
                break;
            }
            if(brickCounter > 0) {
                remove(ball);
                gameBall();
                remove(display);
                remove(score);
                tries -= 1;
            }
        }
        if(brickCounter > 0) {
            printGameOver();
        }
    }

    //drawing all the bricks necessary for the game
    private void drawBricks() {
        drawBricks bricks = new drawBricks();
        add(bricks);
    }

    private void gamePaddle() {
        add(paddle, 0.5 * (getWidth() - PADDLE_WIDTH), getHeight() - PADDLE_Y_OFFSET - PADDLE_HEIGHT);
        addMouseListeners();
    }

    public void mouseMoved(MouseEvent mouse) {
        int mouse_x = mouse.getX();
        if (mouse_x > (0.5 * PADDLE_WIDTH) && (mouse_x < (getWidth() - 0.5 * PADDLE_WIDTH))) {
            paddle.setLocation(mouse_x - 0.5 * PADDLE_WIDTH, paddle.getY());
        }
    }


    private void gameBall() {
        add(ball, 0.5 * getWidth() - BALL_RADIUS, 0.5 * getWidth() - BALL_RADIUS);
    }

    private void playGame() {
        waitForClick();
        getBallVelocity();
        while (true) {
            moveBall();
            if (ball.getY() >= getHeight()) {
                break;
            }
            if(brickCounter == 0) {
                break;
            }
        }
    }

    private void getBallVelocity() {
        dy = VELOCITY_Y;
        dx = rgen.nextDouble(VELOCITY_X_MIN, VELOCITY_X_MAX);
        if (rgen.nextBoolean(0.5)) {
            dx = -dx;
        }
    }

    private void moveBall() {
        ball.move(dx,dy);
        //check for walls
        //need to get vx and vy at the point closest to 0 or the other edge
        if ((ball.getX() - dx <= 0 && dx < 0 )|| (ball.getX() + dx >= (getWidth() - BALL_RADIUS*2) && dx>0)) {
            dx = -dx;
        }
        //We don't need to check for the bottom wall, since the ball can fall through the wall at that point
        if ((ball.getY() - dy <= 0 && dy < 0 )) {
            dy = -dy;
            StdAudio.play("bounce.wav");
        }

        //check for other objects
        GObject collider = getCollidingObject();
        if (collider == paddle) {
            /* We need to make sure that the ball only bounces off the top part of the paddle*/
            if(ball.getY() >= getHeight() - PADDLE_Y_OFFSET - PADDLE_HEIGHT - BALL_RADIUS*2 && ball.getY() < getHeight() - PADDLE_Y_OFFSET - PADDLE_HEIGHT - BALL_RADIUS*2 + 4) {
                dy = -dy;
                StdAudio.play("bounce.wav");
            }
        }
        //since we lay down a row of bricks, the last brick in the brick wall is assigned the value brick.
        //so we narrow it down by saying that the collier does not equal to a paddle or null,
        //so all that is left is the brick
        else if (collider != null) {
            remove(collider);
            brickCounter--;
            dy = -dy;
            StdAudio.play("bounce.wav");
            remove(score);
            points += 1;
            score = new GLabel("Score: " + points);
            add(score,580,24);
        }
        pause (BALL_DELAY);
    }

    private GObject getCollidingObject() {

        if((getElementAt(ball.getX(), ball.getY())) != null) {
            return getElementAt(ball.getX(), ball.getY());
        }
        else if (getElementAt( (ball.getX() + BALL_RADIUS*2), ball.getY()) != null ){
            return getElementAt(ball.getX() + BALL_RADIUS*2, ball.getY());
        }
        else if(getElementAt(ball.getX(), (ball.getY() + BALL_RADIUS*2)) != null ){
            return getElementAt(ball.getX(), ball.getY() + BALL_RADIUS*2);
        }
        else if(getElementAt((ball.getX() + BALL_RADIUS*2), (ball.getY() + BALL_RADIUS*2)) != null ){
            return getElementAt(ball.getX() + BALL_RADIUS*2, ball.getY() + BALL_RADIUS*2);
        }
        else{
            return null;
        }

    }

    private void printGameOver() {
        GLabel gameOver = new GLabel ("Game Over", getWidth()/2, getHeight()/2);
        gameOver.move(-gameOver.getWidth()/2, -gameOver.getHeight());
        gameOver.setColor(Color.RED);
        add(gameOver);
    }

    private int brickCounter = 200;

    private void printWinner() {
        GLabel Winner = new GLabel ("Winner!!", getWidth()/2, getHeight()/2);
        Winner.move(-Winner.getWidth()/2, -Winner.getHeight());
        Winner.setColor(Color.RED);
        add (Winner);
    }

    /* Solves NoClassDefFoundError */
    public static void main(String[] args) {
        new Breakout().start(args);
    }
}