package example.designPattern.observer.numberGenerator;

import java.util.EventListener;
import java.util.EventObject;
import java.util.LinkedList;
import java.util.List;

interface NumberGeneratorAdapter extends EventListener {
	void numberGenerated(NumberEvent e);
}

interface NumberEventListHandler {
	void addNumberListener(NumberGeneratorAdapter listener);

	void removeNumberListener(NumberGeneratorAdapter listener);

	void start(int n);

	void fireNewNumber();
}

@SuppressWarnings("serial")
class NumberEvent extends EventObject {
	private double n = 0;

	NumberEvent(Object arg0, double n) {
		super(arg0);
		this.n = n;
	}

	double getN() {
		return n;
	}
};

class GeneratorWithGenericEventList implements NumberEventListHandler {
	private List<NumberGeneratorAdapter> listeners;

	GeneratorWithGenericEventList() {
		listeners = new LinkedList<NumberGeneratorAdapter>();
	}

	public void start(int n) {
		for (int i = 0; i < n; i++)
			fireNewNumber();
	}

	public void addNumberListener(NumberGeneratorAdapter listener) {
		listeners.add(listener);
	}

	public void removeNumberListener(NumberGeneratorAdapter listener) {
		listeners.remove(listener);
	}

	public void fireNewNumber() {
		NumberEvent ne = new NumberEvent(this, Math.random());
		for (NumberGeneratorAdapter l : listeners)
			l.numberGenerated(ne);
	}
};

class MyNumberListener implements NumberGeneratorAdapter {
	private String name;

	MyNumberListener(String name) {
		this.name = name;
	}

	@Override
	public void numberGenerated(NumberEvent e) {
		System.out.println("Name=" + name + " Generated n=" + e.getN());
	}
}

class TestEventListener {

	public TestEventListener(NumberEventListHandler g) {

		MyNumberListener l1 = new MyNumberListener("L1");
		MyNumberListener l2 = new MyNumberListener("L2");

		g.addNumberListener(l1);
		g.addNumberListener(l2);
		g.addNumberListener(new NumberGeneratorAdapter() {
			@Override
			public void numberGenerated(NumberEvent e) {
				System.out.println("Name=" + "L3" + " Generated n=" + e.getN());
			}
		});

		g.start(5);

		g.removeNumberListener(l1);
		g.start(3);
	}

	public static void main(String[] args) {
		new TestEventListener(new GeneratorWithGenericEventList());
		new TestEventListener(new GeneratorWithEventListenerList());
	}
}
