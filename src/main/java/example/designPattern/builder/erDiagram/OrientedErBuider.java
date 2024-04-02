package example.designPattern.builder.erDiagram;

public class OrientedErBuider extends ModelBuilder {

	public OrientedErBuider() {
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
		OrientedDiagram orientedDiagram = new OrientedDiagram();

		return orientedDiagram;
	}
}
