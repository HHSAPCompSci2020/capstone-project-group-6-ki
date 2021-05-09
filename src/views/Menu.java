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
import ultimate_tictactoe.Main.STATE;

/**
 * View with the options to go to Game, Instructions, Settings
 * @author katytsao
 */
public class Menu extends JPanel implements ActionListener{
	
	private Main w;
	
	private static final long serialVersionUID = 1L;

	JButton b1 = new JButton("Settings");
		JButton b2 = new JButton("How to Play");
		JButton b3 = new JButton("Play");
		
		Instructions i = new Instructions();
		Settings s = new Settings();
	public Menu() {

		JPanel p = new JPanel();
//		p.setBackground(Color.white);
//		p.setLayout(new BoxLayout(p,BoxLayout.Y_AXIS));
//		p.add(Box.createVerticalStrut(300));
//		setOpaque(false);	

		b1.addActionListener(this);
		p.add(b1);
		add(p);
		
		b2.addActionListener(this);
		p.add(b2);
		add(p);
		
		b3.setPreferredSize(new Dimension(50,40));
		b3.setLocation(WIDTH/2, HEIGHT/2);
		b3.addActionListener(this);		
		p.add(b3);
		add(p);
p.paintComponents(getGraphics());
		}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		Font fnt0 = new Font("arial", Font.BOLD, 45);
		g.setFont(fnt0);
		g.setColor(Color.BLACK);
		g.drawString("ULTIMATE TIC-TAC-TOE", 50 , 200);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton button = (JButton)e.getSource();
		if (button == b1) {
			
			s.setVisible(true);
		}
		else if (button == b2) {
			
			i.setVisible(true);
		}
		else if (button == b3) {
			w.State = w.State.GAME;
		}
			
		
	}

}