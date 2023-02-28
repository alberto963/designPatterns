/**
 *
 */
package example.designPattern.builder.erDiagram;

/**
 * @author apetazzi
 *
 */
public class NotOrientedErBuilder extends ModelBuilder {

	/**
	 *
	 */
	public NotOrientedErBuilder() {

	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * example.pattern.builder.erDiagram.ModelBuider#addCardMin(String,
	 * String, String)
	 */

	@Override
	void addCardMin(String entity, String relation, String value) {

		super.addCardMin(entity, relation, value);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * example.pattern.builder.erDiagram.ModelBuider#addEntity(String)
	 */

	@Override
	void addEntity(String name) {

		super.addEntity(name);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see example.pattern.builder.erDiagram.ModelBuider#addRelationship(java.lang.
	 * String, String, String)
	 */

	@Override
	void addRelationship(String from, String to, String name) {

		super.addRelationship(from, to, name);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see example.pattern.builder.erDiagram.ModelBuider#getModel()
	 */

	@Override
	Object getModel() {
		NotOrientedDiagram notOrientedDiagram = new NotOrientedDiagram();
		return notOrientedDiagram;
	}

}
