/*
 * Game page
 * Shows the game and lets the user click on stuff
 * 
 * Created 4-3-2021
 */

package views;

import ultimate_tictactoe.Main;
import objects.Spot;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; 

/**
 * View that holds the main game
 * @author katytsao
 */
public class Game extends View implements MouseListener, ActionListener {
	
	private Spot[] bigs;
	private Spot[][] smols;
	private double margin = 0.1; // how much of the space will each small grid take? this means 0.1 margin on each side
	private double m2 = 1-margin; // the other end of the big margin
	private double f = 1 - 2*margin;
	private static final long serialVersionUID = 1L;

	/**
	 * Creates a new Game component and draws all the grids
	 */
	public Game(Main router) {
		super(router);
		addMouseListener(this);
		setSize(600, 600);
		
		bigs = new Spot[10];
		smols = new Spot[10][10];
		setRectangles();
	}
	
	/**
	 * paintComponent method from JPanel superclass; called at each repaint
	 */
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		for(int i=0; i<=9; i++) {
			drawGrid(g, bigs[i]);
		}
	}
	
	private void drawGrid(Graphics g, Rectangle r) {
		g.setColor(Color.BLACK);
		
		g.drawLine((int)(r.x + r.width*f/3 + r.width*margin), (int)(r.y + r.height*margin), 
				(int)(r.x + r.width*f/3 + r.width*margin), (int)(r.y + r.height*m2));
		g.drawLine((int)(r.x + 2*r.width*f/3 + r.width*margin), (int)(r.y + r.height*margin), 
				(int)(r.x + 2*r.width*f/3 + r.width*margin), (int)(r.y + r.height*m2));
		g.drawLine((int)(r.x + r.width*margin), (int)(r.y + r.height*f/3 + r.height*margin), 
				(int)(r.x + r.width*m2), (int)(r.y + r.height*f/3 + r.height*margin));
		g.drawLine((int)(r.x + r.width*margin), (int)(r.y + 2*r.height*f/3 + r.height*margin), 
				(int)(r.x + r.width*m2), (int)(r.y + 2*r.height*f/3 + r.height*margin));
	}
	
	private void setRectangles() {
		int w = 600;
		int h = 600;
		w += (int)(w*margin + 0.5);
		h += (int)(h*margin + 0.5);
		int rx = (int)(w*margin/2 + 0.5);
		int ry = (int)(h*margin/2 + 0.5);
		
		bigs[0] = new Spot(0-rx, 0-ry, w, h);
		w = (int)(w*f + 0.5);
		h = (int)(h*f + 0.5);
		bigs[1] = new Spot(rx + 0, 		ry + 0, 		w/3, h/3);
		bigs[2] = new Spot(rx + w/3,  	ry + 0, 		w/3, h/3);
		bigs[3] = new Spot(rx + 2*w/3, 	ry + 0, 		w/3, h/3);
		bigs[4] = new Spot(rx + 0, 		ry + h/3, 		w/3, h/3);
		bigs[5] = new Spot(rx + w/3, 		ry + h/3, 		w/3, h/3);
		bigs[6] = new Spot(rx + 2*w/3, 	ry + h/3, 		w/3, h/3);
		bigs[7] = new Spot(rx + 0, 		ry + 2*h/3, 	w/3, h/3);
		bigs[8] = new Spot(rx + w/3,		ry + 2*h/3, 	w/3, h/3);
		bigs[9] = new Spot(rx + 2*w/3, 	ry + 2*h/3, 	w/3, h/3);
		
		for(int i=0; i<=9; i++) {
			rx = bigs[i].x + (int)(bigs[i].width*margin);
			ry = bigs[i].y + (int)(bigs[i].height*margin);
			w = (int)(bigs[i].width*f);
			h = (int)(bigs[i].height*f);
			smols[i][1] = new Spot(rx + 0+ 1, 		ry + 0 + 1, 		w/3-1, h/3-1);
			smols[i][2] = new Spot(rx + w/3 + 1,  	ry + 0 + 1, 		w/3-1, h/3-1);
			smols[i][3] = new Spot(rx + 2*w/3 + 1,  ry + 0 + 1, 		w/3-1, h/3-1);
			smols[i][4] = new Spot(rx + 0 + 1,  	ry + h/3 + 1, 		w/3-1, h/3-1);
			smols[i][5] = new Spot(rx + w/3 + 1, 	ry + h/3 + 1, 		w/3-1, h/3-1);
			smols[i][6] = new Spot(rx + 2*w/3 + 1,	ry + h/3 + 1, 		w/3-1, h/3-1);
			smols[i][7] = new Spot(rx + 0 + 1,		ry + 2*h/3 + 1, 	w/3-1, h/3-1);
			smols[i][8] = new Spot(rx + w/3 + 1, 	ry + 2*h/3 + 1, 	w/3-1, h/3-1);
			smols[i][9] = new Spot(rx + 2*w/3 + 1,	ry + 2*h/3 + 1, 	w/3-1, h/3-1);
		}
	}
	
	public void actionPerformed(ActionEvent e) {}

	// Methods required by MouseListener interface (action is based on area that is clicked)
	public void mouseClicked(MouseEvent e) {}
	public void mousePressed(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}
	public void mouseEntered(MouseEvent e) {}
	public void mouseExited(MouseEvent e) {}

}