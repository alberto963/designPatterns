/**
 *
 */
package example.designPattern.abstractFactory.testHiFi;

/**
 * @author apetazzi
 *
 *         ConcreteProduct: classe TapeRecorder
 *
 *         Definisce il prodotto concreto creato dalla ConcreteFactory
 *         TapeDeviceFactory per il recorder da provare con il Tape
 *
 */
public class TapeRecorder implements Recorder {

	/**
	 *
	 */
	public TapeRecorder() {

	}

	/*
	 * (non-Javadoc)
	 *
	 * @seeexample.pattern.abstractFactory.Recorder#insert(example.pattern.
	 * abstractFactory.Media)
	 */

	public void insert(Media media) {


	}

	/*
	 * (non-Javadoc)
	 *
	 * @see example.pattern.abstractFactory.testHiFi.Recorder#play()
	 */

	public void record(Sound sound) {

	}

}
