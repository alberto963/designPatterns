/**
 *
 */
package example.designPattern.composite.computerStore;

/**
 * @author apetazzi
 *
 */
public abstract class Component {
	String name;

	public Component(String name) {
		this.name = name;
	}

	/**
	 * @throws Exception
	 *
	 */
	void add(Component component) throws Exception {
		throw new Exception();
	}

	/**
	 *
	 */
	void remove(Component component) throws Exception {
		throw new Exception();
	}

	/**
	 *
	 */
	Component getChild(int name) {
		return null;
	}

	void describe() {
		System.out.println("Component: " + name);
	}

}
