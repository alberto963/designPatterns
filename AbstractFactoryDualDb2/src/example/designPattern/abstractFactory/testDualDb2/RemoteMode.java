/**
 * 
 */
package example.designPattern.abstractFactory.testDualDb2;

/**
 * @author apetazzi
 *
 */
public class RemoteMode implements Connection {

	/**
	 * 
	 */
	 java.lang.String wwwConnection;

	/**
	 * @param connName TODO
	 * 
	 */
	public RemoteMode(String connName) {
		// connect to remote site
		wwwConnection = connName;
	}

	/* (non-Javadoc)
	 * @see example.pattern.abstractFactory.testDualDb2.Local#loadDb(java.lang.String)
	 */
	@Override
	public String loadDb(String name) {
		// using wwwConnection return the file
		return null;
	}
}
