/**
 * 
 */
package example.designPattern.startegy.arrayPrint;

/**
 * @author apetazzi
 * 
 */
public class MathFormat implements ArrayDisplayFormat {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * example.designPattern.startegy.arrayPrint.ArrayDisplayFormat#printData
	 * (int[])
	 */
	@Override
	public void printData(int[] arr) {
		for (int i = 0; i < arr.length; i++)
			System.out.println("Arr[ " + i + " ] = " + arr[i]);
	}

}
