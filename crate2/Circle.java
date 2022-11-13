
public class Circle
{
    private double x;
    private double y;
    private double diameter;
    private Color color;


    public Circle(double x, double y, double diameter, Color color)
    {
        this.x = x;
        this.y = y;
        this.diameter = diameter;
        this.color = color;
    }

    public void draw()
    {
        Ellipse circle = new Ellipse(this.x, this.y, diameter, diameter);
        
        circle.draw();
        circle.setColor(this.color);
        circle.fill();
  
    }
}
