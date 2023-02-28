/**
 *
 */
package example.designPattern.abstractFactory.testDualDb;

/**
 * @author apetazzi
 *
 */
public class DataManager implements ConnectionFactory {

	/**
	 *
	 */
	public DataManager() {

	}

	/*
	 * (non-Javadoc)
	 *
	 * @see example.pattern.abstractFactory.testDualDb.ConnectionFactory#
	 * getLocalConnection()
	 */
	public Local getLocalConnection() {
		return new LocalMode();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @seeexample.pattern.abstractFactory.testDualDb.ConnectionFactory#
	 * getRemoteConnection()
	 */
	public Remote getRemoteConnection() {
		return new RemoteMode();
	}

}
