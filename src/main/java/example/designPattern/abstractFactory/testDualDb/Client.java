package example.designPattern.abstractFactory.testDualDb;

public class Client {

	private ConnectionFactory connectionFactory;

	public Client(ConnectionFactory connectionFactory) {
		this.connectionFactory = connectionFactory;
	}

	public String loadData(Boolean local, String fileName) {
		String data = null;
		if (local) {
			Local lc = connectionFactory.getLocalConnection();
			data = lc.load(fileName);
		} else {
			Remote rc = connectionFactory.getRemoteConnection();
			data = rc.connect2WWW(fileName);
		}

		return data;
	}
}
