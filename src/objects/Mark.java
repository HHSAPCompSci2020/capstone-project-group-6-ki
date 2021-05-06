/*
 * Mark
 * Abstract superclass for x and o
 * 
 * Created 4-3-2021
 */

package objects;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

/**
 * Represents one mark (like X or O).
 * @author katytsao
 */
public abstract class Mark {
	
	// FIELDS
	protected Color c;
	protected Rectangle r;

	// CONSTRUCTOR
	/**
	 * Create a new Mark object
	 * @param box The rectangle that the mark will be inside
	 * @param color The color of the mark
	 */
	public Mark(Rectangle box, Color color) {
		r = box;
		c = color;
	}
	
	// ABSTRACT METHODS
	/**
	 * Draw the Mark
	 * @param g The Graphics object to draw with
	 */
	public abstract void draw(Graphics g);	

}