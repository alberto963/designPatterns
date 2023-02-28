/**
 *
 */
package example.designPattern.templateMethod.orderManagment;

/**
 * @author apetazzi
 *
 */
public class GeneralItem extends ItemStock {
	String code;
	String name;
	int onHand;
	int inTransit;
	int backorders;

	public GeneralItem(String code, String name) {
		this.code = code;
		this.name = name;
	}

	public void setStock(int oh, int it, int bo) {
		onHand = oh;
		inTransit = it;
		backorders = bo;
	}


	@Override
	public String toString() {
		return code + " " + name + ". Inv. On Hand: " + onHand + " In Transit: " + inTransit + " Backorders: "
				+ backorders;
	}


	@Override
	void decreaseStock(int quantity) {
		onHand -= quantity;
		if (onHand < 0) {
			backorders += Math.abs(onHand);
			onHand = 0;
		}
	}


	@Override
	int getCurrentStock() {
		return onHand + inTransit - backorders;
	}


	@Override
	boolean validateQuantity(int quantity) {
		return (quantity >= 0);
	}

}
