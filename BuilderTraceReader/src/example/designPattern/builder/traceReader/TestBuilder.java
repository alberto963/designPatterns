/**
 * 
 */
package example.designPattern.builder.traceReader;

/**
 * @author apetazzi
 * 
 */
public abstract class TestBuilder {

	protected UnitTestSuiteXml3 unitTestSuiteXml3;

	/**
	 * 
	 */
	public TestBuilder() {
		unitTestSuiteXml3 = new UnitTestSuiteXml3();
	}

	/**
	 * 
	 */
	void addRequest(UnitTestMessage hdr, UnitTestMessage msg) {

	}

	/**
	 * 
	 */
	void addResponse(UnitTestMessage hdr, UnitTestMessage msg) {

	}

	/**
	 * 
	 */
	example.designPattern.builder.traceReader.UnitTestSuite getTestSuite() {
		return unitTestSuiteXml3;
	}
}
