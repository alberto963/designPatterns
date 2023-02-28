package example.designPattern.abstractFactory.testDualDb2;

public class RemoteDataManager implements ConnectionFactory {

	public RemoteDataManager() {
	}

	public Connection getConnection(String name) {
		return new RemoteMode(null);
	}
}
