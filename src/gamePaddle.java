import acm.graphics.GCompound;
import acm.graphics.GRect;

public class gamePaddle extends GCompound {

    private static final double PADDLE_WIDTH = 80;
    private static final double PADDLE_HEIGHT = 12;

    public gamePaddle() {
        GRect paddle = new GRect(PADDLE_WIDTH,PADDLE_HEIGHT);
        paddle.setFilled(true);
        add(paddle);
    }

    public static void main(String[] args) {
        new gamePaddle().start(args);
    }
}
