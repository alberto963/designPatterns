/**
 *
 */
package example.designPattern.templateMethod.orderManagment;

/**
 * @author apetazzi
 *
 */
public class VeryRestrictedItem extends ItemStock {
	String code;
	String name;
	int currentQuantity;
	int maxLotSize;

	public VeryRestrictedItem(String code, String name, int maxLotSize) {
		this.code = code;
		this.name = name;
		this.maxLotSize = maxLotSize;
	}

	public void setStock(int quantity) {
		currentQuantity = quantity;
	}


	@Override
	public String toString() {
		return code + " " + name + " " + currentQuantity + " (Max. Lot Size: " + maxLotSize + ")";
	}


	@Override
	void decreaseStock(int quantity) {
		currentQuantity -= quantity;
	}


	@Override
	int getCurrentStock() {
		return currentQuantity;
	}


	@Override
	boolean validateQuantity(int quantity) {
		if (quantity >= 0 && quantity <= Math.min(currentQuantity, maxLotSize))
			return true;
		return false;
	}
}
