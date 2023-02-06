/**
 * 
 */
package example.designPattern.builder.traceReader;

import java.util.LinkedList;
import java.util.List;

/**
 * @author apetazzi
 * 
 */
public class SnaTraceReaderDirector {

	private List<TestBuilder> testBuilder;

	/**
	 * 
	 */
	public SnaTraceReaderDirector(List<TestBuilder> testBuilder2) {
		testBuilder = testBuilder2;
		for (int i = 0; i < 10; i++) {
			// if it is a request
			for (TestBuilder tb : testBuilder) {
				tb.addRequest(null, null);
			}
			// else
			for (TestBuilder tb : testBuilder) {
				tb.addResponse(null, null);
			}
		}
	}

	/**
	 * 
	 */
	List<UnitTestSuite> getTestSuiteList() {
		List<UnitTestSuite> ret = new LinkedList<UnitTestSuite>();
		for (TestBuilder tb : testBuilder) {
			ret.add(tb.getTestSuite());
		}
		
		return ret;
	}

}
