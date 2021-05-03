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

public abstract class Mark {
	
	// FIELDS
	protected Color c;
	protected Rectangle r;

	// CONSTRUCTOR
	public Mark(Rectangle box, Color color) {
		r = box;
		c = color;
	}
	
	// ABSTRACT METHODS
	public abstract void draw(Graphics g);	

}