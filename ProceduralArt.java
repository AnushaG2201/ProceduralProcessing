import processing.core.PApplet;
import processing.core.PFont;
import processing.core.PImage;

public class ProceduralArt extends PApplet {
    public final int WIDTH = 840;
    public final int HEIGHT = 752;
    public final int radius = 10;
    int numberOfBalls = 4;
    int ballHeight[] = new int[]{HEIGHT * 1 / 5, HEIGHT * 2 / 5, HEIGHT * 3 / 5, HEIGHT * 4 / 5};
    int ballSpeed[] = new int[]{1, 2, 3, 4};
    int ballPosition[] = new int[]{0, 0, 0, 0};
    PFont myFont;

    public static void main(String args[]) {
        PApplet.main("ProceduralArt", args);
    }

    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        int red = 255;
        int blue = 204;
        int green = 0;
        background(red, blue, green);
        int size = 24;
        String fontName = "FFScala";
        myFont = createFont(fontName, size);
        textFont(myFont);
        PImage crackers = loadImage("/Users/anushag/Downloads/crackers.jpeg");
        background(crackers);
    }

    @Override
    public void draw(){
        textSize(40);
        int black = 53;
        int x = 180;
        int y = HEIGHT / 2;
        for (int i = 0; i < numberOfBalls; i++) {
            ellipse(ballPosition[i], ballHeight[i], radius, radius);
            ballPosition[i] += ballSpeed[i];
            if (ballPosition[numberOfBalls / 2] + radius > WIDTH) {
                text("Happy New Year 2021", x, y);
            }
            fill(black);
            textSize(40);
            if (ballPosition[0] + radius >= WIDTH)
                noLoop();
        }
    }

}


