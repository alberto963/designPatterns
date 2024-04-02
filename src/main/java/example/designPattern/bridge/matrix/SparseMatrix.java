package example.designPattern.bridge.matrix;

public class SparseMatrix extends Matrix {

	public SparseMatrix(MatrixCollection data) {
		super(data);
	}

	@Override
	int get(int x, int y) {
		Position p = data.get(x, y);
		if (p == null)
			return 0;
		else
			return p.v;
	}

	@Override
	void put(int x, int y, int v) {
		if (v != 0)
			data.add(x, y, v);
		else
			data.remove(x, y);
	}
}
