/**
 *
 */
package example.designPattern.bridge.matrix;

/**
 * @author apetazzi
 *
 */
public class SparseMatrix extends Matrix {

	/**
	 *
	 */
	public SparseMatrix(MatrixCollection data) {
		super(data);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see example.pattern.bridge.matrix.Matrix#get(int, int)
	 */

	@Override
	int get(int x, int y) {
		Position p = data.get(x, y);
		if (p == null)
			return 0;
		else
			return p.v;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see example.pattern.bridge.matrix.Matrix#put(int, int, int)
	 */

	@Override
	void put(int x, int y, int v) {
		if (v != 0)
			data.add(x, y, v);
		else
			data.remove(x, y);
	}
}
