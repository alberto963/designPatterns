/**
 *
 */
package example.designPattern.abstractFactory.testDualDb2;

/**
 * @author apetazzi
 *
 */
public class RemoteDataManager implements ConnectionFactory {

	/**
	 *
	 */
	public RemoteDataManager() {

	}

	/*
	 * (non-Javadoc)
	 *
	 * @see example.pattern.abstractFactory.testDualDb2.ConnectionFactory#loadData
	 * (String)
	 */
	public Connection getConnection(String name) {
		return new RemoteMode(null);
	}
}
