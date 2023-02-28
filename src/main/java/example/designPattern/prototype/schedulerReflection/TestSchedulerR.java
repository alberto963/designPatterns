package example.designPattern.prototype.schedulerReflection;

/**
 *
 */
public class TestSchedulerR {
	public TestSchedulerR() {
		Time timeImplementationR1 = new TimeImplementationR1();
		timeImplementationR1.setTime(10, 11, 12);
		Time endR1 = SchedulerR.calculateEnd(timeImplementationR1, 2);
		// do something with endR1
		System.out.println(endR1.getHours() + " " + endR1.getMinutes() + " " + endR1.getSeconds());

		Time timeImplementationR2 = new TimeImplementationR2();
		timeImplementationR2.setTime(10, 11, 12);
		Time endR2 = SchedulerR.calculateEnd(timeImplementationR2, 1);
		// do something with endR2
		System.out.println(endR2.getHours() + " " + endR2.getMinutes() + " " + endR2.getSeconds());

		Time endR3 = SchedulerR.calculateEnd(timeImplementationR2, 1,
				"example.pattern.prototype.schedulerReflection.TimeImplementationR3");
		// do something with endR3
		System.out.println(endR3.getHours() + " " + endR3.getMinutes() + " " + endR3.getSeconds());
	}

	/**
	 * @param args
	 * @throws CloneNotSupportedException
	 */
	public static void main(String[] args) throws CloneNotSupportedException {
		new TestSchedulerR();
	}
}
