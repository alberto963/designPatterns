package example.designPattern.abstractFactory.testDualDb2;

public class RemoteMode implements Connection {

	private String wwwConnection;

	public RemoteMode(String connName) {
		// connect to remote site
		wwwConnection = connName;
	}

	public String loadDb(String name) {
		// using wwwConnection return the file
		return null;
	}
}
