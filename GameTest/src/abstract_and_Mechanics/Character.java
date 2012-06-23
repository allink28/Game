package abstract_and_Mechanics;
import java.awt.Graphics;
import java.awt.Point;


// -------------------------------------------------------------------------
/**
 *  Represents on screen characters
 *
 *  @author Allen
 *  @version Jun 20, 2012
 */

public class Character extends ScreenObject
{

    // ----------------------------------------------------------
    /**
     * Create a new Character object.
     * @param p Starting Position
     */
    public Character( Point p )
    {
        super( p );
        height = 16;
        width = 16;
    }

    // ----------------------------------------------------------
    /**
     * Create a new Character object.
     */
    public Character() {
        super();
        height = 16;
        width = 16;
    }

    @Override
    public void draw(Graphics g)
    {
        System.out.println("Character has no graphic");

    }

}
