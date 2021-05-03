/*
 * Spot
 * Represents one spot of a box
 * 
 * Created 4-3-2021
 */

package objects;

import java.awt.Rectangle;

public class Spot extends Rectangle {

	private boolean isOccupied;
	private int occupant;
	private static final long serialVersionUID = 1L;
	
	public Spot() {
		super();
		isOccupied = false;
		occupant = 0;
	}
	
	public Spot(int x, int y, int w, int h) {
		super(x, y, w, h);
		isOccupied = false;
	}
	
	public boolean isOccupied() {
		return isOccupied;
	}
	
	public void occupy() {
		isOccupied = true;
	}
	
	public void occupy(int x) {
		occupant = x;
		isOccupied = true;
	}
	
	public void clear() {
		occupant = 0;
		isOccupied = false;
	}
	
	public int getOccupant() {
		return occupant;
	}

}