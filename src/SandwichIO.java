import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Sandwich App: Input Output class
 */
public class SandwichIO {
	private static final String fileName = "orderline.txt";
	
	/** 
     * This method appends the passed-in order’s content to the output text file, orderline.txt.
	 * @param o The order for the sandwich.
	 * @throws IOException
	 */
	public static void writeOrderToFile(Order o) throws IOException {
		
		//will automatically create the file if it doesn't already exist
		FileWriter fwrite = new FileWriter(fileName, true);
		try (PrintWriter outputFile = new PrintWriter(fwrite)) {
			outputFile.println(o);
			outputFile.close();
		}
	}
}
