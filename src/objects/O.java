/*
 * O
 * Represents an O mark
 * 
 * Created 4-3-2021
 */

package objects;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class O extends Mark {

	public O(Rectangle box, int big, int small, Color color) {
		super(box, big, small, color);
	}
	
	public void draw(Graphics g) {
		g.setColor(c);
		int rad = (int)(0.7*Math.min(r.width, r.height));
		g.drawOval(r.x + (r.width-rad)/2, r.y + (r.height-rad)/2, rad, rad);
	}

}