/**
 *
 */
package example.designPattern.bridge.matrix;

/**
 * @author apetazzi
 *
 */
public abstract class Matrix {
	MatrixCollection data;

	/**
	 *
	 */
	public Matrix(MatrixCollection data) {
		this.data = data;
	}

	/**
	 *
	 */
	abstract void put(int x, int y, int v);

	/**
	 *
	 */
	abstract int get(int x, int y);


	@Override
	public String toString() {
		return data.toString();
	}
}
