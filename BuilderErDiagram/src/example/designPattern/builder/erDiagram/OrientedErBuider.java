/**
 * 
 */
package example.designPattern.builder.erDiagram;

/**
 * @author apetazzi
 *
 */
public class OrientedErBuider extends ModelBuilder {

	/**
	 * 
	 */
	public OrientedErBuider() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see example.pattern.builder.erDiagram.ModelBuider#addCardMin(java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	void addCardMin(String entity, String relation, String value) {
		// TODO Auto-generated method stub
		super.addCardMin(entity, relation, value);
	}

	/* (non-Javadoc)
	 * @see example.pattern.builder.erDiagram.ModelBuider#addEntity(java.lang.String)
	 */
	@Override
	void addEntity(String name) {
		// TODO Auto-generated method stub
		super.addEntity(name);
	}

	/* (non-Javadoc)
	 * @see example.pattern.builder.erDiagram.ModelBuider#addRelationship(java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	void addRelationship(String from, String to, String name) {
		// TODO Auto-generated method stub
		super.addRelationship(from, to, name);
	}

	/* (non-Javadoc)
	 * @see example.pattern.builder.erDiagram.ModelBuider#getModel()
	 */
	@Override
	Object getModel() {
		OrientedDiagram orientedDiagram = new OrientedDiagram();
		return orientedDiagram;
	}
}
