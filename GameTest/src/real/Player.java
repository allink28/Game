
package real;
import abstract_and_Mechanics.Character;
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
 *  @version Jun 20, 2012
 */

public class Player extends Character {

    private Color color = Color.green;
    private int health = 3;

    // ----------------------------------------------------------
    /**
     * Create a new Player object.
     * @param p
     */
    public Player(Point p)
    {
        super(p);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void draw(Graphics g)
    {
        g.setColor(color);
        g.fillRect(position.x-8, position.y-8, height, width);
    }

    public void hit(int damage) {
        health-=damage;

        switch (health) {
            case 3:
                color = Color.green;
                break;
            case 2:
                color = Color.yellow;
                break;
            case 1:
                color = Color.red;
                break;
            default:
                System.out.println("Game over!");
                color = Color.black;
        }
    }
}
