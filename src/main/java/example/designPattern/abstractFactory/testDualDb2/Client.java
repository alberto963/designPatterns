package example.designPattern.abstractFactory.testDualDb2;

public class Client {

	private ConnectionFactory connectionFactory;

	public Client(ConnectionFactory connectionFactory, String name) {
		this.connectionFactory = connectionFactory;

		Connection connection = this.connectionFactory.getConnection(name);

		@SuppressWarnings("unused")
		String data = connection.loadDb(name);
		// Do something with data
	}
}
