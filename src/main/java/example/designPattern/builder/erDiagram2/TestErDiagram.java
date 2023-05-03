package example.designPattern.builder.erDiagram2;

import example.designPattern.builder.erDiagram2.ErDiagram.ErDiagramBuilder;

public class TestErDiagram {

	public static void main(String[] args) {
		try {

			/*
			 * === 1
			 */
			ErDiagram.ErDiagramBuilder erdBuilder = new ErDiagramBuilder();
			ErDiagram diagram;
			diagram = erdBuilder.addEntity("E1").addEntity("E2").addRelationship("E1", "E2", "R1")
					.addCardMin("E1", "R1", "1").build();

			System.out.println(diagram);

			/*
			 * === 2
			 */
			ErDiagram.ErDiagramBuilder erdBuilder2 = new ErDiagramBuilder();
			erdBuilder2.addEntity("E1").addEntity("E2").addRelationship("E1", "E2", "R1").addCardMin("E1", "R1", "1");
			ErDiagram diagram2 = erdBuilder2.addEntity("E3").addEntity("E4").addRelationship("E3", "E4", "R2").build();

			System.out.println(diagram2);

			ErDiagram diagram3 = erdBuilder2.addEntity("E5").addEntity("E6").addRelationship("E5", "E7", "R3").build();
			System.out.println(diagram3);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
