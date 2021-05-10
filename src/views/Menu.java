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
	
	public Menu(Main router) {
		super(router);
		settings = new JButton("Settings");
		settings.addActionListener(this);
		add(settings);
		
		info = new JButton("How to Play");
		info.addActionListener(this);
		add(info);
		
		game = new JButton("Play");
		game.setPreferredSize(new Dimension(50,40));
		game.setLocation(WIDTH/2, HEIGHT/2);
		game.addActionListener(this);		
		add(game);
	}
	
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