/*
 * Abstract superclass for all view pages
 * 
 * Created 5-9-2021
 */

package views;

import ultimate_tictactoe.Main;
import javax.swing.JPanel;

public abstract class View extends JPanel {

	private Main router;
	private static final long serialVersionUID = 1L;
	
	public View(Main router) {
		super();
		this.router = router;
		setBackground(java.awt.Color.WHITE);
		setSize(600, 600);
	}
	
	public void push(String s) {
		router.push(s);
	}

}