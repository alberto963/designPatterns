package example.designPattern.observer.numberGenerator.components;

interface INumberSubjectFactory {
	void addNumberListener(INumberListener listener);

	void removeNumberListener(INumberListener listener);

	void start(int n);

	void fireNewNumber();
}
