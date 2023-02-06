package example.designPattern.observer.numberGenerator;

import javax.swing.event.EventListenerList;

class GeneratorWithEventListenerList implements NumberEventListHandler {

	private EventListenerList listeners;

	GeneratorWithEventListenerList() {
		listeners = new EventListenerList();
	}

	public void start(int n) {
		for (int i = 0; i < n; i++)
			fireNewNumber();
	}

	public void addNumberListener(NumberGeneratorAdapter listener) {
		listeners.add(NumberGeneratorAdapter.class, listener);
	}

	public void removeNumberListener(NumberGeneratorAdapter listener) {
		listeners.remove(NumberGeneratorAdapter.class, listener);
	}

	public void fireNewNumber() {
		NumberEvent ne = new NumberEvent(this, Math.random());
		Object[] listenersList = listeners.getListenerList();
		for (int i = 0; i < listenersList.length; i+=2) {
			if (listenersList[i] == NumberGeneratorAdapter.class) {
				((NumberGeneratorAdapter) listenersList[i + 1])
						.numberGenerated(ne);
			}
		}
	}
};