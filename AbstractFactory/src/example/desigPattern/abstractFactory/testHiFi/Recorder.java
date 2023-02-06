package example.desigPattern.abstractFactory.testHiFi;

/**
 * 
 * @author apetazzi
 * 
 *         AbstractProduct: interfaccia Recorder
 * 
 *         Dichiara le operazioni che caratterizzano i diversi tipi generici di
 *         prodotti.
 * 
 *         In altre parole, questa interfaccia definisce il prodotto astratto
 *         che si concretizzera' nei diversi prodotti relativi al recording per
 *         Tape e CD.
 * 
 */
public interface Recorder {

	/**
	 * @param sound
	 *            TODO
	 * 
	 */
	void record(Sound sound);

	/**
	 * 
	 */
	void insert(Media media);

}
