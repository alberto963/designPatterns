/**
 *
 */
package example.designPattern.proxy.fileHandler;

/**
 * @author apetazzi
 *
 */
public class ProxyFileHandler extends FileHandler {

	private FileHandler realHandler;
	private String lineText;
	private int requestedLine;

	/**
	 * @param fileName
	 */
	public ProxyFileHandler(String fileName) {
		super(fileName);

	}

	/*
	 * (non-Javadoc)
	 *
	 * @see example.pattern.proxy.fileHandler.FileHandler#getContent()
	 */

	@Override
	public String getContent() {
		if (realHandler == null)
			realHandler = new RealFileHandler(fileName);
		return realHandler.getContent();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see example.pattern.proxy.fileHandler.FileHandler#getLine(int)
	 */

	@Override
	public String getLine(int lineNum) {
		if (requestedLine == lineNum) {
			System.out.println("(accessing from proxy cache)");
			return lineText;
		} else {
			if (realHandler == null)
				realHandler = new RealFileHandler(fileName);
			lineText = realHandler.getLine(requestedLine);
			requestedLine = lineNum;
		}
		return lineText;
	}
}
