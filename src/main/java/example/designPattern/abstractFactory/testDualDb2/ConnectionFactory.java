package example.designPattern.abstractFactory.testDualDb2;

public interface ConnectionFactory {

	/**
	 *
	 */
	Connection getConnection(String name);

}
