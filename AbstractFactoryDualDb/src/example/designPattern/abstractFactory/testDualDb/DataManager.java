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
		// TODO Auto-generated constructor stub
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @seeexample.pattern.abstractFactory.testDualDb.ConnectionFactory#
	 * getLocalConnection()
	 */
	@Override
	public Local getLocalConnection() {
		return new LocalMode();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @seeexample.pattern.abstractFactory.testDualDb.ConnectionFactory#
	 * getRemoteConnection()
	 */
	@Override
	public Remote getRemoteConnection() {
		return new RemoteMode();
	}

}
