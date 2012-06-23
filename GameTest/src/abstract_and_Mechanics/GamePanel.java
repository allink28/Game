package abstract_and_Mechanics;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;
import real.Enemy;
import real.Player;

// -------------------------------------------------------------------------
/**
 *  This class holds the primary panel
 *
 *  @author Allen Preville
 *  @version Jun 20, 2012
 */

public class GamePanel extends JPanel
{
    private int panelWidth = 1200;
    private int panelHeight = 900;
    private Player player1 = new Player(new Point(panelWidth/2, panelHeight/2));
    private ScreenObject cursor = new Cursor(new Point(0,0));
    private List<Enemy> enemyList = new ArrayList<Enemy>();

    /**
     * Constructor for GamePanel
     */
    public GamePanel() {
        MouseListener mlistener = new MouseListener();
        addMouseListener(mlistener);
        setPreferredSize(new Dimension(panelWidth, panelHeight));
        setBackground(Color.blue);

        //for level add new enemy to list
        Enemy enemy1 = new Enemy(new Point(panelWidth-16, panelHeight/2));
        enemyList.add(enemy1);
    }

    /**
     * Draws all the shapes displayed.
     * @param g The graphic context.
     */
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        player1.draw(g);
        cursor.draw(g);

        for ( Enemy e : enemyList )
        {
            e.updatePP(player1.getPosition());
            e.draw(g);

        }
    }

    private class MouseListener extends MouseAdapter
    {
        // ----------------------------------------------------------
        /**
         * Captures the initial position at which the mouse button is
         * pressed.
         * @param event The event to be handled
         */
        public void mouseClicked(MouseEvent event)
        {
            Point click = event.getPoint();
            Point p1Position = player1.getPosition();
            int stepSize = 5; //Speed
            if(click.distance(p1Position) > 70) {
                stepSize = 10;
            }
            else if(click.distance(p1Position) < 40) {
                stepSize = 2;
            }

            if (click.y > p1Position.y) {
                p1Position.y = p1Position.y + stepSize;
            }
            else if (click.y < p1Position.y){
                p1Position.y = p1Position.y - stepSize;
            }
            if (click.x > p1Position.x) {
                p1Position.x = p1Position.x + stepSize;
            }
            else if(click.x < p1Position.x){
                p1Position.x = p1Position.x - stepSize;
            }
            player1.changePosition(p1Position);
            cursor.changePosition(click);
            repaint();
        }
    }

}