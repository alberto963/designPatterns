/**
 *
 */
package example.designPattern.abstractFactory.testHiFi;

/**
 * @author apetazzi
 *
 *         La classe Client definisce gli oggetti che utilizzano i prodotti
 *         d�ogni famiglia.
 */
public class Client {

	private Sound sound;

	/**
	 * Rappresenta la factory dell' oggetto da testare vista nella sua forma
	 * astratta. E' quindi utilizzato per creare oggetti concreti delle diverse
	 * tecnologie
	 */
	private DevicesFactory devicesFactory;

	/**
	 *
	 */
	public Client(DevicesFactory devicesFactory2, Sound sound2) {
		devicesFactory = devicesFactory2;
		sound = sound2;

		test(sound2);
	}

	/**
	 * Il metodo test crea una istanza d�ogni particolare tipo di prodotto e applica
	 * i diversi metodi forniti dalle interfacce che implementano i prodotti. Si
	 * deve notare che il cliente utilizza i prodotti, senza avere conoscenza di
	 * quali sono concretamente questi.
	 */
	void test(Sound sound2) {
		sound = sound2;
		Media media = devicesFactory.createMedia();
		Recorder recorder = devicesFactory.createRecorder();
		Player player = devicesFactory.createPlayer();
		recorder.insert(media);
		System.out.println("Recording the song : " + sound);
		recorder.record(sound);
		System.out.println("Listening the record:");
		recorder.insert(media);
		player.play();
	}

	/**
	 * Il metodo selectTechnology riceve un oggetto corrispondente ad una famiglia
	 * particolare e lo registra dentro i propri attributi.
	 */
	void selectTechnology(DevicesFactory technology) {
		devicesFactory = technology;
	}

}
