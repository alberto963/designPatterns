/**
 * 
 */
package example.designPattern.startegy.arrayPrint;

/**
 * @author apetazzi
 * 
 */
public class StandardFormat implements ArrayDisplayFormat {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * example.designPattern.startegy.arrayPrint.ArrayDisplayFormat#printData
	 * (int[])
	 */
	@Override
	public void printData(int[] arr) {
		System.out.print("{ ");
		
		for (int i = 0; i < arr.length - 1; i++)
			System.out.print(arr[i] + ", ");
		
		System.out.println(arr[arr.length - 1] + " }");
	}

}
