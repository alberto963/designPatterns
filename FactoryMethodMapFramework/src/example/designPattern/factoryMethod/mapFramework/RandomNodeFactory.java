/**
 * 
 */
package example.designPattern.factoryMethod.mapFramework;

import java.awt.Dimension;

/**
 * @author apetazzi
 * 
 */
public class RandomNodeFactory extends MapElementFactory {

	/**
	 * @param viewport
	 * 
	 */
	public RandomNodeFactory(Dimension viewport) {
		super(viewport);
	}

	/**
	 * @param viewport
	 * 
	 */
	public RandomNodeFactory(Dimension viewport, boolean circle) {
		super(viewport, circle);
	}

	@Override
	protected MapElement newElement() {

		int x = (int) (Math.random() * viewport.getWidth());
		int y = (int) (Math.random() * viewport.getHeight());

		Node node = new Node(x, y);
		if (circle)
			node.circle();

		return node;
	}
}
