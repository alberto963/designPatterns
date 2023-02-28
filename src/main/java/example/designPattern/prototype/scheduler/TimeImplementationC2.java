/**
 *
 */
package example.designPattern.prototype.scheduler;

/**
 * @author apetazzi
 *
 */
public class TimeImplementationC2 extends ClonableTime {

	/**
	 *
	 */
	long secs;

	/*
	 * (non-Javadoc)
	 *
	 * @see example.pattern.prototype.scheduler.ClonableTime#getHours()
	 */

	@Override
	int getHours() {
		return (int) (secs / 3600);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see example.pattern.prototype.scheduler.ClonableTime#getMinutes()
	 */

	@Override
	int getMinutes() {
		return (int) (secs % 3600) / 60;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see example.pattern.prototype.scheduler.ClonableTime#getSeconds()
	 */

	@Override
	int getSeconds() {
		return (int) (secs % 3600) % 60;
	}


	@Override
	void setTime(int h, int m, int s) {
		assert h < 24 && h >= 0;
		assert m < 60 && m >= 0;
		assert s < 60 && s >= 0;

		secs = h * 3600 + m * 60 + s;
	}

}
