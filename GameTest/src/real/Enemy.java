package real;
import abstract_and_Mechanics.Character;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

// -------------------------------------------------------------------------
/**
 *  Represents an enemy.
 *  Enemy fires a laser.
 *
 *  @author Allen
 *  @version Jun 22, 2012
 */

public class Enemy extends Character
{
    private Laser laser;
    private Point playerPosition = null;

    // ----------------------------------------------------------
    /**
     * Create a new Enemy object.
     * @param p
     */
    public Enemy(Point p) {
        super(p);
    }

    @Override
    public void draw(Graphics g)
    {
        g.setColor(Color.orange);
        g.fillRect(position.x-8, position.y-8, height, width);
        //g.fillPolygon(arg0, arg1, arg2)

        if(laser == null) {
            laser = new
                Laser(new Point(position.x, position.y), playerPosition);
            //PlayerPosition is only used in calculation.
        }
        else if(laser.needsReset()) {
            laser.reset(new Point(position.x, position.y), playerPosition);
        }
        laser.draw(g);

    }

    // ----------------------------------------------------------
    /**
     * Update player position to shoot at.
     * @param p
     */
    public void updatePP(Point p) {
        playerPosition = p;
    }
}
