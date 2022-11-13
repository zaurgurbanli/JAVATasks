// BlueJ project: lesson2/crate

// Draw a crate by combining a rectangle with five lines.
//
// The front face is a rectangle with top left corner (20, 30), 
// width 100, and height 40. 
//
// A diagonal line goes from the face's top left corner  to (50, 10). 
// Another diagonal line goes from the face's bottom right corner 
// to (150, 50).
// A third diagonal starts at the face's top right corner and is
// parallel to the others.
// The fourth and fifth line join the end points of the diagonals.
//
// Before programming, get out a pen and draw the crate on a
// sheet of paper! Label each of the points with their coordinates.
//
// Also, don't forget to call draw() on your rectangle and line objects.

public class DrawACrate
{
    public static void main(String[] args)
    {
        Line topLine = new Line(20,30,70,10);
        Line middleLine = new Line(120,30,170,10);
        Line rightLine = new Line(120,70,170,50);
        Line leftLine = new Line(20,70,70,50);

        Rectangle backFace = new Rectangle(20,30,100,40);
        Rectangle frontFace = new Rectangle(70,10,100,40);

        
        backFace.draw();
        backFace.setColor(Color.RED);
        backFace.fill();
        
        topLine.draw();
        middleLine.draw();
        rightLine.draw();
        leftLine.draw();

        frontFace.draw();
        frontFace.setColor(Color.BLUE);
        frontFace.fill();
    

    }
}
