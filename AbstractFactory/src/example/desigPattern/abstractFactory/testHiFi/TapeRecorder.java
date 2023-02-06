/**
 * 
 */
package example.desigPattern.abstractFactory.testHiFi;

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
		// TODO Auto-generated constructor stub
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @seeexample.pattern.abstractFactory.Recorder#insert(example.pattern.
	 * abstractFactory.Media)
	 */
	@Override
	public void insert(Media media) {
		// TODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see example.pattern.abstractFactory.testHiFi.Recorder#play()
	 */
	@Override
	public void record(Sound sound) {
		// TODO Auto-generated method stub
	}

}
