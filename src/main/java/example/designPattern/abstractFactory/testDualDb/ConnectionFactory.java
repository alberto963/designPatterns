package example.designPattern.abstractFactory.testDualDb;

public interface ConnectionFactory {

	/**
	 *
	 */
	Local getLocalConnection();

	/**
	 *
	 */
	Remote getRemoteConnection();

}
