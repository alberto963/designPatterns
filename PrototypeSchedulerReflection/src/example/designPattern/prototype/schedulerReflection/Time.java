/**
 * 
 */
package example.designPattern.prototype.schedulerReflection;

import java.lang.reflect.InvocationTargetException;

import example.designPattern.prototype.schedulerReflection.Time;

/**
 * @author apetazzi
 * 
 */
public abstract class Time {

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
	 * 
	 */
	Time newItself() {

		try {
			return (Time) getClass().getDeclaredConstructor().newInstance();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

	/**
	 * 
	 */
	Time newItself(String name) {
		try {
			return (Time) Class.forName(name).getDeclaredConstructor().newInstance();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

	/**
	 * 
     */
	abstract void setTime(int h, int m, int s);
}
