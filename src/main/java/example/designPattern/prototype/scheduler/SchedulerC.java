/**
 *
 */
package example.designPattern.prototype.scheduler;

/**
 * @author apetazzi
 *
 */
public class SchedulerC {

	private static ClonableTime endTime;

	public SchedulerC(ClonableTime endTime) {
		SchedulerC.endTime = endTime;
	}

	/**
	 * @throws CloneNotSupportedException
	 *
	 */
	static ClonableTime calculateEnd(ClonableTime start, int hours) throws CloneNotSupportedException {
		endTime = start.cloneItself();

		int h = start.getHours() + hours;
		int m = start.getMinutes();
		int s = start.getSeconds();
		endTime.setTime(h, m, s);

		return endTime;
	}
}
