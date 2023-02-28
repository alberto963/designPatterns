package example.designPattern.abstractFactory.testHiFi;

/**
 * @author apetazzi
 *
 *         ConcreteFactory: classe CdDevicesFactory
 *
 *         Implementa l�AbstractFactory, fornendo le operazioni che creano e
 *         restituiscono gli oggetti corrispondenti ai prodotti specifici,
 *         ovvero i prodotti concreti (ConcreteProduct). In questo caso
 *         restituisce i prodotti relativi al CD.
 */
public class CdDevicesFactory implements DevicesFactory {

	/**
	 *
	 */
	public CdDevicesFactory() {

	}

	/*
	 * (non-Javadoc)
	 *
	 * @see example.pattern.abstractFactory.testHiFi.DevicesFactory#createMedia()
	 */

	public Media createMedia() {
		return new Cd();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see example.pattern.abstractFactory.testHiFi.DevicesFactory#createPlayer()
	 */

	public Player createPlayer() {
		return new CdPlayer();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see example.pattern.abstractFactory.testHiFi.DevicesFactory#createRecorder()
	 */

	public Recorder createRecorder() {
		return new CdRecorder();
	}

}
