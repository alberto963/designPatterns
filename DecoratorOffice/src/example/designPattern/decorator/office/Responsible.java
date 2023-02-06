/**
 * 
 */
package example.designPattern.decorator.office;

/**
 * @author apetazzi
 * 
 */
public class Responsible implements Employee {
	protected Employee responsible;

	public Responsible(Employee responsible) {
		this.responsible = responsible;
	}

	@Override
	public String getName() {
		return responsible.getName();
	}

	@Override
	public String getOffice() {
		return responsible.getOffice();
	}
}
