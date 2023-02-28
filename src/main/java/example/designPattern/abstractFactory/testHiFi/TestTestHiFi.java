package example.designPattern.abstractFactory.testHiFi;

public class TestTestHiFi {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Client client1 = new Client(new TapeDevicesFactory(), new Song("x"));
		@SuppressWarnings("unused")
		Client client2 = new Client(new CdDevicesFactory(), new Song("y"));
	}

}
