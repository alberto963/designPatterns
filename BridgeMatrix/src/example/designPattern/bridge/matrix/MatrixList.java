/**
 * 
 */
package example.designPattern.bridge.matrix;

import java.util.LinkedList;

/**
 * @author apetazzi
 * 
 */
public class MatrixList implements MatrixCollection {
	LinkedList<Position> list = new LinkedList<Position>();

	/*
	 * (non-Javadoc)
	 * 
	 * @see example.pattern.bridge.matrix.MatrixCollection#add(int, int)
	 */
	@Override
	public void add(int x, int y, int v) {
		Position p = get(x, y);
		if (p == null)
			list.add(new Position(x, y, v));
		else
			p.v = v;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see example.pattern.bridge.matrix.MatrixCollection#get(int, int)
	 */
	@Override
	public Position get(int x, int y) {
		for (Position p : list)
			if (p.x == x && p.y == y)
				return p;

		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see example.pattern.bridge.matrix.MatrixCollection#remove(int, int)
	 */
	@Override
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
