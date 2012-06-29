package real;

import abstract_and_Mechanics.GamePanel;
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
    private Point head, tail; //Head is the leading end of the laser.
    private int b; //b is the y point at which lines cross the x=0 axis.
    private double angle;
    // ----------------------------------------------------------
    /**
     * Create a new Laser object.
     * @param enemyPosition  Starting point of path
     */
    public Laser(Point enemyPosition) {

        tail = enemyPosition;
        head = new Point(tail.x, tail.y);
        calculateLine();
    }

    // ----------------------------------------------------------
    /**
     * 'Fires' another laser
     * @param enemyPosition
     */
    public void reset(Point enemyPosition) {
        tail = new Point(enemyPosition.x, enemyPosition.y);
        head = new Point(tail.x, tail.y);
        calculateLine();
    }

    @Override
    public void draw(Graphics g)
    {
        g.setColor(Color.red);
        move();
        g.drawLine(tail.x, tail.y, head.x, head.y);
    }

    private void calculateLine() {
        b = GamePanel.player1.position.y-8 -
            (GamePanel.player1.position.y-8-tail.y)
            /(GamePanel.player1.position.x-8-tail.x)*GamePanel.player1.position.x-8;

        //Now find angle
        angle = Math.atan(((b-tail.y)/(double)tail.x));

        /*if(Math.random() > .5) {//Add inaccuracy to shot
            angle+= Math.random()/20;
        }
        else {
            angle-= Math.random()/20;
        }*/
        System.out.println(angle);
    }

    // ----------------------------------------------------------
    /**
     * Update laser position along path
     */
    private void move() {//Q1 & Q4 x is wrong sign. so if player is to the right of enemy
        if(head.x > 1 && head.y > 0 &&
            head.x < GamePanel.panelWidth && head.y < GamePanel.panelHeight) {
            head.x-=(80*Math.cos(angle));
            head.y+=(80*Math.sin(angle));
        }
        else {
            tail.x-=(80*Math.cos(angle));
            tail.y+=(80*Math.sin(angle));
        }
    }

    // ----------------------------------------------------------
    /**
     * Used to determine when to fire another laser
     * @return
     */
    public boolean needsReset() {
        if(tail.x < 1 || tail.y < -20 ||
            tail.x > GamePanel.panelWidth || tail.y > GamePanel.panelHeight)
            return true;
        return false;
    }

}
