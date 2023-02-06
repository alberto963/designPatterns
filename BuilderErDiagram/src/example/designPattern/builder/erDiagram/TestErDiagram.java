package example.designPattern.builder.erDiagram;

public class TestErDiagram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		OrientedDiagram od = (OrientedDiagram) new ErDirector(
				new OrientedErBuider()).getModel();
		@SuppressWarnings("unused")
		NotOrientedDiagram nod = (NotOrientedDiagram) new ErDirector(
				new NotOrientedErBuilder()).getModel();
	}
}
