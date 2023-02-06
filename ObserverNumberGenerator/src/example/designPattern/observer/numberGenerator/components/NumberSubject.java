package example.designPattern.observer.numberGenerator.components;

import java.util.LinkedList;
import java.util.List;

class NumberSubject implements INumberSubjectFactory {
	private List<INumberListener> listeners;

	NumberSubject() {
		listeners = new LinkedList<INumberListener>();
	}

	public void start(int n) {
		for (int i = 0; i < n; i++)
			fireNewNumber();
	}

	public void addNumberListener(INumberListener listener) {
		listeners.add(listener);
	}

	public void removeNumberListener(INumberListener listener) {
		listeners.remove(listener);
	}

	public void fireNewNumber() {
		NumberEvent ne = new NumberEvent(this, Math.random());
		for (INumberListener l : listeners)
			l.numberGenerated(ne);
	}
};
