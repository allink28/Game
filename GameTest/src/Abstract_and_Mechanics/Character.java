package Abstract_and_Mechanics;
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

    public Character() {
        super();
        height = 16;
        width = 16;
    }

}
