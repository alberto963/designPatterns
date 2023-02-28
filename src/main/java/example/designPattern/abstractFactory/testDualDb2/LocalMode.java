package example.designPattern.abstractFactory.testDualDb2;

public class LocalMode implements Connection {

	public LocalMode() {
		// noting to do
	}

	public String loadDb(String name) {
		// getting local repository return the requested file
		return null;
	}
}
