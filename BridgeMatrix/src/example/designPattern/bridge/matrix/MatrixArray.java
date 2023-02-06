/**
 * 
 */
package example.designPattern.bridge.matrix;

import java.util.Vector;

/**
 * @author apetazzi
 * 
 */
public class MatrixArray implements MatrixCollection {
	final int MAX = 10;
	Vector<Position> vector = new Vector<Position>(MAX * MAX);

	public MatrixArray() {
		super();
		for (int x = 0; x < MAX; x++)
			for (int y = 0; y < MAX; y++)
				vector.add(x * MAX + y, null);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see example.pattern.bridge.matrix.MatrixCollection#add(int, int)
	 */
	@Override
	public void add(int x, int y, int v) {
		Position p = new Position(x, y, v);
		vector.set(x * MAX + y, p);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see example.pattern.bridge.matrix.MatrixCollection#get(int, int)
	 */
	@Override
	public Position get(int x, int y) {
		return vector.get(x * MAX + y);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see example.pattern.bridge.matrix.MatrixCollection#remove(int, int)
	 */
	@Override
	public void remove(int x, int y) {
		vector.remove(x * MAX + y);
	}

	@Override
	public String toString() {
		return vector.toString();
	}
}
