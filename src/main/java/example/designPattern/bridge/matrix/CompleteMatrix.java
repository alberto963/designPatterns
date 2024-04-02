package example.designPattern.bridge.matrix;

public class CompleteMatrix extends Matrix {

	public CompleteMatrix(MatrixCollection data) {
		super(data);
		for (int x = 0; x < 10; x++)
			for (int y = 0; y < 10; y++)
				data.add(x, y, 0);
	}

	@Override
	int get(int x, int y) {
		Position p = data.get(x, y);

		return p.v;
	}

	@Override
	void put(int x, int y, int v) {
		data.add(x, y, v);
	}
}
