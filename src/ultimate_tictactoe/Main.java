/*
 * Main
 * 
 * Created 4-3-2021
 */

package ultimate_tictactoe;

import java.awt.Container;
import javax.swing.JFrame;

public class Main extends JFrame {
	
	private static final long serialVersionUID = 1L;

	public Main() {
		super("Ultimate Tic Tac Toe");
		Container c = getContentPane();
		c.setBackground(java.awt.Color.WHITE);
		c.setSize(600, 600);
		setSize(600, 600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
		setFocusable(true);
	}

	// main method to set up the window
	public static void main(String[] args) {
		new Main();
	}

}