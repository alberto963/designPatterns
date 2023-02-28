/**
 *
 */
package example.designPattern.abstractFactory.testHiFi;

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

	}

	/**
	 *
	 */
	void save(Sound sound) {

	}

	/**
	 *
	 */
	example.designPattern.abstractFactory.testHiFi.Sound play() {
		return null;
	}

}
