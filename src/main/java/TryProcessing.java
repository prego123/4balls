import processing.core.PApplet;

public class TryProcessing extends PApplet{

    public static final int WIDTH = 648;
    public static final int HEIGHT = 488;
    public static final int DIAMETER = 10;
    int x[] = new int[4];

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
        drawCircle();
    }

    private void drawCircle() {
        for(int i=1; i<5; i++){
            ellipse(x[i-1]+=i, HEIGHT*i/5, DIAMETER, DIAMETER);
        }
    }

}
