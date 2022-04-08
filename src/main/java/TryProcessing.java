import processing.core.PApplet;

public class TryProcessing extends PApplet {

    public static final int WIDTH = 648;
    public static final int HEIGHT = 488;
    public static final int DIAMETER = 10;

    DrawCircleStrategy c[]= new DrawCircleStrategy[4];
    DrawRectangleStrategy r[] = new DrawRectangleStrategy[4];

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
        for(int i=0; i<4; i++)
            c[i]= new DrawCircleStrategy(0, HEIGHT*i/5, i+1);
    }

    @Override
    public void draw(){
        for(int i=0; i<4; i++)
        {
            c[i].move();
            c[i].drawFigure(this);
        }
    }

}
