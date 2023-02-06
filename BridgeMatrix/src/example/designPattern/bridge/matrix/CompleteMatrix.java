/**
 * 
 */
package example.designPattern.bridge.matrix;

/**
 * @author apetazzi
 * 
 */
public class CompleteMatrix extends Matrix {

	/**
	 * 
	 */
	public CompleteMatrix(MatrixCollection data) {
		super(data);
		for (int x = 0; x < 10; x++)
			for (int y = 0; y < 10; y++)
				data.add(x, y, 0);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see example.pattern.bridge.matrix.Matrix#get(int, int)
	 */
	@Override
	int get(int x, int y) {
		Position p = data.get(x, y);

		return p.v;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see example.pattern.bridge.matrix.Matrix#put(int, int, int)
	 */
	@Override
	void put(int x, int y, int v) {
		data.add(x, y, v);
	}
	
}
