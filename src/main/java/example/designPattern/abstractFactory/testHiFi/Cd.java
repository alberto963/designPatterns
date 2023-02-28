
package example.designPattern.abstractFactory.testHiFi;

/**
 * @author apetazzi
 *
 *         ConcreteProduct: classe Cd
 *
 *         Definisce il prodotto concreto creato dalla ConcreteFactory
 *         CdDeviceFactory per il media da usare (nel CD ovvero il CD!)
 */
public class Cd implements Media {

	public Cd() {
	}

	void write(Sound sound) {
	}

	Sound read() {
		return null;
	}
}
