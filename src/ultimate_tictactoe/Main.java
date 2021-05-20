/*
 * Main
 * 
 * Created 4-3-2021
 */

package ultimate_tictactoe;

import views.*;
import java.awt.Container;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Class that runs the whole game.
 * @author katytsao
 */
public class Main extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private Container c;
	private JPanel router;
	private Menu menu;
	private Game game;
	private Instructions info;
	private Settings settings;
	
	
	/**
	 * Main constructor — sets up JFrame window
	 * 
	 */
	public Main() throws IOException {
		super("Ultimate Tic Tac Toe");
		menu = new Menu(this);
		game = new Game(this);
		info = new Instructions(this);
		settings = new Settings(this);
		
		c = getContentPane();
		c.setBackground(java.awt.Color.WHITE);
		c.setSize(600, 600);
		
		router = menu;
		c.add(router);

		setSize(600, 600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
		setFocusable(true);
	}
	
	/**
	 * Pushes the gameview into the correct component. 
	 * 
	 * @param view The name of the component to be shown
	 */
	public void push(String view) {
		c.remove(router);
		switch(view) {
		case "menu":
			router = menu;
			break;
			
		case "game":
			router = game;
			break;
			
		case "info":
			router = info;
			break;
			
		case "settings":
			router = settings;
			break;
		}
		c.add(router);
		c.revalidate();
		revalidate();
		c.repaint();
		repaint();
	}
	
	public Game getGame() { return game; }

	/**
	 * main method
	 * creates a Main object
	 *  
	 */
	public static void main(String[] args) throws IOException {
			new Main();
	}

}