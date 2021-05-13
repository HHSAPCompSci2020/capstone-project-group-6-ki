/*
 * Menu page
 * 
 * Created 4-3-2021
 */

package views;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;
import ultimate_tictactoe.Main;

/**
 * View with the options to go to Game, Instructions, Settings
 * @author katytsao
 */
public class Menu extends View implements ActionListener {
	
	private JButton settings, info, game;
	private static final long serialVersionUID = 1L;
	/** 
	 * Displays the main menu of the game 
	 * @param router
	 */
	public Menu(Main router) {
		super(router);
		JPanel p = new JPanel(new GridBagLayout());
		p.setBackground(Color.white);
		
//		GridBagConstraints c = new GridBagConstraints();
		
//		c.insets = new Insets(10,10,25,25);
//		c.gridx = 50;
//		c.gridy = 100;
		
		settings = new JButton("Settings");
		settings.setBounds(400, 500, 100, 100);
		settings.addActionListener(this);
		p.add(settings);
		
//		c.gridx = 50;
//		c.gridy = 120;
		info = new JButton("How to Play");
		info.addActionListener(this);
		p.add(info);
		
//		c.gridx = 50;
//		c.gridy = 140;
		game = new JButton("Play");
		game.setPreferredSize(new Dimension(100,60));
//		game.
		game.addActionListener(this);		
		p.add(game);
		
		add(p);
	}
	/**
	 * paintComponent method from JPanel superclass; called at each repaint
	 */
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		Font fnt0 = new Font("arial", Font.BOLD, 45);
		g.setFont(fnt0);
		g.setColor(Color.BLACK);
		g.drawString("ULTIMATE TIC-TAC-TOE", 50 , 200);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource();
		if(b==settings) {
			push("settings");
		}
		else if(b==info) {
			push("info");
		}
		else if(b==game) {
			push("game");
		}
	}

}