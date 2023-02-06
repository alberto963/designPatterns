package example.designPattern.bridge.matrix;

public class TestBridgeMatrix {

	TestBridgeMatrix() {
		Matrix ca = new CompleteMatrix(new MatrixArray());
		ca.put(0, 0, 1);
		ca.put(5, 4, 1);
		Matrix cl = new CompleteMatrix(new MatrixList());
		cl.put(0, 0, 1);
		cl.put(5, 4, 1);
		Matrix sa = new SparseMatrix(new MatrixArray());
		sa.put(0, 0, 1);
		sa.put(5, 4, 1);
		Matrix sl = new SparseMatrix(new MatrixList());
		sl.put(0, 0, 1);
		sl.put(5, 4, 1);

		System.out.println("ca=" + ca.toString());
		System.out.println("cl=" + cl);
		System.out.println("sa=" + sa);
		System.out.println("sl=" + sl);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new TestBridgeMatrix();
	}

}
