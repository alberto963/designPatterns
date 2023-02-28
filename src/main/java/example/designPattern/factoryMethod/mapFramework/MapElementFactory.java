/**
 *
 */
package example.designPattern.factoryMethod.mapFramework;

import java.awt.Dimension;

/**
 * @author apetazzi
 *
 */
public abstract class MapElementFactory {

	protected Dimension viewport;
	protected boolean circle;

	/**
	 *
	 */
	public MapElementFactory(Dimension viewport) {
		this(viewport, false);
	}

	/**
	 *
	 */
	public MapElementFactory(Dimension viewport, boolean circle) {
		this.viewport = viewport;
		this.circle = circle;
	}

	/**
	 *
	 */
	public MapElement create() {
		return newElement();
	}

	/**
	 *
	 */
	protected abstract MapElement newElement();

}
