package example.designPattern.builder.traceReader;

public abstract class TestBuilder {

	protected UnitTestSuiteXml3 unitTestSuiteXml3;

	public TestBuilder() {
		unitTestSuiteXml3 = new UnitTestSuiteXml3();
	}

	void addRequest(UnitTestMessage hdr, UnitTestMessage msg) {

	}

	void addResponse(UnitTestMessage hdr, UnitTestMessage msg) {

	}

	UnitTestSuite getTestSuite() {
		return unitTestSuiteXml3;
	}
}
