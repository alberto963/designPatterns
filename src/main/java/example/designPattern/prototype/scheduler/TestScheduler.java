/**
 *
 */
package example.designPattern.prototype.scheduler;

/**
 * @author apetazzi
 *
 */
public class TestScheduler {

	/**
	 * @throws CloneNotSupportedException
	 *
	 */
	public TestScheduler() throws CloneNotSupportedException {
		ClonableTime timeImplementationC1 = new TimeImplementationC1();
		timeImplementationC1.setTime(10, 11, 12);
		ClonableTime endC1 = SchedulerC.calculateEnd(timeImplementationC1, 1);
		// do something with endC1
		System.out.println(endC1.getHours() + " " + endC1.getMinutes() + " " + endC1.getSeconds());

		ClonableTime timeImplementationC2 = new TimeImplementationC2();
		timeImplementationC2.setTime(10, 11, 12);
		ClonableTime endC2 = SchedulerC.calculateEnd(timeImplementationC2, 1);
		// do something with endC2
		System.out.println(endC2.getHours() + " " + endC2.getMinutes() + " " + endC2.getSeconds());
	}

	/**
	 * @param args
	 * @throws CloneNotSupportedException
	 */
	public static void main(String[] args) throws CloneNotSupportedException {
		new TestScheduler();
	}
}
