/*
 * RandomPlayer
 * An AI that literally just makes a random move.
 * 
 * Created 4-3-2021
 */

package ai;

import components.DrawingPanel;
import objects.Spot;

/**
 * A Level-1 AI that has zero strategy and literally randomly selects an available location to play in.
 * @author katytsao
 */
public class RandomPlayer extends AI {

	/**
	 * Creates a Level-1 AI
	 * @param board The DrawingPanel that the RandomPlayer plays in
	 */
	public RandomPlayer(DrawingPanel board) {
		super(board);
	}
	
	/**
	 * Chooses a Spot to play in
	 * @return The Spot that the RandomPlayer chose to play in
	 */
	public Spot makeMove() {
		return null;
	}

}