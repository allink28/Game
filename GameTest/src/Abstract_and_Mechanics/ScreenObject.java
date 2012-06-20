package Abstract_and_Mechanics;
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
}
