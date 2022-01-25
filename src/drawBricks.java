import acm.graphics.GCompound;
import acm.graphics.GImage;

public class drawBricks extends GCompound {

    private static final double CANVAS_WIDTH = 640;
    private static final int NBRICKS_PER_ROW = 10;
    private static final int NBRICKS_PER_COL = 10;
    private static final double BRICK_GAP = 4;
    private static final double BRICK_WIDTH = Math.floor(
            (CANVAS_WIDTH - (NBRICKS_PER_ROW + 1.0) * BRICK_GAP) / NBRICKS_PER_ROW);
    private static final double BRICK_HEIGHT = 12;
    private static final double cx = CANVAS_WIDTH/2;
    private static final double cy = 60;   // from top

    public drawBricks() {
        for (int row = 0; row < 1; row++ ) {

            for (int column = 0; column < NBRICKS_PER_COL; column++) {

                double	x = cx - (NBRICKS_PER_ROW*BRICK_WIDTH)/2 - ((NBRICKS_PER_ROW-1)*BRICK_GAP)/2 + column*BRICK_WIDTH + column*BRICK_GAP;
                double	y = cy + row * BRICK_HEIGHT + row * BRICK_GAP;

                GImage brick = new GImage("Breakout_Tile_Set_Free\\Breakout Tile Set Free\\PNG\\02-Breakout-Tiles.png",x,y);
                brick.setSize(BRICK_WIDTH,BRICK_HEIGHT);
                add(brick);
            }
        }

        for (int row = 1; row < 2; row++ ) {

            for (int column = 0; column < NBRICKS_PER_COL; column++) {

                double	x = cx - (NBRICKS_PER_ROW*BRICK_WIDTH)/2 - ((NBRICKS_PER_ROW-1)*BRICK_GAP)/2 + column*BRICK_WIDTH + column*BRICK_GAP;
                double	y = cy + row * BRICK_HEIGHT + row * BRICK_GAP;

                GImage brick = new GImage("Breakout_Tile_Set_Free\\Breakout Tile Set Free\\PNG\\04-Breakout-Tiles.png",x,y);
                brick.setSize(BRICK_WIDTH,BRICK_HEIGHT);
                add(brick);
            }
        }

        for (int row = 2; row < 3; row++ ) {

            for (int column = 0; column < NBRICKS_PER_COL; column++) {

                double	x = cx - (NBRICKS_PER_ROW*BRICK_WIDTH)/2 - ((NBRICKS_PER_ROW-1)*BRICK_GAP)/2 + column*BRICK_WIDTH + column*BRICK_GAP;
                double	y = cy + row * BRICK_HEIGHT + row * BRICK_GAP;

                GImage brick = new GImage("Breakout_Tile_Set_Free\\Breakout Tile Set Free\\PNG\\06-Breakout-Tiles.png",x,y);
                brick.setSize(BRICK_WIDTH,BRICK_HEIGHT);
                add(brick);
            }
        }

        for (int row = 3; row < 4; row++ ) {

            for (int column = 0; column < NBRICKS_PER_COL; column++) {

                double	x = cx - (NBRICKS_PER_ROW*BRICK_WIDTH)/2 - ((NBRICKS_PER_ROW-1)*BRICK_GAP)/2 + column*BRICK_WIDTH + column*BRICK_GAP;
                double	y = cy + row * BRICK_HEIGHT + row * BRICK_GAP;

                GImage brick = new GImage("Breakout_Tile_Set_Free\\Breakout Tile Set Free\\PNG\\08-Breakout-Tiles.png",x,y);
                brick.setSize(BRICK_WIDTH,BRICK_HEIGHT);
                add(brick);
            }
        }

        for (int row = 4; row < 5; row++ ) {

            for (int column = 0; column < NBRICKS_PER_COL; column++) {

                double	x = cx - (NBRICKS_PER_ROW*BRICK_WIDTH)/2 - ((NBRICKS_PER_ROW-1)*BRICK_GAP)/2 + column*BRICK_WIDTH + column*BRICK_GAP;
                double	y = cy + row * BRICK_HEIGHT + row * BRICK_GAP;

                GImage brick = new GImage("Breakout_Tile_Set_Free\\Breakout Tile Set Free\\PNG\\10-Breakout-Tiles.png",x,y);
                brick.setSize(BRICK_WIDTH,BRICK_HEIGHT);
                add(brick);
            }
        }

        for (int row = 5; row < 6; row++ ) {

            for (int column = 0; column < NBRICKS_PER_COL; column++) {

                double	x = cx - (NBRICKS_PER_ROW*BRICK_WIDTH)/2 - ((NBRICKS_PER_ROW-1)*BRICK_GAP)/2 + column*BRICK_WIDTH + column*BRICK_GAP;
                double	y = cy + row * BRICK_HEIGHT + row * BRICK_GAP;

                GImage brick = new GImage("Breakout_Tile_Set_Free\\Breakout Tile Set Free\\PNG\\12-Breakout-Tiles.png",x,y);
                brick.setSize(BRICK_WIDTH,BRICK_HEIGHT);
                add(brick);
            }
        }

        for (int row = 6; row < 7; row++ ) {

            for (int column = 0; column < NBRICKS_PER_COL; column++) {

                double	x = cx - (NBRICKS_PER_ROW*BRICK_WIDTH)/2 - ((NBRICKS_PER_ROW-1)*BRICK_GAP)/2 + column*BRICK_WIDTH + column*BRICK_GAP;
                double	y = cy + row * BRICK_HEIGHT + row * BRICK_GAP;

                GImage brick = new GImage("Breakout_Tile_Set_Free\\Breakout Tile Set Free\\PNG\\14-Breakout-Tiles.png",x,y);
                brick.setSize(BRICK_WIDTH,BRICK_HEIGHT);
                add(brick);
            }
        }

        for (int row = 7; row < 8; row++ ) {

            for (int column = 0; column < NBRICKS_PER_COL; column++) {

                double	x = cx - (NBRICKS_PER_ROW*BRICK_WIDTH)/2 - ((NBRICKS_PER_ROW-1)*BRICK_GAP)/2 + column*BRICK_WIDTH + column*BRICK_GAP;
                double	y = cy + row * BRICK_HEIGHT + row * BRICK_GAP;

                GImage brick = new GImage("Breakout_Tile_Set_Free\\Breakout Tile Set Free\\PNG\\16-Breakout-Tiles.png",x,y);
                brick.setSize(BRICK_WIDTH,BRICK_HEIGHT);
                add(brick);
            }
        }


        for (int row = 8; row < 9; row++ ) {

            for (int column = 0; column < NBRICKS_PER_COL; column++) {

                double	x = cx - (NBRICKS_PER_ROW*BRICK_WIDTH)/2 - ((NBRICKS_PER_ROW-1)*BRICK_GAP)/2 + column*BRICK_WIDTH + column*BRICK_GAP;
                double	y = cy + row * BRICK_HEIGHT + row * BRICK_GAP;

                GImage brick = new GImage("Breakout_Tile_Set_Free\\Breakout Tile Set Free\\PNG\\18-Breakout-Tiles.png",x,y);
                brick.setSize(BRICK_WIDTH,BRICK_HEIGHT);
                add(brick);
            }
        }

        for (int row = 9; row < 10; row++ ) {

            for (int column = 0; column < NBRICKS_PER_COL; column++) {

                double	x = cx - (NBRICKS_PER_ROW*BRICK_WIDTH)/2 - ((NBRICKS_PER_ROW-1)*BRICK_GAP)/2 + column*BRICK_WIDTH + column*BRICK_GAP;
                double	y = cy + row * BRICK_HEIGHT + row * BRICK_GAP;

                GImage brick = new GImage("Breakout_Tile_Set_Free\\Breakout Tile Set Free\\PNG\\20-Breakout-Tiles.png",x,y);
                brick.setSize(BRICK_WIDTH,BRICK_HEIGHT);
                add(brick);
            }
        }

        for (int row = 0; row < 1; row++ ) {

            for (int column = 0; column < NBRICKS_PER_COL; column++) {

                double	x = cx - (NBRICKS_PER_ROW*BRICK_WIDTH)/2 - ((NBRICKS_PER_ROW-1)*BRICK_GAP)/2 + column*BRICK_WIDTH + column*BRICK_GAP;
                double	y = cy + row * BRICK_HEIGHT + row * BRICK_GAP;

                GImage brick = new GImage("Breakout_Tile_Set_Free\\Breakout Tile Set Free\\PNG\\01-Breakout-Tiles.png",x,y);
                brick.setSize(BRICK_WIDTH,BRICK_HEIGHT);
                add(brick);
            }
        }

        for (int row = 1; row < 2; row++ ) {

            for (int column = 0; column < NBRICKS_PER_COL; column++) {

                double	x = cx - (NBRICKS_PER_ROW*BRICK_WIDTH)/2 - ((NBRICKS_PER_ROW-1)*BRICK_GAP)/2 + column*BRICK_WIDTH + column*BRICK_GAP;
                double	y = cy + row * BRICK_HEIGHT + row * BRICK_GAP;

                GImage brick = new GImage("Breakout_Tile_Set_Free\\Breakout Tile Set Free\\PNG\\03-Breakout-Tiles.png",x,y);
                brick.setSize(BRICK_WIDTH,BRICK_HEIGHT);
                add(brick);
            }
        }

        for (int row = 2; row < 3; row++ ) {

            for (int column = 0; column < NBRICKS_PER_COL; column++) {

                double	x = cx - (NBRICKS_PER_ROW*BRICK_WIDTH)/2 - ((NBRICKS_PER_ROW-1)*BRICK_GAP)/2 + column*BRICK_WIDTH + column*BRICK_GAP;
                double	y = cy + row * BRICK_HEIGHT + row * BRICK_GAP;

                GImage brick = new GImage("Breakout_Tile_Set_Free\\Breakout Tile Set Free\\PNG\\05-Breakout-Tiles.png",x,y);
                brick.setSize(BRICK_WIDTH,BRICK_HEIGHT);
                add(brick);
            }
        }

        for (int row = 3; row < 4; row++ ) {

            for (int column = 0; column < NBRICKS_PER_COL; column++) {

                double	x = cx - (NBRICKS_PER_ROW*BRICK_WIDTH)/2 - ((NBRICKS_PER_ROW-1)*BRICK_GAP)/2 + column*BRICK_WIDTH + column*BRICK_GAP;
                double	y = cy + row * BRICK_HEIGHT + row * BRICK_GAP;

                GImage brick = new GImage("Breakout_Tile_Set_Free\\Breakout Tile Set Free\\PNG\\07-Breakout-Tiles.png",x,y);
                brick.setSize(BRICK_WIDTH,BRICK_HEIGHT);
                add(brick);
            }
        }

        for (int row = 4; row < 5; row++ ) {

            for (int column = 0; column < NBRICKS_PER_COL; column++) {

                double	x = cx - (NBRICKS_PER_ROW*BRICK_WIDTH)/2 - ((NBRICKS_PER_ROW-1)*BRICK_GAP)/2 + column*BRICK_WIDTH + column*BRICK_GAP;
                double	y = cy + row * BRICK_HEIGHT + row * BRICK_GAP;

                GImage brick = new GImage("Breakout_Tile_Set_Free\\Breakout Tile Set Free\\PNG\\09-Breakout-Tiles.png",x,y);
                brick.setSize(BRICK_WIDTH,BRICK_HEIGHT);
                add(brick);
            }
        }

        for (int row = 5; row < 6; row++ ) {

            for (int column = 0; column < NBRICKS_PER_COL; column++) {

                double	x = cx - (NBRICKS_PER_ROW*BRICK_WIDTH)/2 - ((NBRICKS_PER_ROW-1)*BRICK_GAP)/2 + column*BRICK_WIDTH + column*BRICK_GAP;
                double	y = cy + row * BRICK_HEIGHT + row * BRICK_GAP;

                GImage brick = new GImage("Breakout_Tile_Set_Free\\Breakout Tile Set Free\\PNG\\11-Breakout-Tiles.png",x,y);
                brick.setSize(BRICK_WIDTH,BRICK_HEIGHT);
                add(brick);
            }
        }

        for (int row = 6; row < 7; row++ ) {

            for (int column = 0; column < NBRICKS_PER_COL; column++) {

                double	x = cx - (NBRICKS_PER_ROW*BRICK_WIDTH)/2 - ((NBRICKS_PER_ROW-1)*BRICK_GAP)/2 + column*BRICK_WIDTH + column*BRICK_GAP;
                double	y = cy + row * BRICK_HEIGHT + row * BRICK_GAP;

                GImage brick = new GImage("Breakout_Tile_Set_Free\\Breakout Tile Set Free\\PNG\\13-Breakout-Tiles.png",x,y);
                brick.setSize(BRICK_WIDTH,BRICK_HEIGHT);
                add(brick);
            }
        }

        for (int row = 7; row < 8; row++ ) {

            for (int column = 0; column < NBRICKS_PER_COL; column++) {

                double	x = cx - (NBRICKS_PER_ROW*BRICK_WIDTH)/2 - ((NBRICKS_PER_ROW-1)*BRICK_GAP)/2 + column*BRICK_WIDTH + column*BRICK_GAP;
                double	y = cy + row * BRICK_HEIGHT + row * BRICK_GAP;

                GImage brick = new GImage("Breakout_Tile_Set_Free\\Breakout Tile Set Free\\PNG\\15-Breakout-Tiles.png",x,y);
                brick.setSize(BRICK_WIDTH,BRICK_HEIGHT);
                add(brick);
            }
        }

        for (int row = 8; row < 9; row++ ) {

            for (int column = 0; column < NBRICKS_PER_COL; column++) {

                double	x = cx - (NBRICKS_PER_ROW*BRICK_WIDTH)/2 - ((NBRICKS_PER_ROW-1)*BRICK_GAP)/2 + column*BRICK_WIDTH + column*BRICK_GAP;
                double	y = cy + row * BRICK_HEIGHT + row * BRICK_GAP;

                GImage brick = new GImage("Breakout_Tile_Set_Free\\Breakout Tile Set Free\\PNG\\17-Breakout-Tiles.png",x,y);
                brick.setSize(BRICK_WIDTH,BRICK_HEIGHT);
                add(brick);
            }
        }

        for (int row = 9; row < 10; row++ ) {

            for (int column = 0; column < NBRICKS_PER_COL; column++) {

                double	x = cx - (NBRICKS_PER_ROW*BRICK_WIDTH)/2 - ((NBRICKS_PER_ROW-1)*BRICK_GAP)/2 + column*BRICK_WIDTH + column*BRICK_GAP;
                double	y = cy + row * BRICK_HEIGHT + row * BRICK_GAP;

                GImage brick = new GImage("Breakout_Tile_Set_Free\\Breakout Tile Set Free\\PNG\\19-Breakout-Tiles.png",x,y);
                brick.setSize(BRICK_WIDTH,BRICK_HEIGHT);
                add(brick);
            }
        }
    }
    public static void main(String[] args) {
        new drawBricks().start(args);
    }
}
