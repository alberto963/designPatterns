package example.designPattern.decorator.office;

public class TestOffice {

	public TestOffice() {
		Employee thisWillBeFamous = new Engineer("William Gateway",
				"Programming Department");
		thisWillBeFamous = new Administrative(thisWillBeFamous);
		thisWillBeFamous = new ProjectManager(thisWillBeFamous);
		thisWillBeFamous = new ProjectManager(thisWillBeFamous);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new TestOffice();
	}
}
