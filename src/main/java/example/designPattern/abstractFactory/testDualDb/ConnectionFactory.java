package example.designPattern.abstractFactory.testDualDb;

public interface ConnectionFactory {
	public Local getLocalConnection();
	public Remote getRemoteConnection();
}
