/**
 *
 */
package example.designPattern.prototype.scheduler;

/**
 * @author apetazzi
 *
 */
public abstract class ClonableTime implements Cloneable {

	/**
	 *
	 */
	abstract int getHours();

	/**
	 *
	 */
	abstract int getMinutes();

	/**
	 *
	 */
	abstract int getSeconds();

	/**
	 * cloneItself
	 *
	 * @throws CloneNotSupportedException
	 */
	ClonableTime cloneItself() throws CloneNotSupportedException {
		ClonableTime theClone = (ClonableTime) super.clone();

		return theClone;
	}

	/**
	 *
	 */
	abstract void setTime(int h, int m, int s);

}
