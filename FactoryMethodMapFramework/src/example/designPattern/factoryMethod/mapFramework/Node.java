/**
 * 
 */
package example.designPattern.factoryMethod.mapFramework;

import java.awt.Color;
import java.awt.Graphics;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author apetazzi
 * 
 */
public class Node extends MapElement {

	private ScheduledThreadPoolExecutor ex = new ScheduledThreadPoolExecutor(1);

	public Node(int xIn, int yIn) {
		x = xIn;
		y = yIn;
		label = Integer.toString(x) + "," + Integer.toString(y);
	}

	public void draw(Graphics g) {
		// System.out.println("draw: x="+ x + " y="+y);

		g.setColor(Color.GREEN);
		g.fillOval(x - 4, y - 4, 9, 9);
		g.setColor(Color.BLUE);
		g.drawString(label, x, y);
	}

	public void circle() {
		circle(true);
	}

	public void circle(boolean clockwise) {
		circle(1000, clockwise);
	}

	public void circle(final int p, boolean clockwise) {
		circle(100, 0, p, clockwise);
	}

	public void circle(int r, int p, boolean clockwise) {
		circle(r, 0, p, clockwise);
	}

	public void circle(int r, int d0, int p, boolean clockwise) {
		double l = r / Math.sqrt(2);
		double x0 = getX() + l;
		double y0 = getY() + l;

		circle(r, d0, p, new Node((int) x0, (int) y0), clockwise);
	}

	public void circle(int r, int p, MapElement n, boolean clockwise) {
		circle(r, 0, p, n, clockwise);
	}

	public void circle(final int r, int d0, int p, final MapElement n,
			final boolean clockwise) {
		int q = 500;
		final int sleep = p / q;
		final double d = 2 * Math.PI / q;
		final int r1 = r - d0;
		final int r2 = r + d0;

		ex.execute(new Runnable() {

			@Override
			public void run() {
				while (true)
					for (double t = 0; t <= 2 * Math.PI; t += d) {
						double x0 = n.getX();
						double y0 = n.getY();
						int y = (int) (y0 + r1
								* ((clockwise) ? Math.sin(t) : Math.cos(t)));
						int x = (int) (x0 + r2
								* ((clockwise) ? Math.cos(t) : Math.sin(t)));
						setX(x);
						setY(y);

						// System.out.println("run: x=" + x + " y=" + y);
						try {
							Thread.sleep(sleep);
						} catch (InterruptedException e) {
						}
					}
			}
		});
	};

	public void circle2(final int r) {

		ex.scheduleAtFixedRate(new Runnable() {

			@Override
			public void run() {

				int x0 = getX();
				int y0 = getY();

				for (int x = -r; x < r; x++) {
					int y = (int) Math.sqrt(r * r - x * x);
					setX(x0 + x + r);
					setY(y0 - y);

					// System.out.println("run: x=" + x + " y=" + y);
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
					}
				}

				x0 = getX();
				y0 = getY();

				for (int x = r; x > -r; x--) {
					int y = (int) Math.sqrt(r * r - x * x);
					setX(x0 + x - r);
					setY(y0 + y);

					// System.out.println("run: x=" + x + " y=" + y);
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
					}
				}
			}
		}, 0, 200, TimeUnit.MILLISECONDS);
	};

	public void circle2B(final int r) {
		ex.scheduleAtFixedRate(new Runnable() {

			@Override
			public void run() {
				int x0 = getX();
				int y0 = getY();

				for (int x = r; x > -r; x--) {
					int y = (int) Math.sqrt(r * r - x * x);
					setX(x0 + x - r);
					setY(y0 - y);

					// System.out.println("run: x=" + x + " y=" + y);
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
					}
				}

				x0 = getX();
				y0 = getY();

				for (int x = -r; x < r; x++) {
					int y = (int) Math.sqrt(r * r - x * x);
					setX(x0 + x + r);
					setY(y0 + y);

					// System.out.println("run: x=" + x + " y=" + y);
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
					}
				}

			}
		}, 0, 2000, TimeUnit.MILLISECONDS);
	};
}
