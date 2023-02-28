package example.designPattern.abstractFactory.testDualDb2;

public class TestDualDb2 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		RemoteDataManager r = new RemoteDataManager();
		Client c1 = new Client(r, "fileName");

		LocalDataManager l = new LocalDataManager();
		Client c2 = new Client(l, "fileName");
	}
}
