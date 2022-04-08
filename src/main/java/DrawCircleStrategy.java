import processing.core.PApplet;

public class DrawCircleStrategy implements DrawFigureStrategy{
    private int x;
    private int y;
    private int speed;

    public DrawCircleStrategy(int x, int y, int speed){
        this.x = x;
        this.y = y;
        this.speed = speed;
    }

    public void move(){
        x += speed;
    }
    public void drawFigure(PApplet p){
        p.ellipse(x, y, 20, 20);
    }
}
