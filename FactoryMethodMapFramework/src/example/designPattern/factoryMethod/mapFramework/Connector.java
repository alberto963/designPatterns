/**
 * 
 */
package example.designPattern.factoryMethod.mapFramework;

import java.awt.Color;
import java.awt.Graphics;

/**
 * @author apetazzi
 * 
 */
public class Connector extends MapElement {

	/**
	 * 
	 */
	private Node node1;

	/**
	 * 
	 */
	private Node node2;

	/**
	 * @return the x
	 */
	public int computeAvgX() {
		if (node1.getX() < node2.getX())
			x = node1.getX() + Math.abs(node1.getX() - node2.getX()) / 2;
		else
			x = node2.getX() + Math.abs(node1.getX() - node2.getX()) / 2;

		return x;
	}

	/**
	 * @return the y
	 */
	public int computeAvgY() {
		if (node1.getY() < node2.getY())
			y = node1.getY() + Math.abs(node1.getY() - node2.getY()) / 2;
		else
			y = node2.getY() + Math.abs(node1.getY() - node2.getY()) / 2;

		return y;
	}

	/**
	 * 
	 */
	public Connector(Node node1In, Node node2In) {
		node1 = node1In;
		node2 = node2In;
		x = computeAvgX();
		y = computeAvgY();
	}

	public void draw(Graphics g) {
		g.setColor(Color.WHITE);
		g.drawLine(node1.getX(), node1.getY(), node2.getX(), node2.getY());
		g.setColor(Color.BLUE);
		g.drawRect(computeAvgX() - 1, computeAvgY() - 1, 3, 3);
	}
}
