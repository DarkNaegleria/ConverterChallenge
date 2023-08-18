package panel.main;

/**
 * This class is the main class
 * It catch an NullPointerException in case the user cancels the program.
 * This class has two method, one for starting the program and one for terminating it.
 * @author Frvm96
 *
 */
public class RunProgram {
	
	public static void runProgram () {
		try {
		ConversionSelector conversionSelector = new ConversionSelector();
		SelectedConverterInitializer selectedConverterInitializer = new SelectedConverterInitializer(
				conversionSelector.getProgramSelected());
		} catch (NullPointerException e) {
			RunProgram.finishProgram();
		} 
	}
	
	public static void finishProgram () {
		EndPanel endPanel = new EndPanel();		
	}

	public static void main(String[] args) {
		runProgram ();
	}

}
