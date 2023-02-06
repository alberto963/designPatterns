package example.designPattern.abstractFactory.testDualDb2;

public class TestDualDb2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		RemoteDataManager r = new RemoteDataManager();
		new Client(r, "fileName");

		LocalDataManager l = new LocalDataManager();
		new Client(l, "fileName");
	}
}
