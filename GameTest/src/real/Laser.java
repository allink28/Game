package real;

import abstract_and_Mechanics.ScreenObject;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

// -------------------------------------------------------------------------
/**
 *  A laser object
 *
 *  @author Allen
 *  @version Jun 22, 2012
 */
public class Laser extends ScreenObject
{
    private Point startPoint;
    private Point laserPosition;
    private int b;
    private double angle;
    // ----------------------------------------------------------
    /**
     * Create a new Laser object.
     * @param enemyPosition  Starting point of path
     * @param playerPosition
     */
    public Laser(Point enemyPosition, Point playerPosition) {

        startPoint = enemyPosition;
        laserPosition = new Point(startPoint.x, startPoint.y);
        calculateLine(playerPosition);
    }

    // ----------------------------------------------------------
    /**
     * 'Fires' another laser
     * @param enemyPosition
     * @param playerPosition
     */
    public void reset(Point enemyPosition, Point playerPosition) {
        startPoint = new Point(enemyPosition.x, enemyPosition.y);
        laserPosition = new Point(startPoint.x, startPoint.y);
        calculateLine(playerPosition);
    }

    @Override
    public void draw(Graphics g)
    {
        g.setColor(Color.red);
        move();
        g.drawLine(startPoint.x, startPoint.y, laserPosition.x, laserPosition.y);
    }

    private void calculateLine(Point playerPosition) {
        b = startPoint.y -
            (startPoint.y-playerPosition.y)/(startPoint.x-playerPosition.x)*startPoint.x;

        double random = Math.random();
        int offset = (int) (50*random);
        random = Math.random();
        if(random > .5) {
            b = b - offset;
        }
        else {
            b = b + offset;
        }
        //Now find angle
        angle = Math.atan(((b-startPoint.y)/(double)startPoint.x));
        //System.out.println("b: "+b+" angle: "+angle);
    }

    // ----------------------------------------------------------
    /**
     * Update laser position along path
     */
    private void move() {
        if(laserPosition.x > 1) {
            laserPosition.x-=(50*Math.cos(angle));
            laserPosition.y-=(51*Math.sin(angle));
        }
        else {
            startPoint.x -=(50*Math.cos(angle));
            startPoint.y-=(50*Math.sin(angle));
        }
    }

    // ----------------------------------------------------------
    /**
     * Used to determine when to fire another laser
     * @return
     */
    public boolean needsReset() {
        if(startPoint.x < 1)
            return true;
        return false;
    }

}
