package example.designPattern.observer.numberGenerator.components;

import java.util.LinkedList;
import java.util.List;

public class ZeroSubject implements INumberSubjectFactory {
	private List<INumberListener> listeners;

	ZeroSubject() {
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
		NumberEvent ne = new NumberEvent(this, 0);
		for (INumberListener l : listeners)
			l.numberGenerated(ne);
	}
};
