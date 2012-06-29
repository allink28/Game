package abstract_and_Mechanics;
import java.awt.Graphics;
import java.awt.Point;


// -------------------------------------------------------------------------
/**
 *  Represents on screen characters
 *  Players and Enemies
 *
 *  @author Allen
 *  @version Jun 20, 2012
 */

public class Character extends ScreenObject
{
    public static final int height = 16;
    public static final int width = 16;

    // ----------------------------------------------------------
    /**
     * Create a new Character object.
     * @param p Starting Position
     */
    public Character( Point p )
    {
        super( p );
    }

    // ----------------------------------------------------------
    /**
     * Create a new Character object.
     */
    public Character() {
        super();
    }

    @Override
    public void draw(Graphics g)
    {
        System.out.println("Character has no graphic");

    }

}
