/**
 *
 */
package example.designPattern.factoryMethod.mapFramework;

import java.awt.Dimension;

/**
 * @author apetazzi
 *
 */
public class PositionalNodeFactory extends MapElementFactory {

	/**
	 *
	 */
	private int x;

	/**
	 *
	 */
	private int y;

	/**
	 * @param viewport
	 *
	 */
	public PositionalNodeFactory(Dimension viewport) {
		super(viewport);
	}

	/**
	 * @param viewport
	 *
	 */
	public PositionalNodeFactory(Dimension viewport, boolean circle) {
		super(viewport, circle);
	}

	/**
	 * @param x the x to set
	 */
	public void setX(int x) {
		this.x = x;
	}

	/**
	 * @param y the y to set
	 */
	public void setY(int y) {
		this.y = y;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * example.pattern.factoryMethod.mapFramework.MapElementFactory#newElement()
	 */

	@Override
	protected MapElement newElement() {
		Node node = new Node(x, y);
		if (circle)
			node.circle();

		return node;
	}
}
