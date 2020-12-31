import processing.core.PApplet;
import processing.core.PFont;
import processing.core.PImage;

public class ProceduralArt extends PApplet{
    public static final int WIDTH = 840;
    public static final int HEIGHT = 752;
    public static final int radius=10;
    public static final int Ball1Height=HEIGHT*1/5;
    public static final int Ball2Height=HEIGHT*2/5;
    public static final int Ball3Height=HEIGHT*3/5;
    public static final int Ball4Height=HEIGHT*4/5;
    public static final int speedOfBall1=1;
    public static final int speedOfBall2=2;
    public static final int speedOfBall3=3;
    public static final int speedOfBall4=4;
    int w,x,y,z=0;
    PFont myFont; 

    public static void main(String args[]) {
        PApplet.main("ProceduralArt", args);
    }


    @Override
    public void settings() {
        size(WIDTH,HEIGHT);
    }

    @Override
    public void setup() {
        background(255,204,0);
        myFont=createFont("FFScala",24);
        textFont(myFont);
        PImage crackers=loadImage("/Users/anushag/Downloads/crackers.jpeg");
        background(crackers);

//        float redValue=red(53);
//        System.out.println(redValue);


    }

    @Override
    public void draw() {
        ellipse(w,Ball1Height,radius,radius);
        ellipse(x,Ball2Height,radius,radius);
        ellipse(y,Ball3Height,radius,radius);
        ellipse(z,Ball4Height,radius,radius);
        w+=speedOfBall1;
        x+=speedOfBall2;
        y+=speedOfBall3;
        z+=speedOfBall4;
        //textSize(16);
        //text("I display surprises when boundary is hit",60,40);
        textSize(40);


        if(w>WIDTH || w+radius>WIDTH)
        {
            text("Happy",130,130);
            fill(53);
            textSize(40);
            noLoop();
        }
        if(x>WIDTH || x+radius>WIDTH){
            text("New",250,250);
            fill(48);
            textSize(40);
            //noLoop();
        }
        if(y>WIDTH || y+radius>WIDTH){
            text("Year",500,500);
            fill(random(139));
            textSize(40);
        }
        if(z>WIDTH || z+radius>WIDTH){
            text("2021",650,650);
            fill(random(256));
            //noLoop();
            textSize(40);
        }


    }
}
