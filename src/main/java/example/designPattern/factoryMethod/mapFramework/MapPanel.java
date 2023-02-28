package example.designPattern.factoryMethod.mapFramework;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class MapPanel extends JPanel {

	private Map<Coordinates, MapElement> elements;
	private Coordinates c0 = null;
	private MapElement me = null;

	public MapPanel() {

		elements = new Hashtable<Coordinates, MapElement>();

		setBorder(BorderFactory.createLineBorder(Color.black));

		addMouseListener(new MouseAdapter() {

			@Override
			public void mousePressed(final MouseEvent e) {
				// System.out.println("Pressed x=" + e.getX() + " y=" +
				// e.getY());
				// System.out.println("Elements=" + elements);

				me = find(new Coordinates(e.getX(), e.getY()));
				if (me != null)
					c0 = new Coordinates(me.getX(), me.getY());

				repaint();
			}
		});

		addMouseListener(new MouseAdapter() {

			@Override
			public void mouseReleased(MouseEvent e) {
				if (me != null) {
					// Check that the specific element is not already in
					// the table, otherwise it will be removed
					if (elements.containsKey(new Coordinates(me.getX(), me.getY()))) {

						me.setX((int) c0.getWidth());
						me.setY((int) c0.getHeight());

						me = null;

						return;
					}

					elements.remove(new Coordinates((int) c0.getWidth(), (int) c0.getHeight()));
					elements.put(new Coordinates(me.getX(), me.getY()), me);
					me = null;
				}
			}
		});

		addMouseMotionListener(new MouseAdapter() {

			@Override
			public void mouseDragged(MouseEvent e) {
				// System.out.println("Dragged x=" + e.getX() + " y=" +
				// e.getY());

				if (me != null) {
					// System.out
					// .println("Found x=" + e.getX() + " y=" + e.getY());

					me.setX(e.getX());
					me.setY(e.getY());

					repaint();
				}
			}
		});

		ScheduledThreadPoolExecutor ex = new ScheduledThreadPoolExecutor(1);
		ex.scheduleAtFixedRate(new Runnable() {


			public void run() {
				repaint();

			}
		}, 0, 10, TimeUnit.MILLISECONDS);
	}

	public void addElement(MapElement me) {
		elements.put(new Coordinates(me.getX(), me.getY()), me);
	}


	@Override
	public Dimension getPreferredSize() {
		return new Dimension(250, 200);
	}


	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		for (MapElement me : elements.values())
			me.draw(g);
	}

	public MapElement find(Coordinates point) {
		MapElement me = null;

		double min = Double.MAX_VALUE;

		for (Coordinates c : elements.keySet()) {
			double d = c.distance(point);
			if (min > d) {
				min = d;
				me = elements.get(c);
			}
		}

		if (min < 5)
			return me;
		else
			return null;
	}
}
