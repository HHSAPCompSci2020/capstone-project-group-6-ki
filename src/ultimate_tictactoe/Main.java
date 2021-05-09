/*
 * Main
 * 
 * Created 4-3-2021
 */

package ultimate_tictactoe;

import java.awt.Container;
import javax.swing.JFrame;

import components.DrawingPanel;
import views.*;

/**
 * Class that runs the whole game.
 * @author katytsao
 */
public class Main extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	public static enum STATE {
		MENU,
		GAME,
		SETTINGS,
		INSTRUCTIONS
	};
	
	public static STATE State = STATE.GAME;
	/**
	 * Main constructor — sets up JFrame window
	 */
	public Main() {
		super("Ultimate Tic Tac Toe");
		DrawingPanel board = new DrawingPanel();
		Menu menu = new Menu();
		
		Container c = getContentPane();
		c.setBackground(java.awt.Color.WHITE);
		c.setSize(600, 600);

		if (State == STATE.MENU) {
			c.add(menu);
		}
		else if (State == STATE.GAME) {
		
		c.add(board);
		
		}
//		else if (State == STATE.SETTINGS) {
//			c.add(s);
//		}
//		else if (State == STATE.INSTRUCTIONS) {
//			c.add(instructions);
//			
//			}
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