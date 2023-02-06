package example.desigPattern.abstractFactory.testHiFi;

/**
 * @author apetazzi
 * 
 *         ConcreteFactory: classe CdDevicesFactory
 * 
 *         Implementa l’AbstractFactory, fornendo le operazioni che creano e
 *         restituiscono gli oggetti corrispondenti ai prodotti specifici,
 *         ovvero i prodotti concreti (ConcreteProduct). In questo caso
 *         restituisce i prodotti di relativi al CD.
 */
public class CdDevicesFactory implements DevicesFactory {

	/**
	 * 
	 */
	public CdDevicesFactory() {
		// TODO Auto-generated constructor stub
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see example.pattern.abstractFactory.testHiFi.DevicesFactory#createMedia()
	 */
	@Override
	public Media createMedia() {
		return new Cd();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see example.pattern.abstractFactory.testHiFi.DevicesFactory#createPlayer()
	 */
	@Override
	public Player createPlayer() {
		return new CdPlayer();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see example.pattern.abstractFactory.testHiFi.DevicesFactory#createRecorder()
	 */
	@Override
	public Recorder createRecorder() {
		return new CdRecorder();
	}

}
