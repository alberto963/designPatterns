/**
 *
 */
package example.designPattern.abstractFactory.testDualDb2;

/**
 * @author apetazzi
 *
 */
public class LocalMode implements Connection {

	/**
	 *
	 */
	public LocalMode() {
		// noting to do
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * example.pattern.abstractFactory.testDualDb2.Local#loadDb(String)
	 */
	public String loadDb(String name) {
		// getting local repository return the requested file
		return null;
	}

}
