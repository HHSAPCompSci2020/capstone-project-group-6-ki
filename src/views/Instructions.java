/*
 * Instructions page
 * 
 * Created 4-3-2021
 */

package views;

import ultimate_tictactoe.Main;
import java.awt.event.*;
import javax.swing.*;

/**
 * View with the game instructions
 * @author katytsao
 */
public class Instructions extends View implements ActionListener {

	private JButton back;
	private static final long serialVersionUID = 1L;
	
	public Instructions(Main router) {
		super(router);
		
		back = new JButton("Main Menu"); // return to main menu
		back.addActionListener(this);
		back.setBounds(10, 10, 20, 10);
		add(back);
		
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
		add(L1);

		L2.setBounds(50,40, 150,20); 
		add(L2);

		L3.setBounds(50,60, 150,20); 
		add(L3);

		L4.setBounds(50,80, 150,20); 
		add(L4);

		L5.setBounds(50,100, 150,20); 
		add(L5);
	}

	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource();
		if (b == back) {
			push("menu");
		}
	}

}