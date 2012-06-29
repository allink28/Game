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
    public static final int panelWidth = 1200;
    public static final int panelHeight = 900;
    public static Player player1 = new Player(new Point(panelWidth/2, panelHeight/2));
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
        Enemy enemy1 = new Enemy(new Point(panelWidth/2, panelHeight/2));
        //Enemy enemy2 = new Enemy(new Point(panelWidth-16, panelHeight/2));
        enemyList.add(enemy1);
        //enemyList.add(enemy2);
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
        for ( Enemy e : enemyList ) {
            e.draw(g);
        }
    }

    private class MouseListener extends MouseAdapter
    {
        // ----------------------------------------------------------
        /**
         * Captures the initial position at which the mouse button is
         * pressed. (mouseClicked is pressed and released)
         * @param event The event to be handled
         */
        public void mousePressed(MouseEvent event)
        {
            Point click = event.getPoint();
            int stepSize = 5; //player Speed
            if(click.distance(player1.position) > 60) {
                stepSize = 10;
            }
            else if(click.distance(player1.position) < 30) {
                stepSize = 2;
            }

            if (click.y > player1.position.y) {
                player1.position.y = player1.position.y + stepSize;
            }
            else if (click.y < player1.position.y){
                player1.position.y = player1.position.y - stepSize;
            }
            if (click.x > player1.position.x) {
                player1.position.x = player1.position.x + stepSize;
            }
            else if(click.x < player1.position.x){
                player1.position.x = player1.position.x - stepSize;
            }
            cursor.changePosition(click);
            repaint();
        }

        /**
         * Rightclick
         */
        /*public void mousePressed( MouseEvent e ) {
            if ( e.isMetaDown() ) {
                System.out.println( "Thanks!" );
            }
        }*/
    }

}