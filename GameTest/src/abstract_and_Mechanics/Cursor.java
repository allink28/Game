package abstract_and_Mechanics;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

// -------------------------------------------------------------------------
/**
 *  Write a one-sentence summary of your class here.
 *  Follow it with additional details about its purpose, what abstraction
 *  it represents, and how to use it.
 *
 *  @author Allen
 *  @version Jun 21, 2012
 */

public class Cursor extends ScreenObject
{

    // ----------------------------------------------------------
    /**
     * Create a new Cursor object.
     * @param p
     */
    public Cursor(Point p) {
        super(p);
        height = 8;
        width = 8;
    }

    @Override
    public void draw(Graphics g)
    {
        g.setColor(Color.white);
        g.drawOval(position.x - 4, position.y - 4, height, width);
    }

}
