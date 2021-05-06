/*
 * Main
 * 
 * Created 4-3-2021
 */

package ultimate_tictactoe;

import java.awt.Container;
import javax.swing.JFrame;

import components.DrawingPanel;

/**
 * Class that runs the whole game.
 * @author katytsao
 */
public class Main extends JFrame {
	
	private static final long serialVersionUID = 1L;

	/**
	 * Main constructor — sets up JFrame window
	 */
	public Main() {
		super("Ultimate Tic Tac Toe");
		DrawingPanel board = new DrawingPanel();
		
		Container c = getContentPane();
		c.setBackground(java.awt.Color.WHITE);
		c.setSize(600, 600);
		c.add(board);
		
		setSize(600, 600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
		setFocusable(true);
	}

	/**
	 * main method
	 * creates a Main object
	 */
	public static void main(String[] args) {
		new Main();
	}

}