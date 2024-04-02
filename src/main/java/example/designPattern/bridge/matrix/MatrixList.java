package example.designPattern.bridge.matrix;

import java.util.LinkedList;

public class MatrixList implements MatrixCollection {
	LinkedList<Position> list = new LinkedList<Position>();

	public void add(int x, int y, int v) {
		Position p = get(x, y);
		if (p == null)
			list.add(new Position(x, y, v));
		else
			p.v = v;
	}

	public Position get(int x, int y) {
		for (Position p : list)
			if (p.x == x && p.y == y)
				return p;

		return null;
	}

	public void remove(int x, int y) {
		Position p = get(x, y);
		if (p != null)
			list.remove(p);
	}


	@Override
	public String toString() {
		return list.toString();
	}
}
