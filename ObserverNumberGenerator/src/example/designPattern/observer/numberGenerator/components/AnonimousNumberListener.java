package example.designPattern.observer.numberGenerator.components;

public class AnonimousNumberListener implements INumberListener {

	AnonimousNumberListener() {
	}

	@Override
	public void numberGenerated(NumberEvent e) {
		System.out.println("Generated n=" + e.getN());
	}
}
