/**
 * 
 */
package example.desigPattern.abstractFactory.testHiFi;

/**
 * @author apetazzi
 * 
 *         ConcreteProduct: classe Tape
 * 
 *         Definisce il prodotto concreto creato dalla ConcreteFactory
 *         TapeDeviceFactory per il media da usare (nel Tape ovvero il Tape!)
 */
public class Tape implements Media {

	/**
	 * 
	 */
	public Tape() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	void save(Sound sound) {

	}

	/**
	 * 
	 */
	example.desigPattern.abstractFactory.testHiFi.Sound play() {
		return null;
	}

}
