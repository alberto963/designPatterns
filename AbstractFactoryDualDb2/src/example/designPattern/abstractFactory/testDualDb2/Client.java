/**
 * 
 */
package example.designPattern.abstractFactory.testDualDb2;

/**
 * @author apetazzi
 *
 */
public class Client {

	private ConnectionFactory connectionFactory;

	/**
	 * @param name 
	 * 
	 */
	public Client(ConnectionFactory connectionFactory2, String name) {
		connectionFactory = connectionFactory2;
		Connection connection = connectionFactory.getConnection(name);
		@SuppressWarnings("unused")
		String data = connection.loadDb(name);
		//Do something with data
		
	}
}
