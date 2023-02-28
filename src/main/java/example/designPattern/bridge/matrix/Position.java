/**
 *
 */
package example.designPattern.bridge.matrix;

/**
 * @author apetazzi
 *
 */
public class Position {

	/**
	 *
	 */
	int x;
	/**
	 *
	 */
	int y;
	/**
	 *
	 */
	int v;

	/**
	 *
	 */
	public Position(int x, int y, int v) {
		this.x = x;
		this.y = y;
		this.v = v;
	}


	@Override
	public String toString() {
		return "x=" + x + " y=" + y + " v=" + v;
	}
}
