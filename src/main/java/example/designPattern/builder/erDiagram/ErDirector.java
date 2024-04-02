package example.designPattern.builder.erDiagram;

public class ErDirector {

	private ModelBuilder modelBuilder;

	Object getModel() {
		modelBuilder.addEntity("E1");
		modelBuilder.addEntity("E2");
		modelBuilder.addRelationship("E1", "E2", "R1");
		modelBuilder.addCardMin("E1", "R1", "1");

		return modelBuilder.getModel();
	}

	public ErDirector(ModelBuilder modelBuilder) {
		this.modelBuilder = modelBuilder;
	}
}
