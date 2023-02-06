package example.designPattern.decorator.multiThread;

public class SequentialPoint implements DiagonalDraggablePoint {
	private int x, y;

	public SequentialPoint() {
		x = 0;
		y = 0;
	}

	@Override
	public void moveDiagonal(int distance, String draggerName) {
		int aux = 0;
		aux = x + distance;
		System.out.println("Moved by " + draggerName + " - Origin x=" + x
				+ " y=" + y);
		x = aux;
		y = y + distance;
	}

	@Override
	public void currentPosition() {
		System.out.println("Current position : x=" + x + " y=" + y);
	}
}
