import processing.core.PApplet;

public class DrawRectangleStrategy implements DrawFigureStrategy{
    private int a;
    private int b;
    private int c;
    private int d;
    private int speed;

    public DrawRectangleStrategy(int a, int b, int c, int d, int speed){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.speed = speed;
    }
    public void move(){
        a += speed;
        c += speed;
    }
    public void drawFigure(PApplet p) {
        p.rect(a, b, c, d);
    }
}
