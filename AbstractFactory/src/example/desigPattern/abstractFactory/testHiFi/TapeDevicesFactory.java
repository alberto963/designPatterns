package example.desigPattern.abstractFactory.testHiFi;

/**
 * @author apetazzi
 * 
 *         ConcreteFactory: classe TapeDevicesFactory
 * 
 *         Implementa l’AbstractFactory, fornendo le operazioni che creano e
 *         restituiscono gli oggetti corrispondenti ai prodotti specifici,
 *         ovvero i prodotti concreti (ConcreteProduct). In questo caso
 *         restituisce i prodotti di relativi al tape.
 */
public class TapeDevicesFactory implements DevicesFactory {

	public TapeDevicesFactory() {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see example.pattern.abstractFactory.testHiFi.DevicesFactory#createMedia()
	 */
	@Override
	public Media createMedia() {
		return new Tape();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see example.pattern.abstractFactory.testHiFi.DevicesFactory#createPlayer()
	 */
	@Override
	public Player createPlayer() {
		return new TapePlayer();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see example.pattern.abstractFactory.testHiFi.DevicesFactory#createRecorder()
	 */
	@Override
	public Recorder createRecorder() {
		return new TapeRecorder();
	}
}
