/*
 * Settings page
 * 
 * Created 4-3-2021
 */

package views;

import javax.swing.JButton;
import ultimate_tictactoe.Main;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.*;


/**
 * View that allows users to change colors and icons and AI's.
 * @author katytsao
 */
public class Settings extends View implements ActionListener{
	
	private static final long serialVersionUID = 1L;
	private JButton back;
	/**
	 * Displays the functions of the Settings page
	 */
	public Settings(Main router) {
		super(router);
		setBackground(Color.getHSBColor(290f / 360, 0.15f, 0.98f));
		
		back = new JButton("Main Menu"); // return to main menu
		back.addActionListener(this);
		back.setBounds(10, 10, 20, 10);
		add(back);
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		Font fnt0 = new Font("arial", Font.PLAIN, 15);
		g.setFont(fnt0);
		g.setColor(Color.BLACK);
		g.drawString("Change icon color of \"X\"", 50 , 200);
		g.drawString("Change icon color of \"O\"", 350 , 200);
		g.drawString("AI Level", 150 , 400);
		
	}

	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource();
		if (b == back) {
			push("menu");
		}		
	}

}