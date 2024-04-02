package example.designPattern.bridge.matrix;

import java.util.Vector;

public class MatrixArray implements MatrixCollection {
	final int MAX = 10;
	Vector<Position> vector = new Vector<Position>(MAX * MAX);

	public MatrixArray() {
		super();
		for (int x = 0; x < MAX; x++)
			for (int y = 0; y < MAX; y++)
				vector.add(x * MAX + y, null);
	}

	public void add(int x, int y, int v) {
		Position p = new Position(x, y, v);
		vector.set(x * MAX + y, p);
	}

	public Position get(int x, int y) {
		return vector.get(x * MAX + y);
	}

	public void remove(int x, int y) {
		vector.remove(x * MAX + y);
	}

	@Override
	public String toString() {
		return vector.toString();
	}
}
