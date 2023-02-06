/**
 * 
 */
package example.desigPattern.abstractFactory.testHiFi;

/**
 * @author apetazzi
 * 
 *         ConcreteProduct: classe Cd
 * 
 *         Definisce il prodotto concreto creato dalla ConcreteFactory
 *         CdDeviceFactory per il media da usare (nel CD ovvero il CD!)
 */
public class Cd implements Media {

	/**
	 * 
	 */
	public Cd() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	void write(Sound sound) {

	}

	/**
	 * 
	 */
	example.desigPattern.abstractFactory.testHiFi.Sound read() {
		return null;
	}

}
