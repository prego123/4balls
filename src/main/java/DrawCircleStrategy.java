import processing.core.PApplet;

public class DrawCircleStrategy extends PApplet implements DrawFigureStrategy{
    int x[] = new int[4];
    public void drawFigure(int WIDTH, int HEIGHT, int DIAMETER){
        for(int i=1; i<5; i++)
        {
            ellipse(x[i-1]+=i, HEIGHT*i/5, DIAMETER, DIAMETER);

        }

    }
}
