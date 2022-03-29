import processing.core.PApplet;

public class TryProcessing extends PApplet {

    public static final int WIDTH = 648;
    public static final int HEIGHT = 488;
    public static final int DIAMETER = 10;

    public static void main(String args[]){
        PApplet.main("TryProcessing", args);
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
        DrawFigureStrategy obj = new DrawCircleStrategy();
        System.out.println(1);
        obj.drawFigure(WIDTH, HEIGHT, DIAMETER);
    }

}
