/**
 * 
 */
package example.designPattern.composite.computerStore;

import java.util.ArrayList;

/**
 * @author apetazzi
 * 
 */
public class CompoundPart extends Component {
	public CompoundPart(String name) {
		super(name);
	}

	ArrayList<Component> components = new ArrayList<Component>();

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * example.pattern.composite.computerStore.Component#add(example.pattern
	 * .composite.computerStore.Component)
	 */
	@Override
	void add(Component component) {
		components.add(component);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see example.pattern.composite.computerStore.Component#getChild(int)
	 */
	@Override
	Component getChild(int name) {
		return components.get(name);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * example.pattern.composite.computerStore.Component#remove(example.pattern
	 * .composite.computerStore.Component)
	 */
	@Override
	void remove(Component component) {
		components.remove(component);
	}

	@Override
	void describe() {
		System.out.println("Component: " + name);
		System.out.println("Composed by:");
		System.out.println("{");
		for (Component c : components)
			c.describe();

		System.out.println("}");
	}
}
