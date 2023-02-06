package example.designPattern.observer.numberGenerator.components;

import java.util.EventListener;

interface INumberListener extends EventListener {
	void numberGenerated(NumberEvent e);
}
