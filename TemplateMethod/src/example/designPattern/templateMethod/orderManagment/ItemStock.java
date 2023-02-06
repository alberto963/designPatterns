/**
 * 
 */
package example.designPattern.templateMethod.orderManagment;

/**
 * @author apetazzi
 * 
 */
public abstract class ItemStock {

	/**
	 * remove
	 */
	boolean remove(int quantity) {
		if (!validateQuantity(quantity)) {

			return false;
		}

		if (getCurrentStock() >= quantity) {
			decreaseStock(quantity);

			return true;
		}

		return false;
	}

	/**
	 * validateQuantity
	 * 
	 * @return boolean
	 * 
	 */
	abstract boolean validateQuantity(int quantity);

	/**
	 * 
	 */
	abstract int getCurrentStock();

	/**
	 * 
	 */
	abstract void decreaseStock(int quantity);
}
