package example.designPattern.factoryMethod.mapFramework;

import java.awt.Dimension;

@SuppressWarnings("serial")
public class Coordinates extends Dimension implements Comparable<Coordinates> {
	public Coordinates(int x, int y) {
		super(x, y);
	}


	@Override
	public int hashCode() {
		int hc = super.hashCode();
		// System.out.println("hashCode " + toString() + " hc=" + hc);

		return hc;
	}


	@Override
	public boolean equals(Object arg0) {
		Coordinates c2 = (Coordinates) arg0;
		double x = getWidth() - c2.getWidth();
		double y = getHeight() - c2.getHeight();

		return x == 0 && y == 0;
	}


	@Override
	public String toString() {
		return "(" + width + "," + height + ")";
	}

	public double distance(Coordinates c2) {
		double x = getWidth() - c2.getWidth();
		double y = getHeight() - c2.getHeight();

		return Math.sqrt(x * x + y * y);
	}


	public int compareTo(Coordinates arg0) {

		if (equals(arg0)) {
			// System.out.println("compareTo " + toString() + " "
			// + arg0.toString() + " equals(arg0)=" + equals(arg0));

			return 0;
		}

		Coordinates origin = new Coordinates(0, 0);
		double d0 = distance(origin) - arg0.distance(origin);
		// System.out.println("compareTo " + toString() + " " + arg0.toString()
		// + " d0=" + d0);

		if (d0 == 0.0)
			if (getWidth() > arg0.getWidth())
				return 1;
			else
				return -1;

		if (d0 > 0.0)
			return 1;
		else
			return -1;
	}
}
