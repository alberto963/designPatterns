package example.designPattern.factoryMethod.mapFramework;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;

@SuppressWarnings("serial")
public class TestMapFramework extends JFrame {
	Container contentPane = getContentPane();
	final MapPanel panel = new MapPanel();

	RandomNodeFactory stillRandomNodeHandler = new RandomNodeFactory(getSize());
	RandomNodeFactory rotatingRandomNodeHandler = new RandomNodeFactory(getSize(), true);
	PositionalNodeFactory positionalNodeHandler = new PositionalNodeFactory(getSize());
	ConnectorFactory connectorHandler = new ConnectorFactory(getSize());

	/**
	 *
	 */
	public TestMapFramework() {
		panel.setBackground(Color.BLACK);
		contentPane.add(panel);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setSize(600, 600);
		setVisible(true);

		stillRandomNodeHandler = new RandomNodeFactory(getSize());
		rotatingRandomNodeHandler = new RandomNodeFactory(getSize(), true);
		positionalNodeHandler = new PositionalNodeFactory(getSize());
		connectorHandler = new ConnectorFactory(getSize());
		test2();
	}

	public void test2() {
		positionalNodeHandler.setX(300);
		positionalNodeHandler.setY(300);
		MapElement sun = positionalNodeHandler.create();
		panel.addElement(sun);

		positionalNodeHandler.setX(280);
		positionalNodeHandler.setY(280);
		MapElement mercury = positionalNodeHandler.create();
		panel.addElement(mercury);

		positionalNodeHandler.setX(250);
		positionalNodeHandler.setY(250);
		MapElement venus = positionalNodeHandler.create();
		panel.addElement(venus);

		positionalNodeHandler.setX(100);
		positionalNodeHandler.setY(100);
		MapElement earth = positionalNodeHandler.create();
		panel.addElement(earth);

		positionalNodeHandler.setX(100);
		positionalNodeHandler.setY(125);
		MapElement moon = positionalNodeHandler.create();
		panel.addElement(moon);

		positionalNodeHandler.setX(75);
		positionalNodeHandler.setY(75);
		MapElement mars = positionalNodeHandler.create();
		panel.addElement(mars);

		((Node) mercury).circle(30, 10, 3500, sun, true);
		((Node) venus).circle(100, 50, 5500, sun, true);
		((Node) earth).circle(225, 100, 7000, sun, true);
		((Node) moon).circle(25, 0, 500, earth, false);
		((Node) mars).circle(275, 100, 9000, sun, true);

		connectorHandler.connect(sun, mercury);
		MapElement sun_mercury = connectorHandler.create();
		panel.addElement(sun_mercury);

		connectorHandler.connect(sun, venus);
		MapElement sun_venus = connectorHandler.create();
		panel.addElement(sun_venus);

		connectorHandler.connect(sun, earth);
		MapElement sun_earth = connectorHandler.create();
		panel.addElement(sun_earth);

		connectorHandler.connect(moon, earth);
		MapElement moon_earth = connectorHandler.create();
		panel.addElement(moon_earth);

		connectorHandler.connect(sun, mars);
		MapElement sun_mars = connectorHandler.create();
		panel.addElement(sun_mars);
	}

	public void test1() {
		for (int i = 0; i < 2; i++) {
			MapElement n1 = stillRandomNodeHandler.create();
			panel.addElement(n1);
		}

		for (int i = 0; i < 2; i++) {
			MapElement n1 = rotatingRandomNodeHandler.create();
			panel.addElement(n1);
		}

		positionalNodeHandler.setX(300);
		positionalNodeHandler.setY(300);
		MapElement n2 = positionalNodeHandler.create();
		panel.addElement(n2);

		positionalNodeHandler.setX(200);
		positionalNodeHandler.setY(200);
		MapElement n3 = positionalNodeHandler.create();
		panel.addElement(n3);

		positionalNodeHandler.setX(200);
		positionalNodeHandler.setY(100);
		MapElement n4 = positionalNodeHandler.create();
		panel.addElement(n4);

		positionalNodeHandler.setX(100);
		positionalNodeHandler.setY(200);
		MapElement n5 = positionalNodeHandler.create();
		panel.addElement(n5);

		connectorHandler.connect(n2, n3);
		MapElement c23 = connectorHandler.create();
		panel.addElement(c23);

		connectorHandler.connect(n2, n4);
		MapElement c24 = connectorHandler.create();
		panel.addElement(c24);

		connectorHandler.connect(n3, n4);
		MapElement c34 = connectorHandler.create();
		panel.addElement(c34);

		connectorHandler.connect(n2, n5);
		MapElement c25 = connectorHandler.create();
		panel.addElement(c25);

		connectorHandler.connect(n3, n5);
		MapElement c35 = connectorHandler.create();
		panel.addElement(c35);

		connectorHandler.connect(n5, n4);
		MapElement c54 = connectorHandler.create();
		panel.addElement(c54);

		positionalNodeHandler.setX(101);
		positionalNodeHandler.setY(101);
		MapElement n8 = positionalNodeHandler.create();
		positionalNodeHandler.setX(201);
		positionalNodeHandler.setY(201);
		MapElement n6 = positionalNodeHandler.create();
		positionalNodeHandler.setX(201);
		positionalNodeHandler.setY(101);
		MapElement n7 = positionalNodeHandler.create();
		positionalNodeHandler.setX(101);
		positionalNodeHandler.setY(201);
		MapElement n9 = positionalNodeHandler.create();

		panel.addElement(n8);
		panel.addElement(n6);
		panel.addElement(n7);
		panel.addElement(n9);
		((Node) n2).circle(25, 25, 5000, true);
		((Node) n3).circle(25, 10, 10000, n2, true);
		((Node) n4).circle(50, 25, 15000, n2, true);
		((Node) n5).circle(75, 10, 20000, n2, true);
		((Node) n5).circle(25, 10, 1500, c23, false);
		((Node) n6).circle(25, -25, 1500, true);
		((Node) n7).circle(25, 25, 1500, true);

		MapElement n1 = stillRandomNodeHandler.create();
		for (int i = 0; i < 3; i++) {
			MapElement n21 = stillRandomNodeHandler.create();
			connectorHandler.connect(n1, n21);
			MapElement c1 = connectorHandler.create();
			panel.addElement(n1);
			panel.addElement(n21);
			panel.addElement(c1);

			n1 = n21;
		}

		positionalNodeHandler.setX(200);
		positionalNodeHandler.setY(200);
		MapElement n31 = positionalNodeHandler.create();
		panel.addElement(n31);
		for (int i = 0; i < 50; i++) {
			MapElement n41 = stillRandomNodeHandler.create();
			connectorHandler.connect(n31, n41);
			MapElement c1 = connectorHandler.create();
			panel.addElement(n41);
			panel.addElement(c1);
		}

		positionalNodeHandler.setX(100);
		positionalNodeHandler.setY(100);
		MapElement n51 = positionalNodeHandler.create();
		panel.addElement(n51);
		for (int i = 0; i < 6; i++) {
			positionalNodeHandler.setX(i * 20 + 10);
			positionalNodeHandler.setY(i * 20 + 100);
			MapElement n61 = positionalNodeHandler.create();
			connectorHandler.connect(n51, n61);
			MapElement c1 = connectorHandler.create();
			panel.addElement(n61);
			panel.addElement(c1);

		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new TestMapFramework();
			}
		});
	}
}
