package abstract_and_Mechanics;
import java.awt.Graphics;
import java.awt.Point;


// -------------------------------------------------------------------------
/**
 *  Abstract class that represents on screen objects
 *
 *  @author Allen
 *  @version Jun 20, 2012
 */

public abstract class ScreenObject
{
    public Point position;
    public int height;
    public int width;

    // ----------------------------------------------------------
    /**
     * Create a new ScreenObject object.
     * @param p
     */
    public ScreenObject(Point p) {
        position = p;
    }

    public ScreenObject() {
        position = new Point(0,0);
    }

    /**
     *  This abstract method draws the screen object on the given graphics context.
     *  @param g This is the graphics context used to draw.
     */
    public abstract void draw(Graphics g);

    public void changePosition(Point p) {
        position = p;
    }

    public Point getPosition() {
        return position;
    }
}
