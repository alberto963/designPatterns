/**
 *
 */
package example.designPattern.abstractFactory.testDualDb2;

/**
 * @author apetazzi
 *
 */
public class LocalDataManager implements ConnectionFactory {

	/**
	 *
	 */
	public LocalDataManager() {

	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * example.pattern.abstractFactory.testDualDb2.ConnectionFactory#loadData(java.
	 * lang.String)
	 */
	public Connection getConnection(String name) {
		return new LocalMode();
	}

}
