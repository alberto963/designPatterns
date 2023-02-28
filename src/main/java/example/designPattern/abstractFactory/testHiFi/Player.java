package example.designPattern.abstractFactory.testHiFi;

/**
 *
 * @author apetazzi
 *
 *         AbstractProduct: interfaccia Player
 *
 *         Dichiara le operazioni che caratterizzano i diversi tipi generici di
 *         prodotti.
 *
 *         In altre parole, questa interfaccia definisce il prodotto astratto
 *         che si concretizzera' nei diversi prodotti relativi al play per Tape
 *         e CD.
 *
 */
public interface Player {

	/**
	 *
	 */
	void play();

	/**
	 *
	 */
	void insert(Media media);

}
