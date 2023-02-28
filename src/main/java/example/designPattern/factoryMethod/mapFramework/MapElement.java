/**
 *
 */
package example.designPattern.factoryMethod.mapFramework;

import java.awt.Graphics;

/**
 * @author apetazzi
 *
 */
public abstract class MapElement {

	/**
	 *
	 */
	protected String label = "unset";

	/**
	 *
	 */
	protected int x;

	/**
	 *
	 */
	protected int y;

	public void draw(Graphics g) {

	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}
}
