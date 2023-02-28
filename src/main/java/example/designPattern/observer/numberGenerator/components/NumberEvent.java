package example.designPattern.observer.numberGenerator.components;

import java.util.EventObject;

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
}
