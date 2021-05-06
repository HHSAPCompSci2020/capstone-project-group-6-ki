/*
 * AI
 * Abstract class for an AI
 * 
 * Created 4-3-2021
 */

package ai;

import components.DrawingPanel;
import objects.Spot;

/**
 * Abstract superclass for all future AI classes.
 * @author katytsao
 */
public abstract class AI {
	
	private DrawingPanel board;

	/**
	 * Creates a new AI
	 * @param board The DrawingPanel that this AI will play in
	 */
	public AI(DrawingPanel board) {
		this.board = board;
	}
	
	/**
	 * Getter for the DrawingPanel that this AI is in.
	 * @return The DrawingPanel
	 */
	public DrawingPanel getBoard() {
		return board;
	}
	
	/**
	 * Abstract method to be an AI's move decision.
	 * @return The Spot that the AI chooses to play in
	 */
	public abstract Spot makeMove();

}