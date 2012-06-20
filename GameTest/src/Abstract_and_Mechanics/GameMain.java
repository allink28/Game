package Abstract_and_Mechanics;
import javax.swing.JFrame;

//-------------------------------------------------------------------------
/**
 * The main driver for the Game project.
 *
 * @author Allen Preville (a892186)
 * @version Feb 24, 2010
 */
public class GameMain
{
    // ----------------------------------------------------------
    /**
     * Sets up the primary frame and panel.
     *
     * @param args unused command-line arguments.
     */
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Allen's Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new GamePanel());
        frame.pack();
        frame.setVisible(true);
    }
}
