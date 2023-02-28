package example.designPattern.abstractFactory.testDualDb2;

public class LocalDataManager implements ConnectionFactory {

	public LocalDataManager() {
	}

	public Connection getConnection(String name) {
		return new LocalMode();
	}
}
