/**
 * 
 */
package example.designPattern.abstractFactory.testDualDb;

/**
 * @author apetazzi
 * 
 */
public class Client {

	private ConnectionFactory connectionFactory;

	/**
	 * 
	 */
	public Client(ConnectionFactory connectionFactory2) {
		connectionFactory = connectionFactory2;
	}

	/**
	 * @param fileName
	 * 
	 */
	java.lang.String loadData(Boolean local, String fileName) {
		String data = null;
		if (local) {
			Local lc = connectionFactory.getLocalConnection();
			data = lc.load(fileName);
		} else {
			Remote rc = connectionFactory.getRemoteConnection();
			data = rc.load(fileName);
		}
		
		return data;
	}

}
