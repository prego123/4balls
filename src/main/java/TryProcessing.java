import processing.core.PApplet;

public class TryProcessing extends PApplet {

    public static final int WIDTH = 648;
    public static final int HEIGHT = 488;
    public static final int DIAMETER = 10;
    public static DrawFigureStrategy obj;

    public static void main(String args[]){

        PApplet.main("TryProcessing", args);
        obj = new DrawCircleStrategy();
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
    }

    @Override
    public void draw(){
        obj.drawFigure(WIDTH, HEIGHT, DIAMETER);
    }

}
