/**
 *
 */
package example.designPattern.abstractFactory.testDualDb;

public class DataManager implements ConnectionFactory {

	public DataManager() {
	}

	public Local getLocalConnection() {
		return new LocalMode();
	}

	public Remote getRemoteConnection() {
		return new RemoteMode();
	}
}
