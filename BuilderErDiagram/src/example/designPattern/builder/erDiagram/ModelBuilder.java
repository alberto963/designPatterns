/**
 * 
 */
package example.designPattern.builder.erDiagram;

/**
 * @author apetazzi
 *
 */
public abstract class ModelBuilder {

	/**
	 * 
	 */
	public ModelBuilder() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	 void addEntity(String name) {
		
	}

	/**
	 * 
	 */
	 void addRelationship(String from, String to, String name) {
		
	}

	/**
	 * 
	 */
	 void addCardMin(String entity, String relation, String value) {
		
	}

	/**
	 * 
	 */
	 java.lang.Object getModel() {
		return null;
	}

}
