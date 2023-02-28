/**
 *
 */
package example.designPattern.flyweight.eventQueue;

import java.util.Hashtable;

/**
 * @author apetazzi
 *
 */
public class EventSymbolFactory {

	private static Hashtable<String, EventSymbol> events = new Hashtable<String, EventSymbol>();

	public static EventSymbol newEventSymbol(String evnt) {
		EventSymbol eventSymbol = events.get(evnt);
		if (eventSymbol == null) {
			eventSymbol = new EventSymbol(evnt);
			events.put(evnt, eventSymbol);
		}

		return eventSymbol;
	}
}
