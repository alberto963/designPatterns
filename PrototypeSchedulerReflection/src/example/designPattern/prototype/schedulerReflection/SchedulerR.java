package example.designPattern.prototype.schedulerReflection;

public class SchedulerR {

	private static Time endTime;

	public SchedulerR(Time endTime) {
		SchedulerR.endTime = endTime;
	}

	/**
	 * 
	 */
	static Time calculateEnd(Time start, int hours) {
		endTime = start.newItself();

		int h = start.getHours() + hours;
		int m = start.getMinutes();
		int s = start.getSeconds();
		endTime.setTime(h, m, s);

		return endTime;
	}
	
	/**
	 * 
	 */
	static Time calculateEnd(Time start, int hours, String name) {
		endTime = start.newItself(name);

		int h = start.getHours() + hours;
		int m = start.getMinutes();
		int s = start.getSeconds();
		endTime.setTime(h, m, s);

		return endTime;
	}
}
