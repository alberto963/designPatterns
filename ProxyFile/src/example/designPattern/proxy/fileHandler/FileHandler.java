/**
 * 
 */
package example.designPattern.proxy.fileHandler;

/**
 * @author apetazzi
 * 
 */
public abstract class FileHandler {

	/**
	 * 
	 */
	String fileName;

	/**
	 * @param fileName
	 * 
	 */
	public FileHandler(String fileName) {
		this.fileName = fileName;
	}

	/**
	 * 
	 */
	public abstract String getContent();

	/**
	 * 
	 */
	public abstract String getLine(int lineNum);

	/**
	 * 
	 */
	public String getFileName() {
		return fileName;
	}

}
