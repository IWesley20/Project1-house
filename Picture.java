
/**
 * Write a description of class Picture here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Picture
{
    // instance variables - replace the example below with your own
    private Square wall;
    private Square window;
    private Triangle design;
    private Circle ball;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // initialise instance variables
    }

public void draw()
{
        wall = new Square();
        wall.moveHorizontal(-140);
        wall.moveVertical(20);
        wall.changeSize(120);
        wall.makeVisible();
        
        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(-120);
        window.moveVertical(40);
        window.changeSize(40);
        window.makeVisible();
        
        design = new Triangle();  
        design.changeSize(60, 180);
        design.moveHorizontal(20);
        design.moveVertical(-60);
        design.makeVisible();

        ball = new Circle();
        ball.changeColor("yellow");
        ball.moveHorizontal(100);
        ball.moveVertical(-40);
        ball.changeSize(80);
        ball.makeVisible();
}
    public void setBlackAndWhite()
    {
        if (wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
           design.changeColor("black");
            ball.changeColor("black");
        }
    }
    public void setColor()
    {
        if (wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            design.changeColor("green");
            ball.changeColor("yellow");
        }
    }
}

       

