/*
 * Instructions page
 * 
 * Created 4-3-2021
 */

package views;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

/**
 * View with the game instructions
 * @author katytsao
 */
public class Instructions extends JPanel implements ActionListener{
	
	private static final long serialVersionUID = 1L;
	
	JButton b1 = new JButton("Main Menu");//return to main menu
	public Instructions() {
	JPanel j = new JPanel();
	
	b1.setBounds(10, 10, 20, 10);
	JLabel L1 = new JLabel(" When the game is displayed, there is a large tic-tac-toe grid and in each box there is a smaller game. \n");
	JLabel L2 = new JLabel(" Objective: to win the large game by getting three in a row");
	JLabel L3 = new JLabel(" In order to claim a box of the large game you have to win the smaller game in that location.");
	JLabel L4 = new JLabel(" NOTE: After your opponent selects a box of a small game, you have to make your next move in that same small game.");
	JLabel L5 = new JLabel(" If you are playing in multiplayer, the person who goes first ");
	
	L1.setAlignmentX(CENTER_ALIGNMENT);
	L2.setAlignmentX(CENTER_ALIGNMENT);
	L3.setAlignmentX(CENTER_ALIGNMENT); 
	L4.setAlignmentX(CENTER_ALIGNMENT);
	L5.setAlignmentX(CENTER_ALIGNMENT);
	
	L1.setBounds(50,20, 150,20); 
	j.add(L1);
	j.add(j);
	
	L2.setBounds(50,40, 150,20); 
	j.add(L2);
	add(j);
	
	L3.setBounds(50,60, 150,20); 
	j.add(L3);
	add(j);
	
	L4.setBounds(50,80, 150,20); 
	j.add(L4);
	add(j);
	
	L5.setBounds(50,100, 150,20); 
	j.add(L5);
	add(j);
	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton) e.getSource();
		if (b == b1) {
			
		}
		
	}

}