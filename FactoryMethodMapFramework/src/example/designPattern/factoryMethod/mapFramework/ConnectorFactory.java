/**
 * 
 */
package example.designPattern.factoryMethod.mapFramework;

import java.awt.Dimension;

/**
 * @author apetazzi
 * 
 */
public class ConnectorFactory extends MapElementFactory {
	Node node1 = null;
	Node node2 = null;

	/**
	 * @param viewport
	 * 
	 */
	public ConnectorFactory(Dimension viewport) {
		super(viewport);
	}

	@Override
	protected MapElement newElement() {
		return new Connector(node1, node2);
	}

	/**
	 * 
	 */
	public void connect(MapElement n1, MapElement n2) {
		node1 = (Node) n1;
		node2 = (Node) n2;
	}
}
