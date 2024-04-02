package example.designPattern.bridge.matrix;

public class Position {

	int x, y, v;
	
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
