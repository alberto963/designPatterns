package example.designPattern.builder.erDiagram;

public abstract class ModelBuilder {

	public ModelBuilder() {
	}

	void addEntity(String name) {
	}

	void addRelationship(String from, String to, String name) {
	}

	void addCardMin(String entity, String relation, String value) {
	}

	Object getModel() {
		return null;
	}
}
