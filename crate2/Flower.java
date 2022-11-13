
public class Flower
{
    private double x;
    private double y;

    private static double d = 20;
    
    public Flower(double x, double y)
    {
        this.x = x;
        this.y = y;
    }
    
    public void drawCircle(double x, double y)
    {
        
    }
    
    public void draw()
    {
        Circle leftPetal = new Circle(this.x, this.y+d, d, Color.PINK);
        Circle topPetal = new Circle(this.x+d, this.y, d,Color.PINK);
        Circle rightPetal = new Circle(this.x+2*d, this.y+d, d, Color.PINK);
        Circle bottomPetal = new Circle(this.x+d, this.y+2*d, d, Color.PINK);
        Circle center = new Circle(this.x+d, this.y+d, d, Color.YELLOW);
        
        Line stem = new Line(this.x+1.5*d, this.y+3*d, this.x+1.5*d, this.y+6*d);

        leftPetal.draw();
        topPetal.draw();
        rightPetal.draw();
        bottomPetal.draw();
        center.draw();
        
        stem.draw();
        stem.setColor(Color.GREEN);
        
    }
    
    public static void main(String[] args)
    {
        Flower flower1 = new Flower(30,30);
        flower1.draw();
        
        Flower flower2 = new Flower(80,60);
        flower2.draw();
    }
}
