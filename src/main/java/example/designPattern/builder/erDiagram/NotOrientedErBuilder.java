package example.designPattern.builder.erDiagram;

public class NotOrientedErBuilder extends ModelBuilder {

	public NotOrientedErBuilder() {
	}

	@Override
	void addCardMin(String entity, String relation, String value) {
		super.addCardMin(entity, relation, value);
	}

	@Override
	void addEntity(String name) {
		super.addEntity(name);
	}

	@Override
	void addRelationship(String from, String to, String name) {
		super.addRelationship(from, to, name);
	}

	@Override
	Object getModel() {
		NotOrientedDiagram notOrientedDiagram = new NotOrientedDiagram();

		return notOrientedDiagram;
	}
}
