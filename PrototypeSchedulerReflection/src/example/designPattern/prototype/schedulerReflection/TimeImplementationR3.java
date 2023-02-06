package example.designPattern.prototype.schedulerReflection;

public class TimeImplementationR3 extends Time {

	/*
	 * (non-Javadoc)
	 * 
	 * @see example.pattern.prototype.scheduler.ClonableTime#getHours()
	 */
	@Override
	int getHours() {
		return 0;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see example.pattern.prototype.scheduler.ClonableTime#getMinutes()
	 */
	@Override
	int getMinutes() {
		return 0;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see example.pattern.prototype.scheduler.ClonableTime#getSeconds()
	 */
	@Override
	int getSeconds() {
		return 0;
	}

	@Override
	void setTime(int h, int m, int s) {
		assert h < 24 && h >= 0;
		assert m < 60 && m >= 0;
		assert s < 60 && s >= 0;
	}
}
