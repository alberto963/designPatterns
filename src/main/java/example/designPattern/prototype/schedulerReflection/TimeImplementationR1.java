package example.designPattern.prototype.schedulerReflection;

public class TimeImplementationR1 extends Time {

	/**
	 *
	 */
	int h = 0;
	/**
	 *
	 */
	int m = 0;
	/**
	 *
	 */
	int s = 0;

	/*
	 * (non-Javadoc)
	 *
	 * @see example.pattern.prototype.scheduler.ClonableTime#getHours()
	 */

	@Override
	int getHours() {
		return h;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see example.pattern.prototype.scheduler.ClonableTime#getMinutes()
	 */

	@Override
	int getMinutes() {
		return m;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see example.pattern.prototype.scheduler.ClonableTime#getSeconds()
	 */

	@Override
	int getSeconds() {
		return s;
	}


	@Override
	void setTime(int h, int m, int s) {
		assert h < 24 && h >= 0;
		assert m < 60 && m >= 0;
		assert s < 60 && s >= 0;

		this.h = h;
		this.m = m;
		this.s = s;
	}

}
