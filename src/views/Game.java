/*
 * Game page
 * Shows the game and lets the user click on stuff
 * 
 * Created 4-3-2021
 */

package views;

import ultimate_tictactoe.Main;
import objects.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * View that holds the main game
 * @author katytsao
 */
public class Game extends View implements MouseListener, ActionListener {
	
	private int x, y;
	private int numMarks, numBigMarks;
	private Mark[] allMarks, allMarks2, allBigMarks, allBigMarks2;
	private Spot[] bigs;
	private Spot[][] smols;
	private int nextGrid, clickedGrid, clickedSmol;
	private Spot clickedSpot, lastSpot;
	private JButton back, undo, reset;
	// private boolean gameOver;
	
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
		
		numMarks = 0;
		allMarks = new Mark[0];
		numBigMarks = 0;
		allBigMarks = new Mark[0];
		// gameOver = false;
		
		back = new JButton("BACK");
		back.setPreferredSize(new Dimension(120, 30));
	    back.addActionListener(this);
	    add(back);
		undo = new JButton("UNDO");
		undo.setPreferredSize(new Dimension(120, 30));
	    undo.addActionListener(this);
	    add(undo);
	    reset = new JButton("RESET");
		reset.setPreferredSize(new Dimension(120, 30));
	    reset.addActionListener(this);
	    add(reset);
	}
	
	/**
	 * paintComponent method from JPanel superclass; called at each repaint
	 */
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		if(numMarks>0) {
			colorNextGrid(g);
			colorLastSpot(g);
		}
		for(int i=0; i<=9; i++) {
			drawGrid(g, bigs[i]);
		}
		drawMarks(g);
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
	
	private void colorNextGrid(Graphics g) {
		if(!bigs[nextGrid].isOccupied()) {
			g.setColor(new Color(186, 255, 191));
			g.fillRect(bigs[nextGrid].x, bigs[nextGrid].y, bigs[nextGrid].width, bigs[nextGrid].height);
		}
	}
	
	private void colorLastSpot(Graphics g) {
		g.setColor(new Color(216, 181, 255));
		g.fillRect(lastSpot.x+1, lastSpot.y+1, lastSpot.width, lastSpot.height);
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
		bigs[5] = new Spot(rx + w/3, 	ry + h/3, 		w/3, h/3);
		bigs[6] = new Spot(rx + 2*w/3, 	ry + h/3, 		w/3, h/3);
		bigs[7] = new Spot(rx + 0, 		ry + 2*h/3, 	w/3, h/3);
		bigs[8] = new Spot(rx + w/3,	ry + 2*h/3, 	w/3, h/3);
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

	private void drawMarks(Graphics g) {
		for(int i=0; i<numMarks; i++) {
			allMarks[i].draw(g);
		}
		for(int i=0; i<numBigMarks; i++) {
			allBigMarks[i].draw(g);
		}
	}

	private void createMark() {
		clickedSpot = findSpot();
		if(allowedToMark()) {
			if(numMarks%2 == 0) { // x goes first
				clickedSpot.occupy(1);
				addMark(new X(clickedSpot, clickedGrid, clickedSmol, Color.RED));
			}
			else {
				clickedSpot.occupy(2);
				addMark(new O(clickedSpot, clickedGrid, clickedSmol, Color.BLUE));
			}
		}
	}
	
	private boolean allowedToMark() {
		if(clickedSpot.width==0 || clickedSpot.height==0) return false;
		if(numMarks == 0) return true;
		if(clickedSpot.isOccupied()) return false;
		if(bigs[clickedGrid].isOccupied()) return false;
		if(!bigs[nextGrid].isOccupied() && nextGrid!=clickedGrid) return false;
		return true;
	}
	
	private Spot findSpot() {
		for(int i=1; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				if(smols[i][j].contains(x, y)) { // replaced getMousePosition()
					clickedGrid = i;
					clickedSmol = j;
					return smols[i][j];
				}
			}
		}
		return new Spot();
	}

	private void addMark(Mark m) {
		numMarks++;
		allMarks2 = new Mark[numMarks];
		for(int i=0; i<numMarks-1; i++) {
			allMarks2[i] = allMarks[i];
		}
		allMarks2[numMarks-1] = m;
		allMarks = allMarks2;
		lastSpot = clickedSpot;
		checkFor3();
		nextGrid = clickedSmol;
	}
	
	private void addBigMark(Mark m) {
		numBigMarks++;
		allBigMarks2 = new Mark[numBigMarks];
		for(int i=0; i<numBigMarks-1; i++) {
			allBigMarks2[i] = allBigMarks[i];
		}
		allBigMarks2[numBigMarks-1] = m;
		allBigMarks = allBigMarks2;
	}
	
	private void checkFor3() {
		check3(1, 2, 3);
		check3(4, 5, 6);
		check3(7, 8, 9);
		check3(1, 4, 7);
		check3(2, 5, 8);
		check3(3, 6, 9);
		check3(1, 5, 9);
		check3(3, 5, 7);
	}
	
	private void check3(int a, int b, int c) {
		int x = smols[clickedGrid][a].getOccupant();
		if (x != 0 
				&& x == smols[clickedGrid][b].getOccupant() 
				&& x == smols[clickedGrid][c].getOccupant()) {
			if(x==1) {
				addBigMark(new X(bigs[clickedGrid], clickedGrid, 0, Color.RED));
			}
			else if(x==2) {
				addBigMark(new O(bigs[clickedGrid], clickedGrid, 0, Color.BLUE));
			}
			bigs[clickedGrid].occupy(x);
			checkForBig3();
		}
	}
	
	private void checkForBig3() {
		checkBig3(1, 2, 3);
		checkBig3(4, 5, 6);
		checkBig3(7, 8, 9);
		checkBig3(1, 4, 7);
		checkBig3(2, 5, 8);
		checkBig3(3, 6, 9);
		checkBig3(1, 5, 9);
		checkBig3(3, 5, 7);
	}
	
	private void checkBig3(int a, int b, int c) {
		int x = bigs[a].getOccupant();
		if (x != 0 
				&& x == bigs[b].getOccupant() 
				&& x == bigs[c].getOccupant()) {
			if(x==1) {
				JOptionPane.showMessageDialog(null,	"X wins!", "Game over!", JOptionPane.INFORMATION_MESSAGE);
			}
			else if(x==2) {
				JOptionPane.showMessageDialog(null,	"O wins!", "Game over!", JOptionPane.INFORMATION_MESSAGE);
			}
			bigs[clickedGrid].occupy(x);
			// gameOver = true;
		}
	}
	
	private void reset() {
		numMarks = 0;
		allMarks = new Mark[0];
		numBigMarks = 0;
		allBigMarks = new Mark[0];
		repaint();
	}
	
	private void undo() {
		if(numMarks<=1) reset();
		else {
			lastSpot.clear();
			numMarks--;
			allMarks2 = new Mark[numMarks];
			for(int i=0; i<numMarks; i++) {
				allMarks2[i] = allMarks[i];
			}
			allMarks = allMarks2;
			
			if(bigs[clickedGrid].isOccupied()) {
				bigs[clickedGrid].clear();
				numBigMarks--;
				allBigMarks2 = new Mark[numBigMarks];
				for(int i=0; i<numBigMarks; i++) {
					allBigMarks2[i] = allBigMarks[i];
				}
				allBigMarks = allBigMarks2;
			}
			
			clickedGrid = allMarks[allMarks.length-1].big();
			clickedSmol = allMarks[allMarks.length-1].small();
			lastSpot = smols[clickedGrid][clickedSmol];
			nextGrid = clickedSmol;
		}
		repaint();
	}
	
	private void refresh(MouseEvent e) {
		x = e.getX();
		y = e.getY();
	}
	
	// GETTERS
	public int getNextGrid() { return nextGrid; }
	public Spot getSpot(int a, int b) { return smols[a][b]; }
	public Spot getBigSpot(int a) { return bigs[a]; }
	
	// req by ActionListener interface
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource();
		if(b==back) {
			push("menu");
		}
		else if(b==undo) {
			undo();
		}
		else if(b==reset) {
			reset();
		}		
		repaint();
	}
	
	// methods required by MouseListener interface (action is based on area that is clicked)
	public void mouseClicked(MouseEvent e) {
		refresh(e);
		createMark();
		repaint();
	}
	public void mousePressed(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}
	public void mouseEntered(MouseEvent e) {}
	public void mouseExited(MouseEvent e) {}
	
	
}