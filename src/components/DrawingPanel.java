/*
 * DrawingPanel (comp inside Game page)
 * Shows the game and lets the user click on stuff
 * 
 * Created 4-3-2021
 */

package components;

import javax.swing.JPanel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class DrawingPanel extends JPanel implements MouseListener {
	
	private static final long serialVersionUID = 1L;

	public DrawingPanel() {
		
	}
	

	// Methods required by MouseListener interface (action is based on area that is clicked)
	public void mouseClicked(MouseEvent e) {}
	public void mousePressed(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}
	public void mouseEntered(MouseEvent e) {}
	public void mouseExited(MouseEvent e) {}

}