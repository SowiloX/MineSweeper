import java.awt.Color;
import java.awt.Graphics;
import java.awt.Shape;

import javax.swing.JButton;

/**
 * Title: GameButton.java
 * Description: Class of game buttons
 * @author Shi Xuan
 * @version 1.0
 */
public class GameButton extends JButton {
	private Shape shape = null;
	private Color color;

    /**
     * Constructor
     */
    public GameButton() {
        super();
        color = new Color(200, 200, 200);
        this.setBackground(color);
    }
    
    /**
     * Override setEnabled.
     */
    public void setEnabled(boolean enabled) {
        boolean oldEnabled = isEnabled();
        super.setEnabled(enabled);
        if(oldEnabled != enabled) {
            if(!enabled)
                setBackground(new Color(238, 238, 238));
            else
                setBackground(new Color(190, 190, 190));

            repaint();
        }
    }
}