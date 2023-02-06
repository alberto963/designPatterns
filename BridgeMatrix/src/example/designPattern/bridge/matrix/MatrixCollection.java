package example.designPattern.bridge.matrix;

public interface MatrixCollection {

	/**
	 * 
	 */
	void add(int x, int y, int v);

	/**
	 * 
	 */
	Position get(int x, int y);

	/**
	 * 
	 */
	void remove(int x, int y);
	
	/**
	 * 
	 */
	//public String toString();
}
