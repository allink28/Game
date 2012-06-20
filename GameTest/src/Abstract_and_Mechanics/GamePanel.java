package Abstract_and_Mechanics;
import java.awt.Dimension;
import javax.swing.JPanel;

// -------------------------------------------------------------------------
/**
 *  This class holds the primary panel which contains the controls panel
 *  and drawing area.
 *
 *  @author Allen Preville (a892186)
 *  @version Feb 24, 2010
 */

public class GamePanel extends JPanel
{
    private int panelWidth = 1200;
    private int panelHeight = 900;

    /**
     * Constructor for GamePanel
     */
    public GamePanel() {

        setPreferredSize(new Dimension(panelWidth, panelHeight));
    }
}