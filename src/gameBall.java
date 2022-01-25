import acm.graphics.GCompound;
import acm.graphics.GOval;

import java.awt.*;

public class gameBall extends GCompound {

    private static final double BALL_RADIUS = 12;
    private GOval ball;

    public gameBall() {
        ball = new GOval(2 * BALL_RADIUS, 2 * BALL_RADIUS);
        ball.setFilled(true);
        ball.setFillColor(Color.GREEN);
        add(ball);
    }

    public static void main(String[] args) {
        new gameBall().start(args);
    }
}
