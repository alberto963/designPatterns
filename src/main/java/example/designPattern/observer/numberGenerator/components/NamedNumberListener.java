package example.designPattern.observer.numberGenerator.components;

class NamedNumberListener implements INumberListener {
	private String name;

	NamedNumberListener(String name) {
		this.name = name;
	}


	public void numberGenerated(NumberEvent e) {
		System.out.println("Name=" + name + " Generated n=" + e.getN());
	}
}
