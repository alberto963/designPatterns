package example.designPattern.observer.numberGenerator.components;

public class TestNumberGenerator {

	public TestNumberGenerator() {
		INumberSubjectFactory numberSubject = new NumberSubject();
		INumberSubjectFactory zeroSubject = new ZeroSubject();
		INumberListener anonimousListener = new AnonimousNumberListener();
		INumberListener namedListener = new NamedNumberListener("namedListener");

		numberSubject.addNumberListener(anonimousListener);
		numberSubject.addNumberListener(namedListener);

		zeroSubject.addNumberListener(anonimousListener);
		zeroSubject.addNumberListener(namedListener);

		numberSubject.start(5);
		zeroSubject.start(5);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new TestNumberGenerator();
	}
}
